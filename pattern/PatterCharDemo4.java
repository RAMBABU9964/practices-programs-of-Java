package com.kn.pattern;

public class PatterCharDemo4 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=(6-i)) {
					System.out.print((char)(j+64));
				}else {
					System.out.print('-');
				}
				
			}
			System.out.println("");
		}
	}
}
/*output:
AAAAA
BBBB-
CCC--
DD---
E----
print'j'
ABCDE
ABCD-
ABC--
AB---
A----*/