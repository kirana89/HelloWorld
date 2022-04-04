package org;

import java.util.Scanner;

public class Calcualateinterest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter principle amount");
		int p=scn.nextInt();
		System.out.println("enter principle rate");
		int r=scn.nextInt();
		System.out.println("enter principle time");
		int t=scn.nextInt();
		
		long n=p*r*t/100;
		System.out.println("principle amount is: "+n);
		
		

	}

}
