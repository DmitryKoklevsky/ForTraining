package lesson2;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2. найти произведения всех элементов массива, вывести
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		int a = 1; // first value of diapason
		int b = 100; // second value of diapason
		int multiply = 1; // for multiply elements array
		for (int i = 0; i < array.length; i++) {
			array[i] = a + (int) (Math.random() * (b - a));
			System.out.println(array[i]);
		}
		/*
		 * for (int i = 0; i < array.length; i++) { multiply *=array[i]; }
		 */
		int i = 0;
		while (i < array.length) {
			multiply *= array[i];
			i++;
		}
		System.out.println("Your result: " + multiply);
	}

}
