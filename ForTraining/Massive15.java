package core;

import java.util.Arrays;

public class Massive {

	public int[] array;
	private int total = 0;

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Massive [array=" + Arrays.toString(array) + "]";
	}

	public int[] inputArray(int firstBound, int secondBound) {
		for (int i = 0; i < array.length; i++) {
			this.array[i] = firstBound + (int) (Math.random() * (secondBound - firstBound));

		}
		return array;
	}

	public int[] copyPartArray(int firstRange, int secondRange) {
		//try {
		array = Arrays.copyOfRange(array, firstRange, secondRange);
		
		/*}
		catch(ArrayIndexOutOfBoundsException | NullPointerException ex )
		{
			System.out.println("Вы вышли за границу массива");
		}*/
		return array;
	}
	
	public int findMaxElement() {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {

			max = Math.max(max, array[i]);
		}

		return max;
	}

	public int findMinElement() {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {

			min = Math.min(min, array[i]);
		}

		return min;
	}

	public int sumElements() {
	
		for (int i = 0; i < array.length; i++) {
			
			total += array[i];
		}

		return total;
	}
	
	public Massive(int[] array)
	{
		this.array=array;
	}

}