package Homework9;

public class Earth extends Planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth earth = new Earth(12, 1333, 10, 200000, 20000, 700000000);
		earth.printGalacticName();//abstract method
	}

	protected int typeAnimal;
	protected int numberPeople;

	protected Earth(int collapsar, int size, double gravitation, double age, int typeAnimal, int numberPeople) {
		super(collapsar, size, gravitation, age);
		this.typeAnimal = typeAnimal;
		this.numberPeople = numberPeople;
	}

	protected void printTypeAnimal() {
		System.out.println("Количество типов различных животных на планете: " + typeAnimal);
	}

	protected void printNumberOfPeople() {
		System.out.println("Всего людей на планете: " + numberPeople);
	}
	public void printGalacticName()
	{
		System.out.println("Я нахожу в галактике Млечный путь"); 
	}

}
