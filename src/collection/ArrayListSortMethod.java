package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortMethod {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();//this can accept till 11 size//we created obj and utilise it just like scanner class
		//we can keep on adding without mentioning the size as it is dynamic in nature
		a1.add(15);//in collection each element gets added in form of object
		a1.add(76);
		a1.add(900);//storing heterogenous value which was not possible in array
		a1.add(-120);
		a1.add(65);
		a1.add(23);
		
		System.out.println(a1.get(1));//to get the value at index 1
		System.out.println("Before sorting ->"+ a1);
		a1.set(1, "ram");//we get exception because heterogen value as we trying to replace 15 with ram
		System.out.println(a1.indexOf(15));//gives the elements present in the given index
		//Collections.sort(a1);//collections is class, there we have sort method
		System.out.println("After sorting ->"+a1);
		
		
		
		System.out.println("======================================================");
		
		ArrayList a2 = new ArrayList();//this can accept till 11 size//we created obj and utilise it just like scanner class
		//we can keep on adding without mentioning the size as it is dynamic in nature
		a2.add("Ram");//in collection each element gets added in form of object
		a2.add("Sita");
		a2.add("Lakshman");//storing heterogenous value which was not possible in array
		a2.add("Vasudev");
		System.out.println("Before sorting ->"+ a2);
		Collections.sort(a2);//collections is class, there we have sort method
		System.out.println("After sorting ->"+a2);
	}

}
