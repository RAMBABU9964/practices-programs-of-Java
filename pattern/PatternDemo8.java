package com.kn.pattern;

public class PatternDemo8 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print('-');
				}
				
			}
			System.out.println("");
		}
	}
}
/* if we print 'i' the output:
55555
-4444
--333
---22
----1
if we print 'j' the output:
54321
-4321
--321
---21
----1
 */