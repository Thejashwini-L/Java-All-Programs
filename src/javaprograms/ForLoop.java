package javaprograms;

public class ForLoop {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)//to print 1 to 10
		{
			System.out.println(i);
			
		}
		for(int i=19;i>27;i++)//to print 19 to 26
		{
			System.out.println(i);
			
		}
		for(int i=100;i>=0;i--)//to print 100 to 0
		{
			System.out.println(i);
			
		}
		for(int i=-1;i>=1;i++)//
		{
			System.out.println(i);
			
		}
		for(int i=-50;i<=-30;i--)//to print -50 to -30, -30 is bigger than -50
		{
			System.out.println(i);
			
		}
		for(int i=-10;i<=10;i++)//to print -10 to 10
		{
			System.out.println(i);
			
		}
/* to print and even number using only for*/
		
		for(int i=1;i<=100;i++)//odd num
		{
				{
				System.out.println(i +"is odd");
				i++;
				}
		}
		for(int i=2;i<=100;i++)//even num
		{
				{
				System.out.println(i + "is even");
				i++;
				}
		}
/* to print and even number using using for and if*/
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number "+ i);
			}
			else
			{
				System.out.println("Odd number "+ i);
			}
				
		}
	}

}
