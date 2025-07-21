package com.jspiders.collectionframework;
class Employee
{
    String role;
    int eid;
    double ctc;
	public Employee(String role, int eid, double ctc) {
		
		this.role = role;
		this.eid = eid;
		this.ctc = ctc;
	}
	@Override
	public String toString() {
		return "Employee [role=" + role + ", eid=" + eid + ", ctc=" + ctc + "]";
	}
    
}
public class MainClass6 
{
        public static void main(String[] args)
        {
			 Employee[] emp=new Employee[5];
			 emp[0]=new Employee("QA",3745,4.5);
			 emp[1]=new Employee("DEV",3895,6.5);
			 emp[2]=new Employee("TL",9745,7.5);
			 emp[3]=new Employee("DEV",2145,8.5);
			 emp[4]=new Employee("MAN",9845,9.5);
			 
			 Employee e=emp[0];
			 for(int i=0; i<emp.length; i++)
			 {
				if(emp[i].ctc<e.ctc) {
					e=emp[i];
				}
			 }
			 System.out.println("Role : " +e.role+ "eid :" +e.eid+"ctc :" +e.ctc);
		}
}
