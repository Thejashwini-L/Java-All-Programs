package javaprograms;

public class ExIfElse 
{
public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a>b)//10>20, if the first stmt is true that will be o/p rest will be ignored
		{
			System.out.println("1");
		}
		else if(a>=b)//we can have multiple else if block within same if block
		{
			System.out.println("2");
		}
		else if(a<=b)
		{
			System.out.println("3");
		}
		else if(a!=b)
		{
			System.out.println("4");
		}
		else
		{
			System.out.println("5");
		}
	}

}
