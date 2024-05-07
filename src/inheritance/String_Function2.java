package inheritance;

public class String_Function2 
{
static void reverse_vertical_name()
{
	String input = "Theju";
	for(int i=input.length()-1;i>=0;i--)
	{
		System.out.println(input.charAt(i));
	}
}
	public static void main(String[] args) 
	{
		reverse_vertical_name();
		String input = "Theju";
		/*System.out.println(input.charAt(0));//this is not good approach, instead we can go for for loop
		System.out.println(input.charAt(1));*/
          System.out.println("=========");
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i));
		}
		
	}

}
