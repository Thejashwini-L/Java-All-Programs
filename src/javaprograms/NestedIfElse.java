package javaprograms;

public class NestedIfElse
{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a > b) 
		{

			if (a != b) 
			{
				if(a==b)
				{
				System.out.println("One");
				}
				else
				{
				System.out.println("Two");	
				}
			} 
			else 
			{
				System.out.println("Three");
			}
		} 
		else //we can have if else block within else also
		{
			if(a!=b)
			{
				System.out.println("Else one");
			}
			else
			{
				System.out.println("Else two");
			}
		}
	}
	
}
		

//we can have onle if stmt as well without else
/*if(C1)
{
	if(C2)
	..
	if(C3)
}
}*/

