package IfExample;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a year");
		int year=scn.nextInt();
		if(year%4==0 && year%100!=0) {
			System.out.println(year+" leap year");
		}
		else if(year%400==0) {
			System.out.println(year +" leap year");
		}
		else {
			System.out.println(year+" not leap year");
		}
		
	}

}
