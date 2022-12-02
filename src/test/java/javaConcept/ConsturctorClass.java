package javaConcept;

public class ConsturctorClass {
	
	private ConsturctorClass() {
		this(10);
		System.out.println("This is no argument consructor");
	}
	
	public  ConsturctorClass(int a) {
		this(5,2);
		System.out.println("This is argument constrctor"+a);
	}
	
	public ConsturctorClass(int a,int b) {
		System.out.println("This is two arguments"+a*b);
	}
	
	public static void main(String args[]) {
		ConsturctorClass cc= new ConsturctorClass();
		
		
	}

}
