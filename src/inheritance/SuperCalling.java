package inheritance;
class College
{
	College(String college_name)//#4
	{
		System.out.println("College");//#5
	}
}
class School //extends College
{
	School(int a, String b, double c)//#2
	{
		//super("SSVM");//#3, as school extends college we need to create super keyword with paramenters as college explicitly
		System.out.println("School");//#6
	}
}
public class SuperCalling //no relation with school cls but to invoke that we should create obj of it
{
public static void main(String[] args) 
{
	School sc = new School(1, "Ram", 1.1);//#1
	
}
}
