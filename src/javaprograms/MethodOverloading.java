package javaprograms;

public class MethodOverloading 
{
	void add() 
	{
	System.out.println("d");
	}
	static void add(int a) 
	{
		 a=100;//updating value, instead of 1 it will take 100
		System.out.println(a+7);
	}
	static void add(int a, double b) 
	{
		System.out.println(a+b);
	}	
	public static void main(String[] args) { 
		MethodOverloading w = new MethodOverloading();
		w.add();
		add(1);
		add(2, 3.1);
		

	} 

}
