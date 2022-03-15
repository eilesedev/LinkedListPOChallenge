package com.revature;

import java.util.LinkedList;

public class Launcher {
	

	public static void main(String[] args) {
		
		//Create LinkedList one
		LinkedList<Integer> one = new LinkedList<>(); 
		one.add(3); 
		one.add(7); 
		one.add(8); 
		one.add(10);

		//Create LinkedList two
		LinkedList<Integer> two = new LinkedList<>(); 
		two.add(99); 
		two.add(1); 
		two.add(8); 
		two.add(10); 
		
		//Iterate through LinkedList one 
		for(int each : one) {
			//compare with LinkedList two
			if(two.contains(each)) {
				System.out.println(each);
				return; //break at first equivalent value
			}
				
		}
	}

}
