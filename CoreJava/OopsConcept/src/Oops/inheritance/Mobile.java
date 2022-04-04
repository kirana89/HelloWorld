package Oops.inheritance;

public class Mobile extends Product {
	String MobileType;
	public Mobile(String Type,String MobileType) {
		super(Type);
		this.MobileType=MobileType;
		System.out.println("this is mobile");
	}

}
