package inheritance;
interface keyboard//interface
{
	void login();//abs method
}
public class InterfaceExam implements keyboard //implements key word used to create relation b/w cls and interface
{

	public static void main(String[] args) 
	{
		InterfaceExam ie=new InterfaceExam();
		ie.login();
	}

	@Override
	public void login() 
	{
		System.out.println("Login with Mobile no");
		
	}

}
