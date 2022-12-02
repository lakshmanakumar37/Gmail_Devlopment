package javaConcept;

public class Polymorphisam {
	
	public void accountName() {
		
		System.out.println("Nothing to print");
		
	}
	
	public void accountName(int a) {
		System.out.println(a);
		
	}
	
	public void accountName(String name) {
		System.out.println(name);
		
	}
	
	public static void main(String args[]) {
		Polymorphisam poly = new Polymorphisam();
		poly.accountName();
		poly.accountName(15);
		poly.accountName("Selenium");
	}

}
