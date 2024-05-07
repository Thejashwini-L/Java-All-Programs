package inheritance;
class Method_NonStatic
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class NonStatic_ChildClass extends Method_NonStatic
{
	static void Sub()
	{
		System.out.println("subtraction");
	}
	public static void main(String[] args) 
	{
		Sub();
		NonStatic_ChildClass ns=new NonStatic_ChildClass();//we should create obj of child class to access non static method in parent class
		ns.add();	

	}

}
