package ifelse;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int y;
		Scanner scn= new Scanner(System.in);
		y=scn.nextInt();
		 if((y%400==0) || ((y%4==0)&& (y%100!=0))) {
			System.out.println("Leap Year");
		 }else {
			System.out.println("Not a Leap Year");
		}
	}
}
