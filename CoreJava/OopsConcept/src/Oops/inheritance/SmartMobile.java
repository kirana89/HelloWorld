package Oops.inheritance;

public class SmartMobile extends Mobile {
	String name;
	int cost;
	String color;
	public SmartMobile(String Type,String MobileType,String name,int cost,String color) {
		super(Type,MobileType);
		this.name=name;
		this.cost=cost;
		this.color=color;

}
}
