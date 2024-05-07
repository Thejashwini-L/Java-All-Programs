package inheritance;
class Addition
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class AccessingNonStatic_method extends Addition
{
	void sub()
	{
		System.out.println("subtraction");
	}

	public static void main(String[] args) 
	{
		 AccessingNonStatic_method ns=new  AccessingNonStatic_method();//we should create obj in child class to access non static methods in parent and child class
		 ns.sub();
		 ns.add();	

	}

}
