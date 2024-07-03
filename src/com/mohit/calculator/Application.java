// 4.4.2

package com.mohit.calculator;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Process CLI arguments
        } else {
            // No CLI arguments, ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide):");
            String operation = scanner.next();
            // Further processing based on operation
            
            switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter the first operand:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double num2 = scanner.nextDouble();
                System.out.println("Result: " + add(num1, num2));
                break;
            case "factorial":
                System.out.println("Enter a number:");
                double number = scanner.nextDouble();
                System.out.println("Result: " + factorial(number));
                break;
            // Handle other operations
        }
    }
    
}

    // Other Methods' placeholders
    



public static double add(double a, double b) { // a would be the first number to add and b would be the second
	return a + b; //returning the sum of both the numbers added together
}

public static double factorial(double n) { // this calculates the factorial of a number
	if (n <= 1) { // base case (the factorial of 1 or less than 1 would be 1)
		return 1;
 } 	else { // n would be the number to calculate the factorial of 
     return n * factorial(n - 1); // this if for the recursive case
     	}
	}
}


//4.4.5
//Inside main or another method after getting operation












