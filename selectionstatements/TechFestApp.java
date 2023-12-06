package com.kn.selectionstatements;
import java.util.Scanner;
public class TechFestApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks=");
		int marks=scan.nextInt();
		if(marks>90)
		{
			System.out.println("well come to techfest");
		}
	}

}
