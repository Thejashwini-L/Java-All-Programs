package inheritance;

import java.util.Arrays;

public class String_CopyOfArray {

	public static void main(String[] args) 
	{
		String name[]=new String[4];
		name[0]= "Anu";
		name[1]= "Sonu";
		name[2]= "Monu";
		name[3]= "Nonu";
		String namecopy[]=new String[name.length];
		String reverse = "";
		
		for(int i=0;i<name.length;i++)
		{
		namecopy[i]=name[i];//to copy content of one array to another
		}
		
    System.out.println(Arrays.toString(name));
    System.out.println(Arrays.toString(namecopy));
		
		for(int i=name.length-1;i>=0;i--)
		{
		namecopy[i]=name[i];
		reverse=reverse+namecopy[i]+ " ";//to print in reverse order
		}
		//char ch[] = reverse.toCharArray();
		//System.out.println(Arrays.toString(ch));
		
    System.out.println(reverse);
}
}
