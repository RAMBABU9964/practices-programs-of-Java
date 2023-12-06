package com.kn.jumping;
import java.util.Scanner;
public class BreakMethode {
public static void main(String[] args) {
	System.out.println("Enter a number for the range");
	Scanner scan=new Scanner(System.in);
int range=scan.nextInt();
for(int i=1;i<=range;i++) {
	if(i%3==0) {
		System.out.println("-->Divisible<---");
		break;
	}else {
		System.out.println("Not Divisible by 3="+i);
	}
	System.out.println("Withine body of for Loop");
}
System.out.println("---The End---");
scan.close();
}
}
