package com.kn.pattern;

public class PatternCharDemo {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print((char)(i + 64));
			}
			System.out.println("");
		}
	}

}
/*If we print the'j' the output:
 ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
If we print the'i' the output:
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

*/

