package javaprograms;

public class LogicalOperators {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a>6 || b==a)//or operator c1 is T and C2 is F, c1 or c2
		{
			System.out.println("Or Operator");
		}
		if(a>6 && b!=a)//c1 and c2 are T, c1 and c2
		{
			System.out.println("And Operator");
		}
		if(!(a>6 || b==a))
		{
			System.out.println("Or with Not Operator");//Not will reverse the o/p
		}
		if(!(a>6 && b==a))
		{
			System.out.println("And with Not Operator");
		}
	}

}
