package inheritance;
class Parent_Class2
{
	Parent_Class2(int a)//6
	{
		System.out.println("grand parent");//7
	}
}
class Child_Class3 extends Parent_Class2
{
	Child_Class3(int a, double b)//4
	{
		super(12);//5
		System.out.println("parent");//8
	}
}
public class ConstInheritance_supercallingstmt extends Child_Class3
{
	ConstInheritance_supercallingstmt()//2
	{
		super(1, 2.2);//3
		System.out.println("Child");//9
		
	}
	public static void main(String[] args) 
	{
		new ConstInheritance_supercallingstmt();//1
	}

}
