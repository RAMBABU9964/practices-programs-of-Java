
package com.kn.pattern;

public class PatternDemo18 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					if((j+i)%2==0) {
					System.out.print('1');
					}else {
						System.out.print('0');	
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			}
	}}
/*output:
 
1     
01    
101   
0101  
10101 

 
 */


