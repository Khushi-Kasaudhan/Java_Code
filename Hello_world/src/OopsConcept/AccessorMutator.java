package OopsConcept;

public class AccessorMutator {

	    private String name;
	    private int age;
	    private String email;

	    // Accessor methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    // Mutator methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessorMutator obj = new AccessorMutator();
		
		obj.setName("John");
		obj.setAge(23);
		obj.setEmail("john@gmail.com");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getEmail());
		
	}

}
