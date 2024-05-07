package inheritance;

public class Array_Average_Assignment 
{
	static int sum = 0;
	static double sum1=0;
	static double total=0;
	static double average = 0;
public static void main(String[] args) 
{
	 int num1[]=new int[4];
	 num1[0]=12;
	 num1[1]=10;
	 num1[2]=11;
	 num1[3]=15;
	 for(int i=0;i<num1.length;i++)
	 {
		 sum=sum+num1[i];
	 }
	 System.out.println(sum);
	double num2[]=new double[4];
	 num2[0]=12;
	 num2[1]=10;
	 num2[2]=11;
	 num2[3]=15;
	 for(int i=0;i<num2.length;i++)
	 {
		 sum1=sum1+num2[i];
	 }
	 System.out.println(sum1);
	 total = sum+sum1;
	 System.out.println(total/(num1.length+num2.length));
}
}
