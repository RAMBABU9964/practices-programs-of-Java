package com.kn.assignmentprogrames;
import java.util.Scanner;

public class DiscountApplicable {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the purchase amount");
	int amount=scan.nextInt();
	if(amount>200) {
		System.out.println("Discount of 20% applicable happy customer");
	}else {
		System.out.println("You are not applicable for the dicount sorry keep shopping");
	}
}
}
