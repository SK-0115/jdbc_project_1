package com.test;

public class Program1 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number; // or Math.pow(number, 2)

        System.out.println("The square of " + number + " is: " + square);
    }
}

	}

}
