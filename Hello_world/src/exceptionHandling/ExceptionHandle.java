package exceptionHandling;

public class ExceptionHandle {
	public static void validate(int num)
	{
		if(num<18) {
			throw new ArithmeticException("Person is not able to vote");
		}else {
			System.out.println("Person is able to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		validate(13);
		System.out.println("rest of the code");
	}

}
