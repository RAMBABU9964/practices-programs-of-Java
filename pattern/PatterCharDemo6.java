package com.kn.pattern;

public class PatterCharDemo6 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				if(j<=i) {
					System.out.print((char)(i+64));
				}else {
					System.out.print('-');
				}
				
			}
			System.out.println("");
		}
	}
}
/* if we print 'j' the output:
EDCBA
-DCBA
--CBA
---BA
----A
 if we print 'i' the output:
EEEEE
-DDDD
--CCC
---BB
----A
*/
