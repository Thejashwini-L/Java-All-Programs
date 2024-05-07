package inheritance;

import java.util.Arrays;

public class String_CountOfSpace {
static int count_space = 0;
	public static void main(String[] args) { 
		String name = "Manish Tiwari";
		char c1[] = name.toCharArray();//converting string to char of array, so index 0 - M, 1 -a....
		//System.out.println(Arrays.toString(c1));//to show as array in horizontal
		
		for(int i=0;i<c1.length;i++)
		{
			boolean answer = Character.isSpaceChar(c1[i]);//latest method to check if char have space
		System.out.println(Character.isAlphabetic(c1[0]));//to check if all chars are alpha
			if(answer==true)
			{
				count_space++;//each time when its true counts gets incremented, so that we can get how many alphabets are there
			}
		}
		System.out.println("The total count of space " + count_space);
	}

}
