package Oops.inheritance;

public class Manager extends Employee {
	String dept;
	public Manager(String name,int age,String adress,int empId,String dept) {
		super(name,age,adress,empId);
		this.dept=dept;
		
		System.out.println("manager constructor");
	}

}
