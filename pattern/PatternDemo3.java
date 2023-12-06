package com.kn.pattern;

public class PatternDemo3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
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
/*output:
*----
**---
***--
****-
*****
if we print 'i' the output:
1----
22---
333--
4444-
55555
if we print 'i' the output:
1----
12---
123--
1234-
12345

*/
