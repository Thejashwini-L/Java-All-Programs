package javaprograms;

public class CallingConstreutor
{
    CallingConstreutor()//Constructor -Method 1
    {
    	System.out.println("Constructor");
    }
    void add()//method 2
    {
	System.out.println("Non Static method");
    }
    static void sub()//method 3
    {
    	System.out.println("Static method");
    }
	public static void main(String[] args) //method 4
	{
		CallingConstreutor c = new CallingConstreutor();//this will invoke const//Syntax 1
		new CallingConstreutor();//this will invoke const //Syntax 2  
		c.add();//this will invoke Non static
		sub();//this will invoke static

	}

}


