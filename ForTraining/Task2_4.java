package lesson2;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 4. найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int count = 0; // count all "0" elements

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				count++;
			else
				count = 0;
		}
		System.out.println("Your array have zero elemnts: " + count);

	}
}
