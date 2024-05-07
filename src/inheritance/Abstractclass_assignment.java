package inheritance;
class parent_concrete
{
	void add()
	{
		System.out.println("1");
	}
	void sub()
	{
		System.out.println("2");
	}
}
abstract class child_abstract extends parent_concrete
{
	abstract void child();
	abstract void child1();
	void mul()
	{
		System.out.println("3");
	}
	static void div()
	{
		System.out.println("4");
	}
}
public class Abstractclass_assignment extends child_abstract
{
void mod()
{
	System.out.println("5");
}
void dom()
{
	System.out.println("6");
}
	public static void main(String[] args)
	{
		Abstractclass_assignment ac = new Abstractclass_assignment();
		ac.add();
		ac.sub();
		ac.mul();
		div();
		ac.mod();
		ac.dom();
		
		ac.child();
		ac.child1();
	}
	@Override
	void child() {
		System.out.println("7");
		
	}
	@Override
	void child1() {
		System.out.println("8");
		
	}

}
