package inheritance;

import java.util.Arrays;

public class String_ContainsOnlyDigits {
static int countdigit = 0;
	public static void main(String[] args) 
	{
		String num = "12346g";
		int length = num.length();
		char[] digit=num.toCharArray();
		System.out.println(Arrays.toString(digit));
		for(int i=0;i<num.length();i++)
		{
			boolean num1 = Character.isDigit(digit[i]);
			if(num1==true)
			{
				countdigit++;
			}
		}
		System.out.println("The count of digit ->" + countdigit);
		if(countdigit==length)
		{
			System.out.println("Given String contains only digit");
		}
		else
		{
			System.out.println("Given String doesn't contain only digits");
		}
	}

}
