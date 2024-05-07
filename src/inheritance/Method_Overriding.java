package inheritance;
class Method_Parent
{
	void add()
	{
		System.out.println("Login through password");//5
	}
}
public class Method_Overriding extends Method_Parent
{
		void add()
		{
			System.out.println("Login through email");//3
			super.add();//4//using super keyword to get parent class implementation, super key word should be used with child class inside the method but not main method
		}
	
	public static void main(String[] args) 
	{
		Method_Overriding or=new Method_Overriding(); //1//obj created in child class to call non static method
		or.add();//2
		//or.add();//no matter how many times we call only one method will get executed
		
	}

}
