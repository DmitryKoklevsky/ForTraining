package Homework13;

import java.util.Scanner;

public class Massive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int size;
	public int[] array = new int[size];
	public int diver;
	public int n; //index of element
	public int[] array2 = new int[size];
	public String str;

	public void printFifthElement(int[] array) {
		try {
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[5]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("������� � �������� 5 �����������");
		} finally {
			System.out.println("������� ������ �������� �������");
		}
	}

	public void printQuotionElemnt(int[] array, int divider, int n) {
		try {
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[n] / divider);
			}
		} catch (ArithmeticException ex) {
			System.out.println("������� �� ���� ���������");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("������ ������� ������� �� ����������");
		}
	}
	
	public void printLength(int[] array, int[] array2) {
		try {
		

				System.out.println(array.length/array2.length);
			
		} catch (NullPointerException |ArithmeticException  ex) {
			System.out.println("���������� ��������� �������");
		} 
	}
	
	
	public void printSymbol(String str, int n) {
		try {
			char chr = str.charAt(n);
			System.out.println("��� ������: " + chr);
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("������� ������, ������� �� �������� ������");
		} finally {
			System.out.println("��������� �������� ������ � �������");
		}
	}
	
}
