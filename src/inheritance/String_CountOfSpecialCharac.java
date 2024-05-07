package inheritance;

import java.util.Arrays;

public class String_CountOfSpecialCharac 
{
	static int countofalpha =0;
	static int countofnumeric =0;
	static int countofspace =0;
	static int countofspecialcharac =0;
	public static void main(String[] args) 
	{
		String name = "Manish Kumar Tiwari12*^&";
		char c1[] = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		int totallenght = c1.length;
		for(int i=0;i<c1.length;i++)
		{
			boolean answer =  Character.isAlphabetic(c1[i]);
			if(answer==true)
			{
				countofalpha++;
			}
			boolean answer1 =  Character.isDigit(c1[i]);
			if(answer1==true)
			{
				countofnumeric++;
			}
			boolean answer2 =  Character.isSpaceChar(c1[i]);
			if(answer2==true)
			{
				countofspace++;
			}
		}
		System.out.println("Total length" + " " + totallenght);
		System.out.println("Count of alpha" + " " + countofalpha);
		System.out.println("Count of numeric" +  " " +countofnumeric);
		System.out.println("Count of space" +  " " +countofspace);
		 int countofspecialcharac = totallenght - (countofalpha + countofnumeric +  countofspace);
		 System.out.println("Count of specialcharacters" +  " " +countofspecialcharac);

	}

}
