package PersonExample;

public class Person {

	// Data Members
	private String name;
	private int age;
	private double height;

	// Constructors
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// Member Functions
	public void changeName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void haveBirthday() {
		age += 1;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}
}
