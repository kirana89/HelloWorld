package org;

public class TestArray {
	public static void main(String[] args) {
		
	
	//declare
	String[] names;
	//instantiate
	names=new String[3];//allocation of memory
	//initialization
	names[0]="kiran";
	names[1]="vivek";
	names[2]="ayush";
	
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	//enhanced for loop
	System.out.println("enhanced for");
	for(String temp:names) {
		System.out.println(temp);
	}
	
	
	String[] cities= {"madras","mumbai","bangalore","delhi"};
	for(int i=0;i<cities.length;i++) {
		System.out.println(cities[i]);
	}
	//enhanced for loop
		System.out.println("enhanced for");
		for(String temp:cities) {
			System.out.println(temp);
		}
	int[] num=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		
}
	//enhanced for loop
		System.out.println("enhanced for");
		for(int temp:num) {
			System.out.println(temp);
		}
}
}
