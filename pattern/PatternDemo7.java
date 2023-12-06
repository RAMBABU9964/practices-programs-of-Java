package com.kn.pattern;

public class PatternDemo7 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
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
11111
-2222
--333
---44
----5
if we print 'i' the output:
12345
-2345
--345
---45
----5
*/