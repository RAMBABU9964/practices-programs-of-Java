package com.kn.selectionstatements;
import java.util.Scanner;
public class SwitchApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character=");
		char c=scan.next().charAt(0);
		switch(c) {
		case 'v':
			System.out.println("Voilet color");
		break;
		case 'i':
			System.out.println("Indigo color");
		break;
		case 'b':
			System.out.println("Blue color");
		break;
		case 'g':
			System.out.println("Green color");
		break;
		case 'y':
			System.out.println("Yellow color");
		break;
		case'o':
			System.out.println("Orange color");
			break;
		case'r':
			System.out.println("Red color");
			break;
		default :
			System.out.println("Not a Rainbow color");
		}
System.out.println("---TheEnd---");
scan.close();
	}
}