package Homework9;

public class Sirius extends Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sirius sirius = new Sirius(12, 12, 12, 12 , "sdfs", "fasfa");
		 sirius.setFaculty("����������");
		 sirius.setSurname("����");
		 sirius.printSurname();
		 sirius.printFacultyResult();
		 sirius.printGalacticName();//abstract method
		 StarSystem starSystem = new Sirius(12, 12, 12, 12 , "sdfs", "fasfa");
		 starSystem.printGalacticName();
		 
	}

	protected String surname;
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	protected String faculty;

	protected Sirius(int collapsar, int size, double radius, double mass, String surname, String faculty) {
		super(collapsar, size, radius, mass);
		this.surname = surname;
		this.faculty = faculty;
	}

	protected void printSurname() {
		System.out.println("�������: " + surname);
	}

	protected void printFacultyResult() {
		if (faculty != "����������") {
			System.out.println("���������� ����� �������� ");
		} else {
			System.out.println("����������������� ����� ��������� ��� � ����������");
		}
	}

		public void printGalacticName()
		{
			System.out.println("� �������� � ��������� ����� �������"); 
		}

	}

