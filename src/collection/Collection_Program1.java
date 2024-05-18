package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Program1 {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();//initial capacity is 10 size//we created obj and utilise it just like scanner class
		//we can keep on adding without mentioning the size as it is dynamic in nature
		a1.add("Ram");//in collection each element gets added in form of object
		a1.add("Umesh");
		a1.add(12);//storing heterogenous value which was not possible in array
		a1.add("67");
		a1.add(true);
		a1.add(90);
		System.out.println(a1);
		System.out.println(a1.contains("Sita"));
		System.out.println(a1.size());
		
		Iterator i1 = a1.iterator();//return type is iterator, iterator coming from ArrayList
		//Iterartor is Interface, iterator is abs method inside Iterator interface
		//iterator we have 2 method hasnext and next
		//Iterator have 2 method hasnext and next
		while(i1.hasNext())//check if there is next element
		{
			System.out.println(i1.next());//next will show the next element
		
		}
		

	}

}
