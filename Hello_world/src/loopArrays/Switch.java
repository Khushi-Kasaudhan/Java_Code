package loopArrays;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = 10; 
		switch(val%2) {
		case 0:
			System.out.print(val);
			System.out.println("is even");
			break;
		case 1:
			System.out.print(val);
			System.out.println("is odd");
			break;
		default: 
			System.out.println("oops it broke");
			break;
		}
	}

}
