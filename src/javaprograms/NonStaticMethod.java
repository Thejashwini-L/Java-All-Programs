package javaprograms;

public class NonStaticMethod {

	void add() //non static method
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
		
	}
	void Sub() //non static method
	{
		int a=100;
		int b=200;
		System.out.println(a-b);
		
	}
	static void mul()
	{
		int a = 100;
		int b = 200;
		int mul = a*b;//
		System.out.println(mul);
	}
	static void div()
	{
		int a = 200;
		int b = 200;
		int div = a/b;//
		System.out.println(a/b);//quotient
	}
	static void mod()
	{
		int a = 5;
		int b = 2;
		int mod = a%b;//reminder can be anything need not be 0/1
		System.out.println(mod);
	}
public static void main(String[] args) //calling non static method inside main method by creating object
{
	NonStaticMethod a1 = new NonStaticMethod();
	//class name ref variable = keyword classname();
	a1.add();
	a1.Sub();    
	a1.mul();
	a1.div();
	a1.mod();
	
	//using same ref we can call multiple method
	//ref variable method name
}
}
