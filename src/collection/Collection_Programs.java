package collection;

import java.util.ArrayList;

public class Collection_Programs {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();//this can accept till 11 size//we created obj and utilise it just like scanner class
		//we can keep on adding without mentioning the size as it is dynamic in nature
		a1.add("Ram");//in collection each element gets added in form of object
		a1.add("Umesh");
		a1.add(12);//storing heterogenous value which was not possible in array
		a1.add("67");
		a1.add(true);
		a1.add("90");
		a1.remove(0);//remove the element at given index
		a1.remove("90");
		a1.remove("67");//remove the object 67 itself, hardcoring the value
		System.out.println(a1);//keep an adding to the arrayList
		a1.clone();//creating copy of existing a1
		/*System.out.println(a1);
		a1.clear();//obj will be cleared, a1 is made empty
		System.out.println(a1);
		boolean b1=a1.isEmpty();//check if the a1 is empty, then gives true/false
		System.out.println(b1);*/
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);//in a2 we want to add a1
		a2.add(1, "Manish");//adding Manish at index 1 of a2
		a2.addAll(0, a1); //want to add a1 content at index position 0, rest a2 value will be shifted right hand side
		//a2.addAll(100, a1);//we can declare size and utilize
		System.out.println("Before removing a1 -> "+a2);
		//a2.removeAll(a1);//removing entire a1 content from a2
		System.out.println("After removing a1 -> "+ a2);
		
		ArrayList a3 = new ArrayList();
		a3 = (ArrayList) a2.clone();//explicitly downcasting//made a3 as replica of a2l
		System.out.println(a3);

	}

}
