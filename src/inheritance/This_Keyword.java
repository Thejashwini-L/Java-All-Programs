package inheritance;

public class This_Keyword 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		//System.out.println(age + name + salary);
		this.age=age; //this keyword is used to assign local valu to global value 
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) 
	{
		This_Keyword tk = new This_Keyword();
		tk.student_details(10, "Ram", 1.00);
		System.out.println(tk.age);
		System.out.println(tk.name);
		System.out.println(tk.salary);

	}

}
