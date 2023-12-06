package com.kn.selectionstatements;
import java.util.Scanner;
public class VibgyorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the character=");
	char c=scan.next().charAt(0);
	if(c=='v'|| c=='V') {
		System.out.println("Rainbow color");
	}else if(c=='i'||c=='I')
	{
		System.out.println("Rainbow color");
	}else if(c=='b'||c=='B')
	{
		System.out.println("Rainbow color");
	}else if(c=='g'||c=='G')
	{
		System.out.println("Rainbow color");
	}else if(c=='y'||c=='Y')
	{
		System.out.println("Rainbow color");
	}else if(c=='o'||c=='O')
	{
		System.out.println("Rainbow color");
	}else if(c=='r'||c=='R')
	{
		System.out.println("Rainbow color");
	}else
	{
		System.out.println("Not a Rainbow color");
	}
}
}