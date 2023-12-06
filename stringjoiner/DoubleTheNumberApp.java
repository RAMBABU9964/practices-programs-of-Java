//write a program on double the value  of any number provided
package com.kn.stringjoiner;

import java.util.Scanner;
public class DoubleTheNumberApp {
public static void main(String[]args)
{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number= ");
	int result=doubleTheNumber(scan.nextInt());
	System.out.println("Double the number="+result);
	
	
}
public static int doubleTheNumber(int num)
{	
	System.out.println("enter a number");
	int result=num*2;
	return result;
}
		
}

