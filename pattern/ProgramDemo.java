package com.kn.pattern;

public class ProgramDemo {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
/* if we print 'i' the output:
11111
22222
33333
44444
55555
if we print 'j' the output:
12345
12345
12345
12345
12345
*/