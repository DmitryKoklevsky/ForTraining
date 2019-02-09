package lesson2;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5. найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести сообщение, что их нет
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				System.out.println("index zero element of array [i]:" + i);
			else {
				System.out.println("Your doesn't have zero elements ");
			}
		}

	}

}
