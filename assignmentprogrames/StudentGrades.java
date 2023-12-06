package com.kn.assignmentprogrames;
import java.util.Scanner;

public class StudentGrades {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the student marks");
	int marks=scan.nextInt();
	if(marks>=60) {
		System.out.println("PASSED");
	}else if(marks<60) {
		System.out.println("FAILED");
	}scan.close();
}
}
