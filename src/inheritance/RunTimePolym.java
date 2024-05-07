package inheritance;

class Polymorphism
{
	void add()
	{
		System.out.println("Addition1");
	}
}
public class RunTimePolym extends Polymorphism
{
	void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	{
		//RunTimePolym rt = new RunTimePolym();
		//rt.add();
		Polymorphism py = new Polymorphism();//created an obj of parent to call that method which is run time polym
		py.add();
	}

}
