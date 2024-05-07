package inheritance;

public class Array_Examp {

	public static void main(String[] args) 
	{
		String name[] = new String[3];
		//initialization and declaration
		name[0] = "Anus";
		name[1] = "Sury";
		name[2] = "Monu";
		//name[3] = "nonu";//this will cause arrayoutofbound exception as the size mentioned is 3 but data given is 4
		
		int rollno[] = new int[3];
		//initialization and declaration
		rollno[0] = 1;
		rollno[1] = 2;
		rollno[2] = 3;
		rollno[2] = 4;//we can update value
		
		char gender[] = new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='F';
		
		System.out.println("Name" + " " + "Roll No" + " " + "Gender");

		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i] + "    " + rollno[i]+ "     "+  gender[i]);
		}

	}

}
