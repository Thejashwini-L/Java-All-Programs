package inheritance;

public class Palindrome_Program {

	public static void main(String[] args) 
	{
		String input = "MOM";//while taking string function make sure i/p is of same case either upper/lower
		String reverse = "";
		for(int i = input.length()-1;i>=0;i--)
		{
		char op = input.charAt(i);//as the return type is char we can't use the string method, so below step is used where char is changed to string
		//so that we can make use of .equals for comparison 
		reverse=reverse+op;//reverse = 0 at first iteration, then n gets stored, then n+a, then n+a+m
		}
		System.out.println(reverse);
		if(input.equals(reverse))
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
