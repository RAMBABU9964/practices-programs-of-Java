package com.kn.pattern;

public class PatternWork7 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=i) {
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
1----
22---
333--
4444-
55555
*/
