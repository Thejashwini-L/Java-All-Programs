package inheritance;

public class StringArray_toremovenumeric {

	public static void main(String[] args) 
	{
		String input = "Sschool123";
		String output = input.replace('o', ' ');
		String output1 = input.replace('o', 'm');//replaced o with space
        System.out.println(output);
        System.out.println(output1);

        String output2=input.replaceAll("[a-z]", "");//replace alphabets from the given string
        System.out.println(output2);
        
        String output3=input.replaceAll("[A-Z]", "");//replace alphabets from the given string
        System.out.println(output3);
        
        String output4
        =input.replaceAll("[0-9]", "");//replace alphabets from the given string
        System.out.println(output4);
	}

}
