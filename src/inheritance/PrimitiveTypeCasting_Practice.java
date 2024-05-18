package inheritance;

public class PrimitiveTypeCasting_Practice {

	public static void main(String[] args)
	{
		byte age=82;//widening
		double ageofperson = age;
		System.out.println(ageofperson);
		double age1 = 1000;
		System.out.println(age);
		
		System.out.println("===========================");
		
		double age2 = 1000;
		int ageofperson1 = (int) age2;
		System.out.println(ageofperson1);
		
		float age3= ageofperson1;
		System.out.println(age3);
		
		System.out.println("======================");
		
		int ar = 190;
		System.out.println(ar);
		double ar1 = ar;
		System.out.println(ar1);
		double ar2= (double) ar1;
		System.out.println(ar2);
		
		byte b1 = (byte)1.89;
		System.out.println(b1);
		

	}

}
