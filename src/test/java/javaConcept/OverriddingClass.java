package javaConcept;

public class OverriddingClass extends Polymorphisam {
	
	@Override
	public void accountName(int a) {
		System.out.println(a);
		
	}
	
	public static void main(String args[]) {
		
		OverriddingClass over=new OverriddingClass();
		over.accountName(35);
	}
	
	
	
}
