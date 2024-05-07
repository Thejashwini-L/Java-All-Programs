package teacher;

import student.Depika;//diff package

public class Sourab extends Depika//3.what happens outside the package by becoming sub class for access specifier, ideally we have 2 cls one
//is depika and sourab...so we have made sourab as child cls...parent and child cls present but in diff package
{
   public static void main(String[] args) 
	{
	   Sourab sb= new Sourab();
	   sb.add();
	   sb.mul();
	   //sb.sub();private is not accessable in case of 3
	   //sb.div();default is not accessable in case of 3
	   

	}

}
