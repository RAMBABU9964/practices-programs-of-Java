package com.kn.selectionstatements;
import java.util.Scanner;
//Write program to determine to give character is vowel or consonant
public class IfElseLadder {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a character=");
	char c=scan.next().charAt(0);
	if(c=='a'||c=='A')
	{
		System.out.println("character="+"vowel");
	}
	else if(c=='e'||c=='E')
	{
		System.out.println("character="+"vowel");
	}
	else if(c=='i'||c=='I') {
		System.out.println("character="+"vowel");	
	}
	else if(c=='o'||c=='O')
	{
		System.out.println("character="+"vowel");
	}
	else if(c=='u'||c=='U')
	{
		System.out.println("character="+"vowel");
	}
	else
	{
		System.out.println("character="+"consonant");
	}
	}
}
