package lesson2;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		boolean flag = true;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= array[i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Массив является строго возрастающей последовательностью");
		} else {
			System.out.println("Массив не является строго возрастающей последовательностью");
		}
	}
}