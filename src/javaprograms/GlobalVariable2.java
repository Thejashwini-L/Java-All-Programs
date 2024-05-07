package javaprograms;

public class GlobalVariable2 
{
    String name="Sita";
    int age=19;
    double weight=80;
    void add(String name,int age,double weight)
    {
    	System.out.println("hey my biodat is "+ name +age +weight);
    }
public static void main(String[] args)
{

  GlobalVariable2 g = new GlobalVariable2();
  g.name="Rama";//updating value for non static global variable	
  System.out.println(g.name);
  System.out.println(g.age);
  g.add("Thej", 15, 40);
	}

}
