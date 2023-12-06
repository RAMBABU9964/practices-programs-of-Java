//write a program on upper and lower case
package com.kn.selectionstatements;

import java.util.Scanner;
public class UpperLowerCaseApp {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a character");
	char a=scan.next().charAt(0);
	if(a>='A'&&a<='Z')
	{
		System.out.println("it is a uppercasee letter");
	}
	else if(a>='a'&&a<='z')
	{
		System.out.println("it is a lowercase letter");
	}
	else
	{
		System.out.println("It is a number");
	}
}
}
