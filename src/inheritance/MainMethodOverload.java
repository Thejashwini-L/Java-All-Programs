package inheritance;

public class MainMethodOverload {

	public static void main(String[] args)//we can overload the main method but with diff parameters
	{
		System.out.println("1");
		main();//calling the main other methods
		main(4
				);
	}
	public static void main()
	{
		System.out.println("2");
	}
	public static void main(int a)
	{
		System.out.println("3");
	}
	public static void main(int a, int b)
	{
		System.out.println("4");
	}

}
