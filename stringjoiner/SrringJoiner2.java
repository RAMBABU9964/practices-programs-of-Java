package com.kn.stringjoiner;
import java.util.Scanner;
public class SrringJoiner2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=scan.nextLine();
	String s2=scan.nextLine();
	String s3=joinerString(s1,s2);
	System.out.println(s3);
}

 static String joinerString(String s1, String s2)
 {
	 String s3 = s1+s2;
	return s3;
}
}
