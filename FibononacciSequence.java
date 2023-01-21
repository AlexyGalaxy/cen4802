package cen4802c;

import java.util.Scanner;

public class FibononacciSequence {
	public static int rFibFun(int count){
		if(count == 0) {
			return 0;
		}if(count == 1 || count == 2) {
			return 1;
		}
		return rFibFun(count-1) + rFibFun(count-2);
	}
	
	public static void main(String[] args) {
		int x = 0;
		String userInput = null;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Fibononacci Sequence !");
		System.out.println("Enter -1 to Exit !\n");
		
		while(x!=-1) {
			System.out.println("Please enter a number which represents a position within Fibononacci Sequence.");
			userInput= scnr.nextLine();
			x = Integer.parseInt(userInput);
			
			if(x!=-1) {
				System.out.println("The "+x+" term of the Fibonacci sequence is " + rFibFun(x)+"\n");
			}else {
				System.out.println("Exiting Fibononacci Sequence.");
				break;
			}
		}
	}
}
