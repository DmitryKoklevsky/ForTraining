package Homework9;

public class Mars extends Planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mars mars = new Mars(12, 2, 122, 12, false, 1999);
		mars.printWaterExist();
		mars.printGalacticName();//abstract method
	}

	protected boolean water;
	protected int temperature;

	protected Mars(int collapsar, int size, double gravitation, double age, boolean water, int temperature) {
		super(collapsar, size, gravitation, age);
		this.water = water;
		this.temperature = temperature;
	}

	protected void printWaterExist() {
		if (water == true) {
			System.out.println("На Марсе можно принять душ ");
		} else
		{
			System.out.println("принимай душ на Земле");
		}
	}

	protected void printTemperature() {
		System.out.println("Температуран на Марсе: " + temperature);
	}
	

	public void printGalacticName()
	{
		System.out.println("Я нахожу в галактике Млечный путь"); 
	}
	
}
