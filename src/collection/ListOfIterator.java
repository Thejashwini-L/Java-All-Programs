package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListOfIterator {

	public static void main(String[] args) 
	{
		System.out.println("Lets understnad everything about List");
		List a1=new ArrayList();//converting child class to super class type List.\, upcasting
		a1.add("Pen");//add method is coming from List
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);
		
		ListIterator i1 = a1.listIterator();//ListIterator is Interface and listIterator is abs cls
		while(i1.hasNext())//forward iteration
		{
			System.out.println(i1.next());//forward iteration
		}
		System.out.println("=====================");
		while(i1.hasPrevious())//reverse iteration which is possible only in listIterator
		{
			System.out.println(i1.previous());//reverse iteration
		}

	}

}
