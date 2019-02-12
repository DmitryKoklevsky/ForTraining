package example;

import Les8.Tester;

public class ForTesterAnotherPocket {

		public static void main(String[] args) {
			Tester tester = new Tester("Вася", "Пупкин", 13, "A2", 2); 
			tester.setEnglishLevel("A3");
			tester.setExpirienceInYears(3);
			tester.setName("Dima");
			tester.setSalary(150);
			tester.setSurname("Taksebe");
			System.out.println(tester.getEnglishLevel() + ", " + tester.getExpirienceInYears() + ", " + 
					tester.getName() + ", " + tester.getSalary() + ", " + tester.getSurname());
			
			/*для всех методов, вызванных выше, модификатор доступа default, поэтому их можно 
			  вызвать в другом классе этого же пакета
			 */
			tester.AllInformation();
			//tester.MultiplySalary(); //нельзя вызвать, т.к метод имеет модификатор доступа private
			tester.PrintName(); // метод с модификатором protected
			System.out.println(tester.GetExpirienceInMonth(12)); // метод с модификатором default
	}

}
