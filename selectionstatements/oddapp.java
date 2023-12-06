package com.kn.selectionstatements;
//write a program to determine the even or odd number
import java.util.Scanner;
public class oddapp {
	public static void meain(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any numbers=");
		int a=scan.nextInt();
		if(a % 2 == 0){
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		scan.close();
	}
}
