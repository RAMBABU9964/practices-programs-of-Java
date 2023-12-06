package com.kn.selectionstatements;
import java.util.Scanner;
//Write program to CGPA in input from the 
public class GradeingSystem {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the marks");
	int marks=scan.nextInt();
	if(marks>=90)
	{
		System.out.println("grade="+ 'A');
	}
	else if(marks>=75&marks<90)
	{
		System.out.println("grade="+ 'B');
	}
	else if(marks>60&marks<75)
	{
		System.out.println("grade="+ 'c');
	}
	else if(marks>45&marks<60)
	{
		System.out.println("grade="+ 'D');
	}
	else if(marks>35&marks<45)
	{
		System.out.println("grade="+ 'E');
	}
	else if(marks<35)
	{
		System.out.println("grade="+ 'F');
	}
	scan.close();
}
}
