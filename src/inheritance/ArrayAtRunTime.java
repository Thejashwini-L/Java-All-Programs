package inheritance;

import java.util.Scanner;

public class ArrayAtRunTime {

	public static void main(String[] args) 
	{
		
		Scanner sc = new  Scanner(System.in);
		int rollno[] = new int[3];//array
		
		
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the Array" + " " + i);
			rollno[i] = sc.nextInt();
			System.out.println(rollno[i]);
		}

	}

}
