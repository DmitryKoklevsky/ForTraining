package HomeWork4;

import java.util.Scanner;

public class OutPutMassive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); //read from keybord value of length array
		int [] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int k = 0; k < array.length; k++)
		{
			array[k] = scanner.nextInt();
		}
	Massive massive = new Massive();
	
	System.out.println("Your Massive:" );
	massive.printMassiveAsLine(array);
	System.out.println("Your reverse Massive:" );
	massive.printReverseMassiveAsLine(array);
	System.out.println("");
	massive.getSumOfElements(array);
	System.out.println("Your Massive multiply by 3:");

	
	}

}