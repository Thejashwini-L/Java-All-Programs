package inheritance;
class Api_progaram
{
	private int age=10;//71//1//8
	private String Un="Manu";//we can have multiple private username
	//private String pwd = "Asst@123";
	
	public int getAge() //system generated get and set method//2//9
	{
		return age;//10
	}

	public void setAge(int age) //3//6
	{
		this.age = age;//7
	}

	public String getUn()
	{
		return Un;
	}
	
	public void setUn(String Un)
	{
	this.Un = Un;
	}
	
}
public class Encapsulation_Program1 {

	public static void main(String[] args) 
	{
		Api_progaram ap = new Api_progaram();//4
		ap.setAge(71);//we are setting the value which was 10 before//5
		System.out.println(ap.getAge());//11//after setting we should get that value, getter method doesn't have the sysout, so
		//we call it inside main method by ref var
		ap.setUn("Sonu");
		System.out.println(ap.getUn());
	}

}
