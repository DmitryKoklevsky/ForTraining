package HomeWork4;

public class Person {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Jim", "Beam", 12, 123456789);
		Person person1 = new Person("Jim", "Beam");

		/*
		 * person.setName("Jim"); person.setSurename("Beam"); person.setAge(12);
		 * person.setPhone(123456789);
		 */// whithout constructor
		person.printAllInformation();
		person1.printName();
		System.out.println("are you 18 years old? " + person.isAdult());

	}

	public String name;
	public String surname;
	public int age;
	public int phone;

	public Person(String name, String surname, int age, int phone) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;

	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurename(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void printAllInformation() {
		System.out.println("All Information about person: " + this.name + " "
				+ this.surname + " " + this.age + " " + this.phone);
	}

	public void printName() {
		System.out.println("Person name: " + this.name + " " + this.surname);

	}

	public boolean isAdult() {

		return this.age > 18;
	}
}
