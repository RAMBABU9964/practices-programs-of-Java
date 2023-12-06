package com.kn.objects;

public class Trinerapp {
	public static void main(String[]args) {
		Triner T1=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T1.id+",Name="+T1.name+",Skill="+T1.skill);
//		T1.id=12345;
//		T1.name="arun";
//		T1.skill="java";
		T1.givendata(12345,"arun","java");
		System.out.println("--->After initializing");
		System.out.println("ID="+T1.id+",Name="+T1.name+",Skill="+T1.skill);
		System.out.println("--->Behaviours<---");
		T1.Trian();
		T1.solveproblem();
		
		Triner T2=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T2.id+",Name="+T2.name+",Skill="+T2.skill);
//		T2.id=56789;
//		T2.name="yash";
//		T2.skill="testing";
		T2.givendata(56789,"yash","testing");
		System.out.println("--->After initializing");
		System.out.println("ID="+T2.id+",Name="+T2.name+",Skill="+T2.skill);
		System.out.println("--->Behaviours<---");
		T2.Trian();
		T2.solveproblem();
		
		Triner T3=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T3.id+",Name="+T3.name+",Skill="+T3.skill);
//		T3.id=34567;
//		T3.name="ram";
//		T3.skill="phythen";
		T3.givendata(34567,"ram","phythen");
		System.out.println("--->After initializing");
		System.out.println("ID="+T3.id+",Name="+T3.name+",Skill="+T3.skill);
		System.out.println("--->Behaviours<---");
		T3.Trian();
		T3.solveproblem();
		
		Triner T4=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T4.id+",Name="+T4.name+",Skill="+T4.skill);
//		T4.id=67890;
//		T4.name="kavya";
//		T4.skill="design";
		T4.givendata(67890,"kavya","design");
		System.out.println("--->After initializing");
		System.out.println("ID="+T4.id+",Name="+T4.name+",Skill="+T4.skill);
		System.out.println("--->Behaviours<---");
		T4.Trian();
		T4.solveproblem();
		
		Triner T5=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T5.id+",Name="+T5.name+",Skill="+T5.skill);
//		T5.id=98765;
//		T5.name="anu";
//		T5.skill="dance";
		T4.givendata(98765,"anu","dance");
		System.out.println("--->After initializing");
		System.out.println("ID="+T5.id+",Name="+T5.name+",Skill="+T5.skill);
		System.out.println("--->Behaviours<---");
		T5.Trian();
		T5.solveproblem();
		
		Triner T6=new Triner();
		System.out.println("--->Before initializing");
		System.out.println("ID="+T6.id+",Name="+T6.name+",Skill="+T6.skill);
//		T6.id=54321;
//		T6.name="sam";
//		T6.skill="singing";
		T6.givendata(54321,"sam","singing");
		System.out.println("--->After initializing");
		System.out.println("ID="+T6.id+",Name="+T6.name+",Skill="+T6.skill);
		System.out.println("--->Behaviours<---");
		T6.Trian();
		T6.solveproblem();
	}
}

