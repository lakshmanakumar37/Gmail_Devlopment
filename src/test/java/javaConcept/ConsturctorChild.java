package javaConcept;

public class ConsturctorChild extends ConsturctorClass {
	
	private  ConsturctorChild() {
		super();
		System.out.println("This child consturctor");
	}
	
	
	public static void main(String args[]) {
		
		ConsturctorChild cc1=new ConsturctorChild();
		
	}

}
