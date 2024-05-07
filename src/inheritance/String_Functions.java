package inheritance;

public class String_Functions 
{

	public static void main(String[] args) 
	{
		String name = "School";
		//int lengh_of_String = name.length();
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.err.println(name.indexOf('c'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is PBS"));
		String first_name="JSB";
		String last_name="BSM";
		System.out.println(first_name.concat(" ").concat(last_name));
		System.out.println(name.contains("Sch"));//it show if that string contains the sequence of chars in name = school//java is case sensitive
        String title_of_page = "We are here for your needs    ";
		System.out.println(title_of_page.trim());//trim the space in front and back
	}

}
