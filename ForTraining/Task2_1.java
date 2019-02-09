package lesson2;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); //read from keybord value of length array
		int [] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scanner.nextInt();
		}
	System.out.println("Your array:");
	for (int i = 0; i < array.length; i++)
	{
		System.out.println(array[i]);
	}
		System.out.println("Your reverse array:");
		for(int i = array.length - 1; i >= 0; i--)
		{
			System.out.println(array[i]);
		}
	}

	
}
