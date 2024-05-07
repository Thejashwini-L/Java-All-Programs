package inheritance;

public class Object_Class extends Object //not necessary to mention extends Object by default, all cls will extend obj cls
{

	public static void main(String[] args) 
	{
		Object_Class oc= new Object_Class();
		oc.getClass();//it is used to get cls name
		System.out.println(oc.getClass());
		oc.toString();

	}

}
