package javaprograms;

public class SIbBlock 
{
	static //SIB
	{
		System.out.println("SIB 1");//we can have ,ultiple SIB's in same class and execution will happen sequentially and then the main method gets executed
	}
	static //SIB
	{
		System.out.println("SIB 2");
	}
	static //SIB
	{
		System.out.println("SIB 3");
	}
	{
		System.out.println("IIB 1");//IIB
	}
	{
		System.out.println("IIB 2");//IIB
	}
	public static void main(String[] args) 
	{	
    System.out.println("Maain method");
    SIbBlock i = new SIbBlock();//to invoke IIB we should create object
    
	}
	static //SIB
	{
		System.out.println("SIB 4");
	}

}
