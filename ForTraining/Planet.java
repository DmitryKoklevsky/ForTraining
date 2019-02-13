package Homework9;

public class Planet extends StarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planet planet = new Planet(1, 98765, 9.87, 5000);
		planet.getDevideAge(planet.age, 12);
		planet.printDevideResult();
		planet.printGalacticName();//abstract method
	}

	protected double gravitation;
	protected double age;

	protected Planet(int collapsar, int size, double gravitation, double age) {
		super(collapsar, size);
		this.gravitation = gravitation;
		this.age = age;
	}

	protected double result; // result of devide age

	protected double getDevideAge(double age, double devider) {
		return result = this.age = age / devider;
	}

	protected void printDevideResult() {
		System.out.println("Результ деления возраста планеты: " + result);
	}
	public void printGalacticName()
	{
		System.out.println("Галактика, в которой я нахожусь, неизвестна"); 
	}
}
