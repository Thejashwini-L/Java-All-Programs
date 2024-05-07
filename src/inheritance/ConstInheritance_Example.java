package inheritance;
class Parent_Class1
{
	Parent_Class1()//#5
	{
		System.out.println("grand parent");//6
	}
}
class Child_Class1 extends Parent_Class1
{
	Child_Class1()//#3
	{
		super();//#4 super calling stmt will call the parent cls cons i.e., Parent_Class1 from child cls Child_Class1
		System.out.println("parent");//7
		
	}
}
public class ConstInheritance_Example extends Child_Class1
{
	ConstInheritance_Example()//#2
	{
		super();//3 which will call the parent class cons from child cls, parent cls here is child_Class1 and child is ConstInheritance_Example
		//by default it will be present even if won't specify explicitly
		System.out.println("Child");//8
	}
	public static void main(String[] args) 
	{
	 new ConstInheritance_Example();//#1
	}

}
