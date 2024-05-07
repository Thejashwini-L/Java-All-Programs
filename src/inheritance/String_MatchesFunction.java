package inheritance;

import java.util.Arrays;

public class String_MatchesFunction {

	public static void main(String[] args) 
	{
		String input = "Manish";
		input.matches("M(.*)");//used to check if the given string starts with M
		System.out.println(input.matches("M(.*)"));//to check if i/p starts with M
		System.out.println(input.matches("(.*)h"));//to check if i/p starts with h
		System.out.println(input.matches("......")); //to check if i/p contains 6 letters
		
		String ip = "school";
		int ip1 = ip.lastIndexOf('o');	//to find last index of given string
		System.out.println(ip1);
		
		System.out.println(ip.repeat(10));//used to repeat the given string
		
		String name = "My name is Manish";
		String s[] = name.split(" ");//splitted or separated where ever we have space in given string
		String s1[] = name.split("M");//splitted or separated where ever we have m in given string
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(s1));
	}

}
