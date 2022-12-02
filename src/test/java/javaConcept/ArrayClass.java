package javaConcept;

public class ArrayClass {
	
	public void sizeArray() {
		
		int num[]=new int[5];
		
		num[0]=5;
		num[1]=10;
		num[2]=15;
		num[3]=20;
		num[4]=25;
		
		for(int i=0;i<num.length;i++) {
			System.out.println("This is array's value"+num[i]);
		}
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println("This is reversal print"+num[i]);
		}
		
	}
	
	public void valueArray() {
		int i;
		String name[]= {"java","selenium","cucumber"};
		
		for(i=0;i<name.length;i++) {
			System.out.println("The name's are"+name[i]);
		}
		
	}
	
	public static void main(String args[]) {
		
		ArrayClass array=new ArrayClass();
		array.sizeArray();
		array.valueArray();
		
	}

}
