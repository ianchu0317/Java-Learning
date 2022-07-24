package main.java.com.w3resource.basic.part1;

import java.util.Scanner;

/*
 * Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		var n = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	
		input.close();
	}
}
