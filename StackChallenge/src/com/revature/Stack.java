package com.revature;

import java.util.EmptyStackException;

public class Stack {

	// Create array
	private int stackArr[] = new int[5];
	private int topOfArr = 0;

	// push method
	public void push(int data) {

		stackArr[topOfArr] = data;
		topOfArr++;
	}
	
	//show elements of stack
	public void showArr() {
		System.out.println("printing out stack "); 
		for(int i : stackArr) {
			
			System.out.print(i + " ");
		}
		System.out.println(); 
	}
	
	//pop
	public int pop() throws EmptyStackException{
		
		if(stackArr[0] != 0) { //runs if stack is not empty
			int data; 
			
			data = stackArr[topOfArr - 1]; //set return to topmost value in stack 
			
			System.out.println("Popped element is: " + data);
			
			stackArr[topOfArr - 1] = 0; //set top value to zero to remove element from stack
			
			return data; 
		} else //runs if stack is empty
			throw new EmptyStackException(); 
		
	}
	
	//return max value in stack
	public int max() throws EmptyStackException{
		if(stackArr[0] != 0) {
			int max = stackArr[0]; 
			
			for(int i : stackArr) {
				if(max < i)
					max = i; 
			}
			System.out.println("Max element is: " + max);
			return max; 
			
		} else
			throw new EmptyStackException(); 
	}
	

//---------------------------------------------boilerplate code--------------------------------------------
	public Stack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stack(int[] stackArr) {
		super();
		this.stackArr = stackArr;
	}

	public int[] getStackArr() {
		return stackArr;
	}

	public void setStackArr(int[] stackArr) {
		this.stackArr = stackArr;
	}

	public int getTopOfArr() {
		return topOfArr;
	}

	public void setTopOfArr(int topOfArr) {
		this.topOfArr = topOfArr;
	}
	
	

}