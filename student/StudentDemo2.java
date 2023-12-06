package com.kn.student;
import java.util.Scanner;
public class StudentDemo2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array size= ");
		Student[]srr=new Student[scan.nextInt()];
		
		for(int i=0;i<srr.length;i++) {
			System.out.println("enter the id ="+(i+1));
			int id=scan.nextInt();
			System.out.println("enter the name ="+(i+1));
			String name =scan.next();
			System.out.println("enter the marks="+(i+1));
			int marks=scan.nextInt();
			
			srr[i]=new Student(id,name,marks);
		}
			System.out.println("enter the id to chack");
			int s1=scan.nextInt();
		
		int low=0;
		int high=srr.length;
		int mid=0;
		boolean isFoundElement=false;
		int position=-1;
			for(int i=0;i<srr.length;i++) {
				while(low<=high) {
					mid=(low+high)/2;
					if(s1==srr[mid].id) {
						isFoundElement=true;
						position=mid+1;
						break;
					}
					else if(s1>srr[mid].id) {
						low=mid+1;
						high=high;
					}else {
						high=mid-1;
						low=low;
			}
				
			}}
				if(isFoundElement) {
					System.out.println("Target "+s1+" is found at "+position+" position");
					System.out.print("ID = "+srr[position-1].id+", "+"NAME = "+srr[position-1].name+", "+"MARKS = "+srr[position-1].marks);
				}else
				{
					System.out.println("Target "+s1+" is not found at ");	
				}scan.close();
		
	}}


