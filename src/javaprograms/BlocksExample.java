package javaprograms;

public class BlocksExample 
{

	public static void main(String[] args) 
	{
		System.out.println("main method");//we should create obj for invoking const and and IIB
		BlocksExample b = new BlocksExample();//this will call IIb and Const one time
		//BlocksExample b1 = new BlocksExample();//this will call IIb and Const second time
	}
	BlocksExample()
	{
		System.out.println("Construtor");
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}

}
