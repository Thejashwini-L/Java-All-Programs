package javaprograms;

public class MathClass {

	public static void main(String[] args) 
	{
		double pi = Math.PI;//we can write both the ways
		System.out.println(Math.PI);
		System.out.println(Math.addExact(100, 100));
		System.out.println(Math.addExact(189990, 188888888));
		System.out.println(Math.subtractExact(100, 10));
		System.out.println(Math.subtractExact(100000, 9000));
		System.out.println(Math.multiplyExact(100, 100));
		System.out.println(Math.sqrt(55));
		System.out.println(Math.max(63, 98));
		System.out.println(Math.min(10, 0));
		System.out.println(Math.random());//provide random number between 0-1, double can stor deci upto 17, return type is double
		for(int i=0;i<100;i++)
		{
			System.out.println(Math.random());
		}
		
		
		


	}

}
