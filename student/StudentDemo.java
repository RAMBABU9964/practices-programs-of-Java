package com.kn.student;
public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student(1,"amit",83);
		Student s2=new Student(2,"aakash",90);
		Student s3=new Student(3,"ankul",30);
		
		Student[]srr=new Student[3];
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		//String str="amit";
		
		for(int i=0;i<srr.length;i++) {
			boolean isSwap=false;
				
			/*if(srr[i].name.equalsIgnoreCase("ankul")) {
			System.out.print("ID = "+srr[i].id+", "+"NAME = "+srr[i].name+", "+"MARKS = "+srr[i].marks);
			}*/
			/*int grace=5;
			if(srr[i].marks<31) {
				System.out.println("Before the grace marks ");
				System.out.println("ID = "+srr[i].id+", "+"NAME = "+srr[i].name+", "+"MARKS = "+srr[i].marks);
				System.out.println(" ");
				System.out.println("After the grace marks");
				srr[i].marks=grace+srr[i].marks;
				System.out.println("ID = "+srr[i].id+", "+"NAME = "+srr[i].name+", "+"MARKS = "+srr[i].marks);
				
			}*/
			for(int j=0;j<srr.length-1-i;j++) {
				if(srr[j].marks>srr[j+1].marks) {
					isSwap=true;
				
				if(isSwap=true) {
					Student temp=srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
				}
				}
			}
			if(isSwap==false) {
				break;
			}
			}
			for(int i=0;i<srr.length;i++) {
				System.out.println("ID = "+srr[i].id+", "+"NAME = "+srr[i].name+", "+"MARKS = "+srr[i].marks);
			}
			
		}}



