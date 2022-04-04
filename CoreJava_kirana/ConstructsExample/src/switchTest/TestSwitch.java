package switchTest;

public class TestSwitch {

	public static void main(String[] args) {
		String color="red";
		switch(color) {
		case "blue":System.out.println("its blue");
		break;
		case "green":System.out.println("its  green");
		break;
		case "red":System.out.println("its red");
		break;
		case "orange":System.out.println("its red");
		break;
		default:
			System.out.println("not in the list");
		
		}
	}

}
