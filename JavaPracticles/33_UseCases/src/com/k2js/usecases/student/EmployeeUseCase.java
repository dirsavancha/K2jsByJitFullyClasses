//

package com.k2js.usescases.student;

abstract class Employee {

	int empid;
	String empname;
	float empsal;
	

	Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	Employee(int empid, String empname, float empsal) {
		this(empid, empname);
		this.empsal = empsal;

	}

	@Override
	public String toString() {

		return "[empid=" + empid + "\t empname=" + empname + "\t empsal=" + empsal + "]";
	}

}

class EmpSalHike extends Employee {
    String designation;
	
	EmpSalHike(int empid, String empname) {
		super(empid, empname);
	}

	EmpSalHike(int empid, String empname, float empsal) {
		super(empid, empname, empsal);
	}

	@Override
	public String toString() {
		return super.toString()+this.designation;
	}


}

 class HrDept {
	public static void main(String[] args) {
		Employee e1 = new EmpSalHike(100, "Sai", 6000f);
		EmpSalHike e2 = new EmpSalHike(101, "Hari");
		Employee e3 = new Employee(102, "Raj", 5000.f) {
			@Override
			public String toString() {
				return super.toString();
			}
		};

		EmployeeUseCase.salaryHike(e1, e2, e3);
		//System.out.println(e1 + "\n" + e2 + "\n" + e3);

	}
	
	
	
	static public void salaryHike(Employee... emp) {

		for (Employee e : emp) {
			
			
			if (e.empsal <= 2000) {
				e.empsal += 1000;
				if(e instanceof EmpSalHike) {
					((EmpSalHike)e).designation="Clerk";
				}
				//System.out.println(e);
				
			} else if (e.empsal <=6000) {
				e.empsal += 500;
				if(e instanceof EmpSalHike) {
					((EmpSalHike)e).designation="Manager";
				}
				//System.out.println(e);
			}
			
			System.out.println(e);
			
			
		}

	}

}
