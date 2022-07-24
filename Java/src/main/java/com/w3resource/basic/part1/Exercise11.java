package main.java.com.w3resource.basic.part1;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
/*
 * 	Write a Java program to print the area and perimeter of a circle. Go to the editor
	Test Data:
	Radius = 7.5
	Expected Output
	Perimeter is = 47.12388980384689
	Area is = 176.71458676442586
 * 
 * */

public class Exercise11 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		float radius = input.nextFloat();
		
		double perimeter = 2 * PI * radius;
		double area = PI * pow(radius, 2);
		
		// Print out result 
		System.out.println("Radius is = " + radius);
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
		
		input.close();
	}
}
