package ConstructorExample;

public class TestProduct {
    public static void main(String[] args) {
		Product p1=new Product();
		p1.name="phone";
		p1.brand="poco";
		p1.price=20000;
		p1.qty=10;
		
		Product p2=new Product("tv","onide",0,65);
		System.out.println(p2.name);
		p2.name="susm";
		System.out.println(p2.name);
		
		Product p6=new Product("pink","red");
		p6.price=43;
		
		System.out.println(p6.price);
		
	}
}
