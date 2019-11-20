
//

package com.k2js.usescases.student;

import java.util.*;
import java.util.stream.*;

abstract class XStudent{
	
	String name;
	int id,marks[],total;
	
	XStudent(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	
	XStudent(String name,int id,int...marks){
		this(name,id);
		this.marks=marks;
		
	}
	@Override
	public String toString(){
		return this.name+"\t"+this.id+"\t"+((this.marks!=null)?Arrays.toString(this.marks):"Exam not attended")+"\t"+this.total;
	}
} 

class XStudentProgressCard extends XStudent{
	
	char grade;
	
	XStudentProgressCard(int id,String name){
		super(name,id);
		
	}
	
	XStudentProgressCard(int id, String name,int ...marks){
		super(name,id);
		super.marks=marks;
	}
	
	@Override
	public String toString(){
		return super.toString()+this.grade;
	}
}

class XBoard{
	
	public static void main(String...abc){
		
		XStudent xs1=new XStudentProgressCard(105,"Jit");
		XStudentProgressCard xs2=new XStudentProgressCard(106,"Sai",95,98,75,76,47,58);
		XStudent xs3=new XStudent("Krishna",107){};
		XStudentProgressCard xs4=new XStudentProgressCard(108,"Ram",78,77,85,86,89,92);
		XStudent xs5=new XStudent("Sandeep",109,78,76,77,78,76,75){
			
			@Override
			public String toString(){
				return super.name+super.id+ "\t"+Arrays.toString(super.marks);
			}
		};
		
		
		xs1.total=XBoard.getTotalMarks(xs1.marks);
		xs2.total=XBoard.getTotalMarks(xs2.marks);
		xs3.total=XBoard.getTotalMarks(xs3.marks);
		xs4.total=XBoard.getTotalMarks(xs4.marks);
		xs5.total=XBoard.getTotalMarks(xs5.marks);
		
		System.out.println(xs1);
		System.out.println(xs2);
		System.out.println(xs3);
		System.out.println(xs4);
		System.out.println(xs5);
		
		XBoard.announceTopper(xs1,xs2,xs3,xs4,xs5);
	}
	
	static public int getTotalMarks(int ...marks){
	 
		
		try{
			int t= Arrays.stream(marks).sum();
			
			return t;
		}
		catch(NullPointerException e){
			return 0;
		}			
	}
	static public void announceTopper(XStudent ...alls){
		XStudent topper=alls[0];
		for(XStudent t: alls){
			
			topper=(topper.total<t.total)?t:topper;
			if(t instanceof XStudentProgressCard)
			((XStudentProgressCard)t).grade=(! (t instanceof XStudentProgressCard) ?'-': (t.total>90)?'A':(t.total>80)?'B':(t.total>70)?'C':(t.total>60)?'D':'F');
		}
		System.out.println(topper);
	}
		
}
	
	
	
