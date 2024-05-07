package inheritance;

class Grand_Parent
//final class Grand_Parent
{
	static void add()
	{
		System.out.println("addition");
	}
}
class arent_Class extends Grand_Parent //final class cn't be inherited
{
	static void sub()
	{
		System.out.println("subtraction");
	}
}
public class Multiple_Inheritance extends arent_Class
{
	static void mul()
		{
		System.out.println("multiplication");
		}
	
	public static void main(String[] args) 
	{
		mul();
		sub();
		add();
		
	}

}
