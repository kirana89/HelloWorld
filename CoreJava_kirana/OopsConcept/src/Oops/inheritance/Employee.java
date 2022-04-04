package Oops.inheritance;

public class Employee extends Person{
	int empId;
	
	public Employee(String name,int age,String adress,int empId) {
		super(name,age,adress);
		this.empId=empId;
		System.out.println("employee comstructir");
	}

}
