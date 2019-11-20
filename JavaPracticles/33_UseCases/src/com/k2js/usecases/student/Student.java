// Find which student got highest marks among 3 students in that one student not attend for exams
// we should not create local variables local variables is for only temporary

package com.k2js.usescases.student;

import java.util.*;

class Student{
	
	String name;
	int id,marks[],total;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	Student(String name,int id,int...marks){  // ... means instead of an array [] we can create 
		this(name,id);
		this.marks=marks;
	}
	
	@Override
	public String toString(){
		return this.name+"\t"+this.id+"\t"+((this.marks!=null)?Arrays.toString(this.marks):"Exam not attended")+"\t"+this.total;
	}
}

class Teacher{
	
	
	public static void main(String...abc){
		Student s1=new Student("Jit",1005);
		Student s2=new Student("Ram",1004,new int[]{79,89,76,99,46});
		Student s3=new Student("Sai",1045,79,76,89,74,99,46);
		/*      // we should not create local variable
		int x1=Teacher.getTotalMarks(s1.marks);
		int x2=Teacher.getTotalMarks(s2.marks);
		int x3=Teacher.getTotalMarks(s3.marks);
		
		System.out.println(s1+"\t"+x1);
		System.out.println(s2+"\t"+x2);
		System.out.println(s3+"\t"+x3);
		
		*/
		
		// this is correct way
		s1.total=Teacher.getTotalMarks(s1.marks);
		s2.total=Teacher.getTotalMarks(s2.marks);
		s3.total=Teacher.getTotalMarks(s3.marks);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Teacher.announceTopper(s2.total,s3.total);//	Teacher.announceTopper(s3.total,s2.total);  f we change like this result will vary
		
		Teacher.announceTopper(s3,s2);
		
		Teacher.announceTopper(s1,s2,s3);
		
		
		
	}
	// Writing method to get total marks(Method should write in Teacher class only because teacher only can give marks)
		
		 static public int getTotalMarks(int[] marks){  // static modifer used because we r not having non static variables in main method 
			int total=0;
			try{
				for(int t:marks)total +=t;
		
			}catch(NullPointerException npe){
				return 0;
			}
			return total;
		}
		
		//
	/*	static public getTotalMarks(int i,int...m){  // This method should not use
			
			int total=i;
			try{
				for(int t:m) total +=t;
			}catch(NullPointerException e){
				
			}
			return total;
		}*/
		
		public static void announceTopper(int total1, int total2){
			
			System.out.println((total1>total2)?"student2":"student3"+"is topper");
			
		}
		
		//
		public static void announceTopper(Student s1,Student s2){
			System.out.println((s1.total>s2.total)?s1:s2+"is topper");
		}
		
		// if we want to work for all students (above we passed only for two students)
		
		/*public static void announceTopper(Student ...alls){
			Student topper=alls[0];
				for(Student s:alls){
					topper=(s.total>topper total)?s:topper;
				}
				System.out.println("Topper is +"+topper);
		}*/
		
		// Another way for above method
		public static void announceTopper(Student ... alls){
			Arrays.sort(alls,(x,y)->y.total-x.total);
			System.out.println("topper is "+alls[0]);
		}
		
		
		
}
