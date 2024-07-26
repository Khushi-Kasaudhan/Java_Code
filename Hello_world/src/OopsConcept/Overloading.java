package OopsConcept;

public class Overloading {
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		System.out.println(obj.mul(2, 5));
		System.out.println(obj.mul(2, 3,4));

	}

}
