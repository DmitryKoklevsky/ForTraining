package Homework13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Massive massive = new Massive(5, new int[] {1, 2, 3,4,5}) ;
		Massive massive = new Massive();
		massive.printFifthElement(new int[] {1, 2, 3,4,5}); //try- catch
		massive.printQuotionElemnt(new int[] {1,2,3}, -3, 5); //several catch
		massive.printLength(new int[] {1,2,3,4,5}, null);  // NullPointerException ; multy-catch
		massive.printLength(new int[] {1,2,3,4,5}, new int[] {}); //ArithmeticException; multy-catch
		massive.printSymbol("Какая-то строка", 5); // try-catch-finally
	
	}

}
