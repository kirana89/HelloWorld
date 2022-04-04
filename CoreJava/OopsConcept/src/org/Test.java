package org;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person();
		//this creates an object and allocates memeory address to the object
		p1.name="kiran";
		p1.age=23;
		p1.place="karnataka";
		
		System.out.println(p1.name+" "+p1.age+"years old and from "+p1.place);
		
		Person p2=new Person();
		//this creates an object and allocates memeory address to the object
		p2.name="vivek";
		p2.age=25;
		p2.place="up";
		
		System.out.println(p2.name+" "+p2.age+"years old and from "+p2.place);
		
		Student s1=new Student();
		s1.rollNo=10001;
		System.out.println("rollno is "+s1.rollNo);

	}

}
