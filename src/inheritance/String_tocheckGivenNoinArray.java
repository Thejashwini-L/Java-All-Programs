package inheritance;

public class String_tocheckGivenNoinArray
{

	public static void main(String[] args) 
	{
		int nos[]=new int[4];
		nos[0]=41;
		nos[1]=41;
		nos[2]=41;
		nos[3]=22;
		int givenno=41;
		int Nooccurance =0 ;
		
		
		for (int i=0;i<nos.length;i++)
		{
			if(givenno==nos[i])
			{
				System.out.println("Num is present in given index"+ " " + i);
				Nooccurance++;
					
			}
			else
			{
				System.out.println("Num is not present in given index"+ " " + i);
			}
		}
		System.out.println("Given no is occured" + " "+ Nooccurance);
	}

}
