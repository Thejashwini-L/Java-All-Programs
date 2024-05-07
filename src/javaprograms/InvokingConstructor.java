package javaprograms;

class StudentConstructor
{
	StudentConstructor(int a)
	{
		System.out.println("Student Constructor");
	}
}

public class InvokingConstructor 
{
	InvokingConstructor()
	{
		System.out.println("InvokingConstructor");
	}
	public static void main(String[] args) 
	{
		new InvokingConstructor();
		new StudentConstructor(1);

	}

}
