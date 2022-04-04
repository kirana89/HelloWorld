package Interface;

public class Test extends Person implements Player,Artist,doable {

	public static void main(String[] args) {
		Test t2=new Test();
		
	t2.doArt();
	t2.do1();
	t2.doPlay();
	t2.doSomething();

	}

	public void do1() {
		System.out.println("doing job");	
	}
	public void doArt() {
		System.out.println("doing art");	
	}
	public void doPlay() {
		System.out.println("play somw games");	
	}
	public void doSomething() {
		System.out.println("doing their personal jobs");
		
	}

}
