package inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//it is public class
		try
		{
			int age = sc.nextInt();//asking user to enter int value, no exception then only try block will execute,
			//if any exception instead of showing the xception to user we make use of catch block showing what we are expecting them to do
			System.out.println(age);
		}
		catch(InputMismatchException a1)//this executes only when we have exception, value to show to customer
		{
			System.out.println("Please enter valid details");
		}
		catch(IndexOutOfBoundsException a2)//this executes only when we have exception, value to show to customer
		{
			System.out.println("Please enter valid details 1");
		}
	
	}

}
//this will help us to control stopping of pgm in middle because of exception, and we want the pgm to keep on running no matter what
//user enters.catch can't have the same exception each catch will have diff exception'