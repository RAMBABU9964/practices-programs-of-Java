//write a program on basic arithmetic operations
package com.kn.arithmeticoperations;

import java.util.Scanner;
public class ArithmeticOperationsApp {
public static void main(String[]args)
{
	Scanner scan =new Scanner(System.in);
	System.out.println("enter two arithmetic numbers");
	int nub1=scan.nextInt();
	int num2=scan.nextInt();
	
	int difference= subtractNumbers(nub1,num2);
	int product=multiplyNumbers(nub1,num2);
	double quotient=divideNumbers(nub1,num2);
	int reminder=findReminder(nub1,num2);
	
	System.out.println("Difference="+difference);
	System.out.println("Product="+product);
	System.out.println("Quotient="+quotient);
	System.out.println("Reminder="+reminder);
}

   static int findReminder(int num1, int num2) {
	// TODO Auto-generated method stub
	return num1%num2;
}

   static double divideNumbers(int num1, int num2) {
	// TODO Auto-generated method stub
	return (double)num1/(double)num2;
}

static int multiplyNumbers(int num1, int num2) {
	// TODO Auto-generated method stub
	return num1*num2;
}

static int subtractNumbers(int num1, int num2) {
	// TODO Auto-generated method stub
	return num1-num2;
}
}
