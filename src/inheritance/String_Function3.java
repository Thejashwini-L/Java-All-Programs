package inheritance;

public class String_Function3 {

	public static void main(String[] args) {
		String input  = "";
		System.out.println(input.isEmpty());//method which as is then the return type is boolean.
		String input1  = "Manish Kumar Tiwari";
		System.out.println(input1.substring(1));
		System.out.println(input1.substring(13));
		System.out.println(input1.subSequence(7, 11));//in case of substring with 2 param, end index will be 1 lesser, instead of 11 it is 12
		System.out.println(input1.subSequence(7, 12));
		System.out.println(input1.subSequence(0, 2));
	
	}
}
