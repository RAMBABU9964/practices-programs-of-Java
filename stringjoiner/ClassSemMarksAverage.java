package com.kn.stringjoiner;
import java.util.Scanner;
public class ClassSemMarksAverage {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
System.out.println("enter the 8th sem markes");
System.out.println("enter first sub marks=");
int sub1=scan.nextInt();
System.out.println("enter second sub marks=");
int sub2=scan.nextInt();
System.out.println("enter third sub marks=");
int sub3=scan.nextInt();
System.out.println("enter fourth sub marks=");
int sub4=scan.nextInt();
System.out.println("enter fivth sub marks=");
int sub5=scan.nextInt();

int average=semCaluclatwer(sub1,sub2,sub3,sub4,sub5);
System.out.println("The average of 8 th sem="+average);
scan.close();
}

static int semCaluclatwer(int sub1, int sub2, int sub3, int sub4, int sub5) {
	// TODO Auto-generated method stub
	return (sub1+sub2+sub3+sub4+sub5)/5;
}


}
