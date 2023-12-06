package com.kn.stringjoiner;
import java.util.Scanner;
public class Decoder {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a character= ");
	char c=scan.next().charAt(0);
	int unicodeCharacter=messageDecoder(c);
	System.out.println("The unicode for"+c+"="+unicodeCharacter);
}

 static int messageDecoder(char c)
 {
	return (int)c;
}
}
