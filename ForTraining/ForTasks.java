package Les8;

public class ForTasks {
	public static void main(String[] args) {
		Tester tester = new Tester("����", "������", 13, "A2", 2); 
		tester.setEnglishLevel("A3");
		tester.setExpirienceInYears(3);
		tester.setName("Dima");
		tester.setSalary(150);
		tester.setSurname("Taksebe");
		System.out.println(tester.getEnglishLevel() + ", " + tester.getExpirienceInYears() + ", " + 
				tester.getName() + ", " + tester.getSalary() + ", " + tester.getSurname());
		
		/*��� ���� �������, ��������� ����, ����������� ������� default, ������� �� ����� 
		  ������� � ������ ������ ����� �� ������
		 */
		tester.AllInformation();
		//tester.MultiplySalary(); //������ �������, �.� ����� ����� ����������� ������� private
		tester.PrintName();
		System.out.println(tester.GetExpirienceInMonth(12));
	}
}
