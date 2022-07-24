package main.java.com.w3resource.basic.part1;

import java.util.Scanner;

/*
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/


public class Exercise6 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		
		// Output all results
		System.out.println("Results are: ");
		System.out.println( n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println( n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println( n1 + " X " + n2 + " = " + (n1 * n2));
		System.out.println( n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println( n1 + " mod " + n2 + " = " + (n1 % n2));
	
		input.close();
	}

}
