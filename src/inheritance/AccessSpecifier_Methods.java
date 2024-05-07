package inheritance;

public class AccessSpecifier_Methods 
{
public void add()
{
	System.out.println("1");
}
private void sub()
{
	System.out.println("2");
}
protected void mul()
{
	System.out.println("3");
}
void div()
{
	System.out.println("4");
}
	public static void main(String[] args) 
	{
		AccessSpecifier_Methods as = new AccessSpecifier_Methods();
		as.add();
		as.sub();
		as.mul();
		as.div();

	}

}
