package javaprograms;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);//scanner class is para when creating object and also we should close
		
		//int number2=s1.nextInt();
		//System.out.println(number1 + number2);
		byte number1=s1.nextByte();
		System.out.println(number1);
		
		short number2=s1.nextShort();
		System.out.println(number2);
		
		int number3=s1.nextInt();
		System.out.println(number3);
		
		long number4=s1.nextLong();
		System.out.println(number4);
		
		boolean number5=s1.nextBoolean();
		System.out.println(number5);
		
		String number6=s1.next();
		System.out.println(number6);
		
		float number7=s1.nextFloat();//no need to mention f as it is accepting input from us
		System.out.println(number7);
		
		double number8=s1.nextDouble();
		System.out.println(number8);
		
		s1.close();	
	}

}
