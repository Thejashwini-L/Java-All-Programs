package inheritance;

public class AssertProgram {
	static void add(int a, int b)
	{
		assert a==100
				;//if given value for a=100, then only perform addition if not then will get assertion error
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		add(100,200);
		String name = "";
		assert name.length()>0;//syntax 1
		assert name.length()>0:"The length is 0 or less";//syntax 2
		System.out.println(name.concat(" Jatin"));
	}

}
