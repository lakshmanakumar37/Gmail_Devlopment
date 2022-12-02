package javaConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaCollections {

	public void arrayListCollection() {
		
		List<String> arrayList=new ArrayList<String>();
		
		arrayList.add("Java");
		arrayList.add("Java");
		arrayList.add("Selenium");
		arrayList.add("Cucumber");
		arrayList.add(0, "TestNG");
	
		
		List<String> nextList=new ArrayList<String>();
		nextList.addAll(arrayList);
		
		//Iterator<String> itr=nextList.iterator();
		
		ListIterator<String> ltr=nextList.listIterator();
		
		while(ltr.hasPrevious()) {
			System.out.println("This is reverse"+ltr.previous());
		}
		
		/*
		 * while(itr.hasNext()){ System.out.println("The list"+itr.next()); }
		 */
		
	}
	
	public void linkedListCollection() {
		
		List<Integer> linkedList=new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		
		for(Integer each:linkedList) {
			System.out.println("This is for each loop:"+each);
		}
		
		linkedList.forEach(var -> System.out.println(var));
		
	}
	
	public static void main(String args[]) {
		JavaCollections jv=new JavaCollections();
		//jv.arrayListCollection();
		jv.linkedListCollection();
	}
}
