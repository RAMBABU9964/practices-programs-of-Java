package com.kn.pattern;

public class PatternCharDemo5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
					System.out.print((char)(j+64));
				}else {
					System.out.print('-');
				}
				
			}
			System.out.println("");
		}
	}
}
/* If we print 'i' the output:
AAAAA
-BBBB
--CCC
---DD
----E
If we print 'j' the output:
ABCDE
-BCDE
--CDE
---DE
----E
*/
