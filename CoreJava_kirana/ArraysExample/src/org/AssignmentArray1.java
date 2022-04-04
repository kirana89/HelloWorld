package org;

import java.util.Scanner;

public class AssignmentArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num2=0;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<num.length;i++) {
			 num[i]=sc.nextInt();
		}
		System.out.println("elements multiply by 2 ");
		for(int i=0;i<num.length;i++) {
			num2=2*num[i];
		
			System.out.println(num2);
		}
		

	}

}
