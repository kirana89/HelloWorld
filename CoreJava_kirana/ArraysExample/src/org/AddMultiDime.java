package org;

import java.util.Scanner;

public class AddMultiDime {

	public static void main(String[] args) {
		int[][] nums=new int[3][3];
		
		System.out.println("enter elemts for 1st array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				nums[i][j]=sc.nextInt();			}
		}
		int[][] num2=new int[3][3];
		System.out.println("enter elemts for 2nd array");
		for( int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				num2[i][j]=sc.nextInt();			}
		}
		int[][] add=new int[3][3];
		System.out.println("values of addition");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				add[i][j]=nums[i][j]+num2[i][j];
				
				System.out.print(add[i][j]+" ");		
				}
			System.out.println();
		}
		
		
	}

}
