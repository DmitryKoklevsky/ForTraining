package Homework9;

public class Sun extends Star{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun sun = new Sun(12, 1333, 10, 200000, "����� ������ �������", "�������");
		sun.printGalacticName();//abstract method
	}
	protected String name;
	protected String color;
	
	protected Sun(int collapsar, int size, double radius, double mass, String name, String color) {
		super(collapsar, size, radius, mass);
		this.name = name;
		this.color = color;
	}
	
	protected void printName() {
		System.out.println("��� ����� ������: " + name);
	}

	protected void printColor() {
		System.out.println("���� ����� ������: " + color);
	}
	public void printGalacticName()
	{
		System.out.println("� �������� � ��������� ���������"); 
	}
}
