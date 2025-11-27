package com.april;
import java.util.*;

public class switchcas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String day;
		switch(n) {
		
		case 1 :
			System.out.println("monday");
			day="weekday";
			break;
			
		case 2 :
			System.out.println("tuesday");
			day="weekday";
			break;
			
		case 3 :
			System.out.println("wednesday");
			day="weekday";
			break;
			
		case 4 :
			System.out.println("thursday");
			day="weekday";
			break;
			
		case 5 :
			System.out.println("friday");
			day="weekday";
			break;
			
		case 6 :
			System.out.println("saturday");
			day="weekend";
			break;
			
		case 7 :
			System.out.println("sundaY");
			day="weekend";
			break;
			
		default :
			System.out.println("no day");
			day="no day";
			break;
		}
		
		switch(day) {
		
		case "weekday":
			System.out.println(day +" "+"class day");
			break;
			
		default:
			System.out.println(day+" "+"party day");
			break;
		}
		
		
		
	}

}
