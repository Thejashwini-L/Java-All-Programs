package inheritance;
interface assignment_problem
{
	void add();
	void sub();
}
interface child extends assignment_problem
{
	void mul();
	void div();
}
public class Interface_Assignment implements child
{
	static void mod()
	{
		System.out.println("5");
	}
	public static void main(String[] args) 
	{
		
	Interface_Assignment ia = new Interface_Assignment();
	ia.add();
	ia.sub();
	ia.mul();
	ia.div();
	mod();
	}

	@Override
	public void add() {
		System.out.println("1");
		
	}

	@Override
	public void sub() {
		System.out.println("2");
		
	}

	@Override
	public void mul() {
		System.out.println("3");
		
	}

	@Override
	public void div() {
		System.out.println("4");
		
	}
}
	

	
