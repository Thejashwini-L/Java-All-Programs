package javaprograms;

public class GlobalVariable 
{
	static int age;//it will take default value
	static double weight;//it will take default value
	String name="Global";//non static global variable 
	
/*static int age=20;//global variables, we can declare global variable here and initialize in same line or we can initialize in main method
static String name;//global variables
static void add()
{
	System.out.println(age);
}*/
	public static void main(String[] args) 
	{
		/*System.out.println(name);//it will take default value
		age=19;
	//	System.out.println(age);
		name="Java";
		System.out.println(name);
		name="prog";
		System.out.println(name);*/
        System.out.println(age);
        System.out.println(weight);
        GlobalVariable g = new GlobalVariable();//creating obj to access non-static gv
        g.name="GV";
        System.out.println(g.name);
	}

}
