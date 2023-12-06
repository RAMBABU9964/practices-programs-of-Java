package com.kn.selectionstatements;
import java.util.Scanner;

public class ArithmeticOperationsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		System.out.println("Enter second number");
		double num2=scan.nextDouble();
		System.out.println("Enter an operation to be performed");
		char operation=scan.next().charAt(0);
			switch(operation) {
			case'+':
				System.out.println(num1+num2);
				break;
			case'-':
				System.out.println(num1-num2);
			break;
			case'*':
				System.out.println(num1*num2);
			break;
			case'/':
				System.out.println(num1/num2);
			break;
			case'%':
				System.out.println(num1%num2);
			break;	
			default :
					System.out.println("Involid input");
			}
}
}