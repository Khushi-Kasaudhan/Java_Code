package OopsConcept;

class Parent{
	protected int num = 1;
	Parent(){
		System.out.println("Parent class default constructor");
	}
	Parent(String x){
		System.out.println("Parent class parameterised constructor");
	}
	public void foo() {
		System.out.println("Parent class foo");
	}
}
public class Super extends Parent{
	private int num = 2;
	Super(){
		super("Call parent");
		System.out.println("Child class default constructor");
	}
	void printNum() {
		System.out.println(num);
		System.out.println(super.num);
	}
	public void foo() {
		System.out.println("Child class foo");
		super.foo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super obj = new Super();
		obj.foo();
		obj.printNum();
	}

}
