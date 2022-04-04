package MethodExample;

public class testCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=new calculator();
		c.x=10;
		c.y=20;
		c.sum1();
		
		 int res=c.sum2();
		 System.out.println(c.sum2());
		 System.out.println(res);
		 
		 System.out.println(c.sum3(20,21));
		 int res1=c.sum3(21, 22);
		 System.out.println(res1);
		 
		 c.sum4(12,21);
		 c.sum4(12,21.3f);
		 c.sum4(12.4f,21.3f);
		 c.sum4(12,21.4f,32);
		 
		 
		 
		

	}

}
