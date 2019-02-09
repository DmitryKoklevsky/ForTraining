package HomeWork3;

import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = getNumber();
		int num2 = getNumber();
		System.out.println("Is it number even? " + getEven(num1));
		System.out.println("Is it number even? " + getEven(num2));
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		if (scanner.hasNextInt()) {
			return scanner.nextInt();
		} else {
			System.out.println("Error");
			return getNumber();
		}
	}

	public static boolean getEven(int num1) {

		return num1 % 2 == 0;
	}
}
