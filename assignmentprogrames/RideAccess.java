package com.kn.assignmentprogrames;
import java.util.Scanner;

public class RideAccess {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter visitor's age:");
	int age=scan.nextInt();
	if(age>12) {
		System.out.println("Ride access granted");
	}else {
		System.out.println("Sorry you are not enough to ride this roller coaster.");
	}scan.close();
}
}
