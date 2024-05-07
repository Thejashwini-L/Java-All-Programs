package teacher;

public class Manish 
{
public static void main(String[] args) 
{
	Rashi r1 = new Rashi();//2.what happens within package for access specifier
	r1.add();
	//r1.sub();//private access specifier can't be accessed within package for condition 2
	r1.mul();
	r1.div();
}
}
