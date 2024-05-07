package teacher;

import student.Depika;

public class Deepesh //4.what happens outside the package without becoming sub class for access specifier, ideally we have 2 cls one
//is deepesh and depika...so we have created obj of depika and access methods using ref variable
//only public as accessable
{
	public static void main(String[] args) 
	{
		Depika d1 = new Depika();
		d1.add();
		//d1.sub();private
		//d1.mul();protected
		//d1.div();default
	}

}
