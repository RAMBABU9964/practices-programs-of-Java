package com.kn.pattern;

public class PatternWork2 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
					System.out.print(i);
				}else {
					System.out.print('-');
				}
				
			}
			System.out.println("");
		}
	}
}
/*output:
11111
-2222
--333
---44
----5*/
