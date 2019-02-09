package lesson2;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2.  каждый 3-й элемент умножить на 2 (2-мя способами)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Your array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("First way: your every third element equels:");
		// firs way:
		for (int i = 2; i < array.length; i += 3) {
			array[i] *= 2;
			System.out.println(array[i]);
		}
		// second way:
		System.out.println("Second way: your every third element equels:");
		int i = 2;
		while (i < array.length) {
			array[i] *= 2;
			System.out.println(array[i]);
			i += 3;
		}
	}

}
