package inheritance;

class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
}

public class InheritanceChild extends Parent
{
	static void sub()
	{
		System.out.println("Subtaction");
	}
public static void main(String[] args) 
{
	sub();
	add();
}
}
