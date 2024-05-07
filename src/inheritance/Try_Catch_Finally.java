package inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Finally {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//it is public class
		try
		{
			int age = sc.nextInt();//asking user to enter int value, no exception then only try block will execute,
			//if any exception instead of showing the xception to user we make use of catch block showing we have exception
			System.out.println(age);
		}
		catch(InputMismatchException a1)//this executes only when we have exception, value to show to customer
		{
			System.out.println("Handed the Exception");
		}
		finally
		{
			System.out.println("Thank you for visiting, come again");//msg to customer no matter if try or catch executes
		}
	
		

	}

}
