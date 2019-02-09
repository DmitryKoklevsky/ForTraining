package lesson2;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6 пройти по массиву и поменять местами каждые 2 соседних элемента
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int min = array[0];
		int max = array[0];
		int indexMin = 0;
		int indexMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexMin = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				indexMax = i;
			}
		}
		System.out.println("indexMin: " + indexMin);
		System.out.println("indexMax: " + indexMax);

	}
}
