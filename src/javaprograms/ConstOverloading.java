package javaprograms;

public class ConstOverloading 
{
	ConstOverloading()//Constructor -Method 1
    {
    	System.out.println("Constructor");
    }
	ConstOverloading(int a)//Constructor overloading with param
    {
    	System.out.println("Constructor with parameter");
    }
	ConstOverloading(int a,int b, int c, int d, int e, int f, int g)//Constructor overloading with param
    {
    	System.out.println("Constructor with parameters");
    }

	public static void main(String[] args) 
	{
		ConstOverloading c = new ConstOverloading();
		new ConstOverloading(1);
		new ConstOverloading(1,2,3,4,5,6,7);
		
	}

}
