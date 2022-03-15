package com.revature;

public class Launcher {

	public static void main(String[] args) {
		//Create stack Object
		Stack s = new Stack(); 
		
		//Stack with 5 values
		s.push(3); 
		s.push(7); 
		s.push(8); 
		s.push(10); 
		s.push(2); 
		
		//show elements of array
		s.showArr(); 
				
		//pop
		s.pop(); 
		
		//test to see if element has been removed
		s.showArr(); 
		
		//show max element
		s.max();
	}

}
