package Les8;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tester tester = new Tester("Вася", "Пупкин", 13, "A2", 2);
		// tester.MultiplySalary();
		System.out.println(
				"зарплата мечты: " + tester.MultiplySalary() + " " + "опыт: " + tester.GetExpirienceInMonth(12));
		tester.PrintName();
		tester.AllInformation();

	}

	public String name;
	protected String surname;
	public int expirienceInYears;
	String englishLevel;
	private int salary;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int salary) {
		this(name, surname);
		this.salary = salary;
	}

	public Tester(String name, String surname, int salary, String englishLevel, int expirienceInYears) {
		this(name, surname, salary);
		this.englishLevel = englishLevel;
		this.expirienceInYears = expirienceInYears;
	}

	private int MultiplySalary() {
		return salary * 2;
	}

	int GetExpirienceInMonth(int expirienceInYears) {
		return expirienceInYears * 12;
	}

	protected void PrintName() {
		System.out.println("Имя: " + name + " , " + "Фамиля: " + surname);
	}

	public void AllInformation() {
		System.out.println("Имя: " + name + " , " + "Фамиля: " + surname + " , " + "Зарплата: " + salary + " , "
				+ "Уровень английского: " + englishLevel + " , " + "опыт: " + expirienceInYears);
	}
}
