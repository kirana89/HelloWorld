package whileDoWhile;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int a=sc.nextInt();
		System.out.println("enter rate");
		int r=sc.nextInt();
		System.out.println("enter year");
		int t=sc.nextInt();
		int n=a*r*t/100;
		System.out.println("simple interest is "+n);
		//if(n<=100000) {
		while(n<100000){
			t++;
			n=a*r*t/100;
		
		}//while(n<100000);
	//	}
		System.out.println("number of years "+t);
		
		
	}

}
