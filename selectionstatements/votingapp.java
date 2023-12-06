package com.kn.selectionstatements;
import java.util.Scanner;
public class votingapp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age=");
		int age=scan.nextInt();
		if(age >=18)
		{
			System.out.println("eligbal for voteing");
		}
	}
}
