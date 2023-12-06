//Write a program to determine the vowel or consonant
package com.kn.selectionstatements;

import java.util.Scanner;
public class VowelOrConsonantApp {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the character=");
char c=scan.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
	System.out.println("GIVEN Character "+c+" is a vowel");
}else {
	System.out.println("GIVEN Character "+c+" IS A CONASONANT");
}
}
}
