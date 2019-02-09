package HomeWork3;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = getNumber();
		double result = getCoub(num1);
		System.out.println("Куб вашего числа равен: " + getCoub(num1));
	}

	public static double getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		if (scanner.hasNextDouble()) {
			return scanner.nextDouble();
		} else {
			System.out.println("Ошибка при вводе. Повторите ввод");
			return getNumber();
		}
	}

	public static double getCoub(double num1) {

		return Math.pow(num1, 3);
	}
}
