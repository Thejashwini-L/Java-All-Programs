package javaprograms;

public class FinalVariable {
	final static double pi =3.14;
	static int r=2;
	static void area()
	{
		//
		int r=3;//
		System.out.println(pi*r*r);
	}
	static void circum()
	{
		System.out.println(2*pi*r);
	}

	public static void main(String[] args) 
	{
		
	area();
	circum();
	
	}

}
