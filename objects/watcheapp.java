package com.kn.objects;
public class watcheapp {
	public static void main(String[]args) {
		watche S3=new watche();
		System.out.println("--->Before initializing");
		System.out.println("Brand="+S3.brand+",Color="+S3.color+",price="+S3.price);
		S3.brand="rolax";
		S3.color="black";
		S3.price=7000;
		System.out.println("--->After initializing");
		System.out.println("Brand="+S3.brand+",Color="+S3.color+",price="+S3.price);
		System.out.println("--->Behaviours<---");
		S3.life();
		S3.rating();
}
}
