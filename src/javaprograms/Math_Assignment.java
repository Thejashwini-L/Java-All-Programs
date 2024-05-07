package javaprograms;

public class Math_Assignment {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			double radius = Math.random();
			System.out.println("Radius of circle"+ " "+ radius);
			System.out.println("Area of circle" + " " + Math.PI*radius*radius);
		}

	}

}
