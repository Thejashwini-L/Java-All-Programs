package inheritance;
interface Interface2
{
	void login();//all the abs method in interface are by default public in nature no need to mention and that will be seen when we override
	void logout();//no need to mention as abstract for abs method in case of Interface
}
interface Interface1 extends Interface2
{
	void search();
	void payment();
}
public class ClassWithInterface implements Interface1
{
	void order_page()
	{
		
	}
	static void address_page()
	{
		
	}
public static void main(String[] args) 
{
	ClassWithInterface CI = new ClassWithInterface();
	address_page();
	CI.login();
	CI.logout();
	CI.search();
	CI.payment();
	CI.order_page();
}

@Override
public void login()
{
	
	
}

@Override
public void logout() {
	// TODO Auto-generated method stub
	
}

@Override
public void search() {
	// TODO Auto-generated method stub
	
}

@Override
public void payment() {
	// TODO Auto-generated method stub
	
}
}
