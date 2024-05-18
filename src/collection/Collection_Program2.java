package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection_Program2 {

	public static void main(String[] args) 
	{
		System.out.println("Lets understnad everything about List");
		List a1=new ArrayList();//converting child class to super class type List.\, upcasting
		a1.add("Pen");//add method is coming from List
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);//list follow indexing, so o/p is how we entered value
		//order of insertion-true
		a1.add("Pen");//List allow duplicates
		System.out.println(a1);
		a1.add(null);//list accept as many null we enter
		a1.add(null);
		System.out.println(a1);
		
		Iterator i1= a1.iterator();//iterator behaves same for list and set
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		System.out.println("Lets understnad everything about Set");
		Set a2=new HashSet();//converting child class to super class type List.\, upcasting
		a2.add("Pen");//add method is coming from Set
		a2.add("pencil");
		a2.add("box");
		a2.add("bottle");
		System.out.println(a2);//set don't follow indexing rather they follow hashcode value - random value that get generate
		//set of do-not follow oder of insertion, order we enter the value
		a2.add("Pen");//set wont allow duplicates
		System.out.println(a2);
		a2.add(null);//set accept only one null
		a2.add(null);
		System.out.println(a2);
		
		Iterator i2= a2.iterator();//iterator behaves same for list and set
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}

}
