package Oops.abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Employee1();//polymorphism many forms
		p1.doSomething();
		Person p2=new Student();
		p2.doSomething();
//		Person p3=new Employee1();
//		p3.doSomething();
		
		Employee1 emp=new Employee1();//pure implementation
		
		

	}

}
