package com.kn.assignmentprogrames;
import java.util.Scanner;

public class VoterEligible {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the persone's age for eligible");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("Voter registration eligible");
		}else {
			System.out.println("Sorry not eligible for registration");
		}scan.close();
}}
