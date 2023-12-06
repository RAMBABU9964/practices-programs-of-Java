package com.kn.assignmentprogrames;
import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		if(number>=0) {
			System.out.println("Positive Balance");
		}else if(number<0) {
			System.out.println("Negative Balance");
		}scan.close();
	}
}
