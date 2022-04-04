package MethodExample;

public class calculator {
	int x;
	int y;
	//accepts nothing returns nothing
	public void sum1() {
		System.out.println(x+y);
	}
	//accepts nothing and returns something
	public int sum2() {
		return (x+y);
	}
	//accepts something and accepts something
	public int sum3(int a,int b) {
		return a+b;
	}
	public void sum4(int a,int b){}
	public void sum4(int a,float b) {}
	public void sum4(float a,float b) {}
	public void sum4(int a,float b,int c) {}
	
	
	

}
