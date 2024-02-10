package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

		// ToDo 7: Add a toString method for Student class

		Student std1= new Student("James", (short) 20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		// Uses scanner to set GPA for std1
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double gpaInput = scanner.nextDouble();
		std1.setGpa(gpaInput);

		// Uses the toString method to print name, age, and GPA
		System.out.println(std1.toString());
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}