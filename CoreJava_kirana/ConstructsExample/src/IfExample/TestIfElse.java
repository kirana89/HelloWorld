package IfExample;

public class TestIfElse {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=25;
		if(a>b || a>c) {
			System.out.println("a is large");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is large");
		}
		else {
			System.out.println("c is bigger");
		}
	
		

	}

}
