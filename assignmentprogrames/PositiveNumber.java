package com.kn.assignmentprogrames;
import java.util.Scanner;

public class PositiveNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	{
		System.out.println("Enter a number");
	}
	int number=scan.nextInt();
	if(number>0) {
		System.out.println("Positive number-processing...");
	}else {
		System.out.println("Not a positive number enter a positive number");
	}
	scan.close();
}
}
