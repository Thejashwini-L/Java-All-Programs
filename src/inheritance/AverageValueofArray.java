package inheritance;

public class AverageValueofArray {
static double average = 0;
static int sum=0;
static int reminder=0;
	public static void main(String[] args) 
	{
		int number[]=new int[4];
		number[0]=10;
		number[1]=20;
		number[2]=20;
		number[3]=10;
		
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
			average=sum/number.length;// / gives quotient
			reminder=sum%number.length;// % gives reminder
		}
		System.out.println(sum);
		System.out.println(average);
		System.out.println(reminder);
	}

}
