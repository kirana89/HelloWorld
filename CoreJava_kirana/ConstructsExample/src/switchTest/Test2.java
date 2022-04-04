package switchTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tax");
		int tax=sc.nextInt();
		System.out.println("enter sal");
		int sal=sc.nextInt();
		int sal1=0;
		int sal2=0;
	
		switch(tax) {
		case 10:
			System.out.println("10% tax");
			if (sal<=600000) {
			  sal1=sal/10*2;
			  sal2=sal-sal1;
			}
			else if (sal<=1000000) {
				sal1=(sal/20);
				  sal2=sal-sal1;
				}
			else if (sal>1000000) {
				sal1=(sal/30);
				  sal2=sal-sal1;
				}
			System.out.println(sal);
			System.out.println(sal1);
			System.out.println(sal2);
			break;
		case 20:
			System.out.println("20% tax");
			if (sal<=600000) {
				sal1=(sal/10);
				  sal2=sal-sal1;
			}
			if (sal<=1000000) {
				sal1=(sal/20);
				  sal2=sal-sal1;
				}
			if (sal>1000000) {
				sal1=(sal/30);
				  sal2=sal-sal1;
				}
			System.out.println(sal2);
			break;
		case 30:
			System.out.println("30% tax");
			if (sal<=600000) {
				sal1=(sal/10);
				  sal2=sal-sal1;
			}
			if (sal<=1000000) {
				sal1=(sal/20);
				  sal2=sal-sal1;
				}
			if (sal>1000000) {
				sal1=(sal/30);
				  sal2=sal-sal1;
				}
			System.out.println(sal2);
			break;
			
		default:System.out.println("this tax is not available for the salary");
		}

	}

}
