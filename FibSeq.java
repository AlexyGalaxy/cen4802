package cen4802c;

import java.util.Scanner;

/**
 * The FibSeq asks the user to enter a number greater than -1 then calculates and displays the
 * position of that number within the Fibononacci Sequence
 * 
 * @author Alex V
 * @date 1/20/2023
 */

public class FibSeq {
	/**
	 * This is the where the nth number of the Fibononacci Sequence is calculated.
	 * 
	 * @param i The user's input is put into the Fibononacci Sequence
	 * @return The Fibononacci Sequence is calculated depending on the user's input
	 */
	public static int rFibFun(int i){
		if(i == 0) {
			return 0;
		}if(i == 1 || i == 2) {
			return 1;
		}
		return rFibFun(i-1) + rFibFun(i-2);
	}
	
	/**
	 * The user is welcomed to the program and told to exit press -1. If the user enters a value equal 
	 * to or lower than -2 they will receive an error message stating to enter a number greater than 0.
	 * Once the user enters a number greater than or equal to 0 they will see that value's position within
	 * the Fibononacci Sequence. If the user enters in a string the program will not work correctly.
	 * 
	 * @param args 
	 * @param x The N'th number of the Fibononacci Sequence. This number needs to be greater than -1
	 * @param userInput The user's Input Variable. This number needs to be greater than -1
	 * @param scrn The Scanner class used to get the user's input. Will only accept numbers greater than -1.
	 */
	public static void main(String[] args) {
		int x = 0;
		boolean firstRun = true; 
		boolean secondRun = false;
		boolean thirdRun = false;
		String userInput = null;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Fibononacci Sequence !");
		System.out.println("Enter -1 to Exit !\n");
		
		while(x != -1) {
			System.out.println("Please enter a number which represents a position within Fibononacci Sequence.");

			if (firstRun == true) {
				x = 10;
				firstRun = false;
				secondRun = true;
			}else if (secondRun == true) {
				x = 20;
				secondRun = false;
				thirdRun = true;
			}else if (thirdRun == true) {
				x = -2;
				thirdRun = false;
			}
			else {
				x = -1;
			}

			if(x<=-2)
				System.out.println("User Input " + x + ". Error: Please enter a number greater than -1.\n");
			else if(x!=-1) {
				System.out.println("The " + x + " term of the Fibonacci sequence is " + rFibFun(x)+"\n");
			}else {
				System.out.println("User Entered -1\n");
				System.out.println("Program Terminated.");
				break;
			}
		}
	}
}