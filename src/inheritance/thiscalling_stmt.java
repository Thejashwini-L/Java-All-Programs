package inheritance;

public class thiscalling_stmt 
{
	thiscalling_stmt()//2 const without param
	{
		this(1);//3 invoke cons with param as int//to call one cons from anothor cons within same cls we use this calling stmt
		System.out.println("1");	
	}
	thiscalling_stmt(int a)//4
	{
		this(1, 1.1);//5 invoke cons with para int and double
		System.out.println("2");//7a
	}
	thiscalling_stmt(int a, double b)//6
	{
		System.out.println("3");//7
	}
	public static void main(String[] args) 
	{
		new thiscalling_stmt();//1
	}

}
