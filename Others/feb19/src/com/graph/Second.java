package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

class AdjList{
	List<List<Integer>> list;
	AdjList(int vertices) {
		list = new ArrayList<>();  //list = {{},{},{},{},{}}
		for(int i=0; i<vertices; i++) {
			list.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int src, int des) {
		list.get(src).add(des);
		list.get(des).add(src);
	}
	
	public void print() {
		for(int i=0; i<list.size(); i++) {
			System.out.print(i+" --> ");
			for(int node : list.get(i)) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}
	public void Bfs(int start) {
		boolean [] visited = new boolean [list.size()];
		System.out.println(Arrays.toString(visited));
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.add(start); //q = {2,3,4}
		while(!q.isEmpty()) {
			int node = q.poll(); // 2
			System.out.print(node+" ");
			for(int neighbor : list.get(node)) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					q.add(neighbor);
				}
			}
		}
		
	}
	
}

public class Second {

	public static void main(String[] args) {
		AdjList g = new AdjList(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		//g.print();
		g.Bfs(0);
		
		//boolean [] visited = new boolean [6];
		//System.out.println(Arrays.toString(visited));
		
		

	}

}
