package com.kn.arithmeticoperations;

public class StringJoinerApp {
public static void main(String[] args) {
	String firstName="Hello";
	String lastName="World";
	String fullName=joinString(firstName,lastName);
	System.out.println("Full Name:"+fullName);
}
public static String joinString(String str1,String str2) {
	return str1+str2;
}
}
