package com.kn.assignmentprogrames;
import java.util.Scanner;

public class LuxuryHotel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		if(age>=60) {
			System.out.println("Senior Citizen Discount Applicable");
		}else if(age<60) {
			System.out.println("Regular Charges Applicable");
		}scan.close();
	}
}
