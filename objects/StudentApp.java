package com.kn.objects;
public class StudentApp {
public static void main(String[]args) {
	Student S1=new Student();
	System.out.println("--->Before initializing");
	System.out.println("ID="+S1.id+",Name="+S1.name+",CGPA="+S1.cgpa);
	S1.id=9743;
	S1.name="ram";
	S1.cgpa=7.8;
	System.out.println("--->After initializing");
	System.out.println("ID="+S1.id+",Name="+S1.name+",CGPA="+S1.cgpa);
	System.out.println("--->Behaviours<---");
	S1.Study();
	S1.markAttendance();
	
}
}
