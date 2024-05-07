package inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintInEasyWay {

	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
	    
	int rollno[] = new int[3];//array
	for(int i=0;i<rollno.length;i++)
	{
		System.out.println("Enter the Array" + " " + i);
		rollno[i] = sc.nextInt();
		
	}
	
    int rollno1[] = new int[3];//array
	for(int i=0;i<rollno1.length;i++)
	{
		System.out.println("Enter the Array" + " " + i);
		rollno1[i] = sc.nextInt();
		
	}

		System.out.println(Arrays.toString(rollno));//we have arrays class which as toString method which helps to print array data in horizontal
		System.out.println(Arrays.toString(rollno1));
		if(Arrays.equals(rollno, rollno1)==true)
		{
		//System.out.println(Arrays.equals(rollno, rollno1));//
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
