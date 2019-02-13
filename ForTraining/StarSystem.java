package Homework9;

abstract public class StarSystem {

	protected int collapsar;
	protected int size;
	protected int cycleOfLife;
	

	protected StarSystem(int collapsar, int size) {
		this.collapsar = collapsar;
		this.size = size;
	}

	protected StarSystem(int collapsar, int size, int cycleOfLife) {
		this.collapsar = collapsar;
		this.size = size;
		this.cycleOfLife = cycleOfLife;
	}

	protected void printCollapsar(int collapsar) {
		System.out.println("Количество черных дыр: " + collapsar);
	}

	protected void printSize(int size) {
		System.out.println("Размер вселенной: " + size);
	}

	public abstract void printGalacticName();

	

}
