package javaprograms;

public class ArithUsingGlobalVar {
	int a = 200;
	int b = 100;

	void add() {
		System.out.println(a + b);
	}

	void Sub() {
		System.out.println(a - b);
	}

	void mul() {
		System.out.println(a * b);
	}

	void div() {
		System.out.println(a / b);
	}

	void mod() {
		System.out.println(a % b);
	}

	public static void main(String[] args) 
	{
		ArithUsingGlobalVar g = new ArithUsingGlobalVar();
		g.add();
		g.Sub();
		g.mul();
		g.div();
		g.mod();
	}

}
