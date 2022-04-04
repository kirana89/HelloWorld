package Oops.inheritance;

public class QuertyMobile extends Mobile {
	String name;
	int cost;
	String color;
	public QuertyMobile(String Type,String MobileType,String name,int cost,String color) {
		super(Type,MobileType);
		this.name=name;
		this.cost=cost;
		this.color=color;
		

}

}
