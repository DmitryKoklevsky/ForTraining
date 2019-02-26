package core;

import java.util.Arrays;
import java.util.Random;

public class Massive {

	private double[] firstArray;
	private double[] secondArray;
	private double[] concatArray;
	public int[] array;
	private int total = 0;
	public double[] randomElementArray;

	// 1
	public double[] concatArrays(double[] firstArray, double[] secondArray) {

		this.concatArray = new double[firstArray.length + secondArray.length];
		System.arraycopy(firstArray, 0, concatArray, 0, firstArray.length);
		System.arraycopy(secondArray, 0, concatArray, firstArray.length, secondArray.length);
		return this.concatArray;

	}

	// 2
	public double[] shuffleArray() {
		Random rnd = new Random();
		for (int i = randomElementArray.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			double a = randomElementArray[index];
			randomElementArray[index] = randomElementArray[i];
			randomElementArray[i] = a;

		}
		return randomElementArray;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	// 3
	public int[] inputArray(int firstBound, int secondBound) {
		for (int i = 0; i < array.length; i++) {
			this.array[i] = firstBound + (int) (Math.random() * (secondBound - firstBound));

		}
		return array;
	}

	// 4
	public int[] copyPartArray(int firstRange, int secondRange) {

		return array = Arrays.copyOfRange(array, firstRange, secondRange);

	}

	// 5
	public int findMaxElement() {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {

			max = Math.max(max, array[i]);
		}

		return max;
	}

	// 6
	public int findMinElement() {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {

			min = Math.min(min, array[i]);
		}

		return min;
	}

	// 7
	public int sumElements() {

		for (int i = 0; i < array.length; i++) {

			total += array[i];
		}

		return total;
	}

	// 8
	public int[] sortElement() {

		Arrays.sort(array);

		return array;
	}

	// 9

	public double sqrtLengthArray() {
		return Math.sqrt(array.length);
	}

	// 10
	public double getMinLengthArray(int[] firstArray, int[] secondArray) {
		return Math.min(firstArray.length, secondArray.length);
	}

	public Massive(int[] array, double[] randomElementArray) {
		this.array = array;
		this.randomElementArray = randomElementArray;
	}

	public Massive(int[] array) {
		this.array = array;
	}

	

}