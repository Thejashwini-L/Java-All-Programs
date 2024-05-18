package inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{	
		int sa = sc.nextInt();
		String name[]=new String[3];
		name[0]="mRa";
		name[1]="Sita";
		name[2]="Laxman";
		System.out.println(sa);
		for(int i=0;i<name.length;i++)
		{
		System.out.println(name[i]);
		}
		}
		catch(InputMismatchException a1)//this executes only when we have exception, value to show to customer
		{
			System.out.println("Please enter only int value");
		}
		

	}

}
