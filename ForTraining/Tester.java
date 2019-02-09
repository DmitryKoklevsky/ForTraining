package HomeWork5;

public class Tester {

	public String name;
	public String surname;
	public double expirienceInYears;
	public String englishLevel;
	public double salary;

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, double salary) {
		this(name, surname);
		this.salary = salary;
	}

	public Tester(String name, String surname, double salary, String englishLevel) {
		this(name, surname, salary);
		this.englishLevel = englishLevel;
	}

	public void outPutName(String name, String surname) {
		System.out.println(this.name);
	}

	public void setInfo(String name) {
		name = "Karl";
	}

	public void setInfo(double salary) {
		salary = 300;
	}

	public void setInfo(String name, String surname) {
		name = "Jim";
		surname = "Beam";
	}

	public static void printMessage() {
		System.out.println("Можно больше зарплаты?");
	}
}
