package inheritance;

public class Primitive_Type_Casting {

	public static void main(String[] args) 
	{
		double a = 90;//converting int to double//widening implicitly
		System.out.println(a);
		
		int age = 90;
		double ageofperson= age;//widening implicitly//int to double implicitly
		System.out.println(ageofperson);
		double ageofperson1=(double) age;//widening implicitly//converting int to double explicitly
		System.out.println(ageofperson1);
		
		//==============================================
		
		double pi = 3.14;
		//int p=pi;//implicitly narrowing is not possible. so we have to mention explicitly
		int pivalue = (int) pi;
		System.out.println(pivalue);
		
	}

}
