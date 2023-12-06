package com.kn.objects;
public class movieApp {
	public static void main(String[]args) {
		movie S4=new movie();
		System.out.println("--->Before initializing");
		System.out.println("Name="+S4.name+",Actres="+S4.actres+",Budget="+S4.budget);
		S4.name="bahubali";
		S4.actres="prabhas";
		S4.budget=250000000;
		System.out.println("--->After initializing");
		System.out.println("Name="+S4.name+",Actres="+S4.actres+",Budget="+S4.budget);
		System.out.println("--->Behaviours<---");
		S4.watching();
		S4.part();
}
}
