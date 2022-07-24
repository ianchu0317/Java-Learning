package main.java.com.w3resource.basic.part1;

/*
 * 
 * Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 * 
 * 
 * */

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Input first number: ");
			int n1 = input.nextInt();
		
			System.out.print("Input second number: ");
			int n2 = input.nextInt();
		
			System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
	
		} catch(Exception e) {
			System.out.println("Error found\n" + e.getMessage());
		}
	
		input.close();
	}
}
