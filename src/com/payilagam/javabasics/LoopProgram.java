package com.payilagam.javabasics;

import java.util.Scanner;

public class LoopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Please enter no. of students");
		 
	
		Scanner scannerObj = new Scanner(System.in);
				int studentCount = scannerObj.nextInt();
				
				int english[] = new int[studentCount]; 
				
		// I am starting my for loop here
		// while(count<maxCount){
		for (count = 0; count < studentCount; count++) {
			System.out.print("Please enter english marks");
			 english[count] =  scannerObj.nextInt(); 
			System.out.print("Please enter maths marks");
			int maths = scannerObj.nextInt();
			System.out.print("Please enter science marks");
			double science = scannerObj.nextFloat();
			double total = english[count] + maths + science;
			System.out.println("Your total is " + total);
			// count = count+1;
		}

	}

}
