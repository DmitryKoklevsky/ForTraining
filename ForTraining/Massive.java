package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner (System.in);
		 * System.out.println("Enter array length: "); int size =
		 * scanner.nextInt(); //read from keybord value of length array int []
		 * array = new int[size]; System.out.print("Enter array numbers: "); for
		 * (int i = 0; i < array.length; i++) { array[i] = scanner.nextInt(); }
		 * System.out.println("You Massive: " + Arrays.toString(array));
		 */

	}

	public void printMassiveAsLine(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public void printReverseMassiveAsLine (int[] array)
	 {
		 for (int i = array.length-1; i >= 0; i--) {
	     
			 System.out.print(array[i] + " ");
	      }
	 }

	public void getSumOfElements(int[] array) {
		System.out.println("Sum of array: " + Arrays.stream(array).sum());
	}

	int n = 3; //for multipty array 
public void multiptyBy3(int[] array) {
	for(int i = 0; i <array.length; i++)
	{
		System.out.print(array[i]*n + " ");
	
	}
}
}