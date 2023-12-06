package com.kn.pattern;

public class PatternCharDemo2 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print((char)(j + 64));
			}
			System.out.println("");
		}
	}
}
/* If we print 'i' the output:
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA 
If we print 'j' the output:
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA*/
