package inheritance;

class staticparent
{
	static void add()
	{
		System.out.println("Addition");
	}
}
public class Inheritance_Example extends staticparent
{
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		add();
		Inheritance_Example ns=new Inheritance_Example();//create obj of child class to access non static method
		ns.sub();

	}

}
