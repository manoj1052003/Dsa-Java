package com.dream11;
import java.util.*;

public class predict {
    public static void main(String[] args) {
        // Step 1: Create 4 HashMaps (25 total players)
    	// map1 = batsman
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Alex", 8.5);    map1.put("Bella", 7.2);  map1.put("Chris", 9.1);
        map1.put("Diana", 6.8);   map1.put("Ethan", 5.5);  map1.put("Fiona", 7.7);
        
        //map2 = wicket keeper
        HashMap<String, Double> map2 = new HashMap<>();
        map2.put("George", 6.0); map2.put("Hannah", 8.3); map2.put("Ian", 4.9);
        map2.put("Julia", 7.4);   map2.put("Kevin", 5.8);  map2.put("Luna", 6.6);

        // map3 = all rounder
        HashMap<String, Double> map3 = new HashMap<>();
        map3.put("Mike", 7.9);    map3.put("Nina", 6.2);  map3.put("Oscar", 8.0);
        map3.put("Penny", 5.1);   map3.put("Quinn", 4.7); map3.put("Ryan", 9.3);

        //map4 = bowler
        HashMap<String, Double> map4 = new HashMap<>();
        map4.put("Sarah", 6.4);   map4.put("Tom", 7.5);    map4.put("Uma", 5.9);
        map4.put("Vince", 8.7);   map4.put("Wendy", 4.3); map4.put("Xander", 6.1);
        map4.put("Zoe", 5.0);

        // Step 2: Assign map IDs to each player (to track origin)
        Map<String, Integer> playerToMapId = new HashMap<>();
        List<String> allPlayers = new ArrayList<>();
        List<Double> allValues = new ArrayList<>();
        
        int mapId = 1;
        for (Map.Entry<String, Double> entry : map1.entrySet()) {
            playerToMapId.put(entry.getKey(), mapId);
            allPlayers.add(entry.getKey());
            allValues.add(entry.getValue());
        }
        mapId++;
        for (Map.Entry<String, Double> entry : map2.entrySet()) {
            playerToMapId.put(entry.getKey(), mapId);
            allPlayers.add(entry.getKey());
            allValues.add(entry.getValue());
        }
        mapId++;
        for (Map.Entry<String, Double> entry : map3.entrySet()) {
            playerToMapId.put(entry.getKey(), mapId);
            allPlayers.add(entry.getKey());
            allValues.add(entry.getValue());
        }
        mapId++;
        for (Map.Entry<String, Double> entry : map4.entrySet()) {
            playerToMapId.put(entry.getKey(), mapId);
            allPlayers.add(entry.getKey());
            allValues.add(entry.getValue());
        }

        // Step 3: Generate valid teams
        List<List<String>> validTeams = new ArrayList<>();
        generateTeams(allPlayers, allValues, playerToMapId, new ArrayList<>(), 0, 0.0, 11, 100.0, new HashSet<>(), validTeams);

        // Step 4: Print results (first 5 teams for brevity)
        System.out.println("Valid Teams (Sum ≤ 100, 1+ from each map):");
        int maxTeamsToShow = 5;
        for (int i = 0; i < Math.min(maxTeamsToShow, validTeams.size()); i++) {
            List<String> team = validTeams.get(i);
            double sum = team.stream().mapToDouble(p -> allValues.get(allPlayers.indexOf(p))).sum();
            System.out.println((i + 1) + ". " + team + " (Sum: " + sum + ")");
        }
        System.out.println("\nTotal valid teams found: " + validTeams.size());
    }

    private static void generateTeams(
            List<String> players, List<Double> values, Map<String, Integer> playerToMapId,
            List<String> currentTeam, int start, double currentSum,
            int teamSize, double maxSum, Set<Integer> representedMaps,
            List<List<String>> validTeams) {

        if (currentTeam.size() == teamSize) {
            if (currentSum <= maxSum && representedMaps.size() == 4) { // All 4 maps represented
                validTeams.add(new ArrayList<>(currentTeam));
            }
            return;
        }

        for (int i = start; i < players.size(); i++) {
            String player = players.get(i);
            double value = values.get(i);
            int playerMapId = playerToMapId.get(player);

            if (currentSum + value > maxSum) {
                continue; // Skip if sum exceeds 100
            }

            Set<Integer> newRepresentedMaps = new HashSet<>(representedMaps);
            newRepresentedMaps.add(playerMapId);

            // Prune if remaining slots can't cover missing maps
            int remainingSlots = teamSize - currentTeam.size() - 1;
            int missingMaps = 4 - newRepresentedMaps.size();
            if (remainingSlots < missingMaps) {
                continue;
            }

            currentTeam.add(player);
            generateTeams(players, values, playerToMapId, currentTeam, i + 1, currentSum + value, 
                         teamSize, maxSum, newRepresentedMaps, validTeams);
            currentTeam.remove(currentTeam.size() - 1); // Backtrack
        }
    }
}