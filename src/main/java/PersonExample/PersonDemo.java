package PersonExample;

public class PersonDemo {

	public static void main(String[] args) {
		Person johnSmith = new Person("John Smith", 13, 64);
		johnSmith.changeName("Rob Smith");
		johnSmith.getAge();
		johnSmith.getHeight();
		johnSmith.getName();
		johnSmith.haveBirthday();
	}
}
