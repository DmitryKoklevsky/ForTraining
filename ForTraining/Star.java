package Homework9;

public class Star extends StarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Star star = new Star(1, 98765, 9.87, 5000);
		star.getMultiplyMass(star.mass);
		star.printMultiplyResult();
		star.printGalacticName(); //abstract method
	}

	protected double radius;
	protected double mass;
	protected int c = 1000; // for Method getMultiplyMass

	protected Star(int collapsar, int size, double radius, double mass) {
		super(collapsar, size);
		this.radius = radius;
		this.mass = mass;
	}

	protected double result; // result of Multiply mass

	protected double getMultiplyMass(double mass) {
		return result = this.mass = mass * c;
	}

	protected void printMultiplyResult() {
		System.out.println("Результ перевода массы планеты с какой-то размерности в какую-то: " + result);
	}
	public void printGalacticName()
	{
		System.out.println("Я нахожусь в далекой-далекой галактике"); 
	}

}
