package com.kn.assignmentprogrames;
import java.util.Scanner;

public class CapitalLetterDetected {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char character=scan.next().charAt(0);
		if(Character.isUpperCase(character)) {
			System.out.println("Capital Latter Detected");
		}else {
			System.out.println("The character is not a captial letter");
		}scan.close();
}}
