package inheritance;
interface YouTube//this is for outer world
{
	void watch_later();
	void play();
}
interface Gmail //this is for outer world
{
	void send_schedule();
	void inbox();
}

public class Google_MultipleInheritance_Interface implements YouTube,Gmail //refer diag in notes, this is multiple level inheritance
//this is for our logic
{

	public static void main(String[] args) 
	{
		Google_MultipleInheritance_Interface mi = new Google_MultipleInheritance_Interface();
		mi.watch_later();
		mi.play();
		mi.send_schedule();
		mi.inbox();

	}

	@Override
	public void send_schedule() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inbox()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watch_later() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
