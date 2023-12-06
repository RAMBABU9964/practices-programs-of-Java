package com.kn.pattern;

public class PatternDemo2 {
	public static void main(String[] args) {
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
/*If we print the'i' the output:
55555
44444
33333
22222
11111
 */
/* If we print the'j' the output:
54321
54321
54321
54321
54321 
 */

