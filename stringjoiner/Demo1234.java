package com.kn.stringjoiner;
import java.util.Scanner;

public class Demo1234 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("enter the 8th sem markes");
	int sub1=scan.nextInt();
	int sub2=scan.nextInt();
	int sub3=scan.nextInt();
	int sub4=scan.nextInt();
	int sub5=scan.nextInt();
	int average=semCaluclatwer(sub1,sub2,sub3,sub4,sub5);
	System.out.println("The average of 8 th sem="+average);
}

  static int semCaluclatwer(int sub1, int sub2, int sub3, int sub4, int sub5) {
		// TODO Auto-generated method stub
		return ((sub1+sub2+sub3+sub4+sub5)/5);
	}
}
