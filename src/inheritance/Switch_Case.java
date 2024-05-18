package inheritance;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		//int no=9;
		//switch(no)
		switch(no)//specify which case to get executed
		{
		case 1:
			System.out.println("Chrome");
			break;//this will stop executing next line
			
		case 2:
			System.out.println("goodle");
			break;
			
		case 3:
			System.out.println("firefox");
			break;
			
		case 4:
			System.out.println("edge");
			break;
			
		case 5:
			System.out.println("safari");
			break;
			
			default:
				System.out.println("what is ");
		}

	}

}
