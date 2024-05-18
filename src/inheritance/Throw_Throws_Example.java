package inheritance;
import java.lang.Exception;// to get all java exception present
import java.util.InputMismatchException;
public class Throw_Throws_Example {

	public static void main(String[] args) throws NullPointerException,InputMismatchException//exception declaration
	{
		//throw new NullPointerException();//syntax 1 to throw any exception
		throw new NullPointerException("File sent was empty");//syntax 2 to throw any exception
	}

}
