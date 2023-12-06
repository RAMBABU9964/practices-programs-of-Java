//Write a program to determine the positive value when we enter two values
package com.kn.selectionstatements;
import java.util.Scanner;
public class positiveapp {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 numbers=");
	int a=scan.nextInt();
	int b=scan.nextInt();
	if(a>b) {
		System.out.println("differenc="+(a-b));
	}else{
		System.out.println("difference="+(b-a));
	}
	scan.close();
}
}
