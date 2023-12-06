package com.kn.objects;
public class CollageApp {
	public static void main(String[]args) {
		Collage S2=new Collage();
		System.out.println("--->Before initializing");
		System.out.println("Name="+S2.name+",Fee="+S2.fee+",Location="+S2.location);
		S2.name="rymec";
		S2.fee=10000;
		S2.location="bellary";
		System.out.println("--->After initializing");
		System.out.println("Name="+S2.name+",Fee="+S2.fee+",Location="+S2.location);
		System.out.println("--->Behaviours<---");
		S2.teach();
		S2.bus();
		
	}
	}

