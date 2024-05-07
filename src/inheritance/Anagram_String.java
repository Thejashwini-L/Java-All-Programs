package inheritance;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) 
	{
		String input = "bread";
		String input1 = "bear";
		if(input.length()!=input1.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
		char c1[] = input.toCharArray();//convert string to array so that we can sort
		char c2[] = input1.toCharArray();
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(c1));//string can't be sorted hence converting to array
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);//used to sort array
		Arrays.sort(c2);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("they are anagram");
		}
		else
		{
			System.out.println("they are not anagram");
		}
		}
	}

}
