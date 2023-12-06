package com.kn.objects;

public class derssApp {
	public static void main(String[]args) {
		dress S5=new dress();
		System.out.println("--->Before initializing");
		System.out.println("Brand="+S5.brand+",Size="+S5.size+",colore="+S5.colore);
		S5.brand="roadstar";
		S5.size=36;
		S5.colore="black";
		System.out.println("--->After initializing");
		System.out.println("Brand="+S5.brand+",Size="+S5.size+",colore="+S5.colore);
		System.out.println("--->Behaviours<---");
		S5.qulity();
		S5.buying();
		
	}
	}
