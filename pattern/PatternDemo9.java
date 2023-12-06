package com.kn.pattern;

public class PatternDemo9 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=9;j++) {
			if(j>=(6-i)&&j<=(4+i)){
				System.out.print(j);
			}else {
				System.out.print('-');
			}
		}System.out.println(" ");
	}
	}

}
/*output:
----*---- 
---***--- 
--*****-- 
-*******- 
********* 
 if we print 'i' the output:
 ----1---- 
---222--- 
--33333-- 
-4444444- 
555555555 
if we print 'j' the output:
----5---- 
---456--- 
--34567-- 
-2345678- 
123456789 
 */
