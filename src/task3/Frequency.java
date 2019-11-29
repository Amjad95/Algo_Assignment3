package task3;

import java.util.HashMap;

public class Frequency {

	public final static int MAX_N = 10000000;

	public static int maxFrequency(long[] data) {

		//Storing the data and the number of occurrences of each data(Key) in hash map
		HashMap<Long, Integer> hashMap = new HashMap<>();

		for (long datum : data) {

			//Check if the the data(Key) is already contained in the hash map,
			// if yes, we just update the value by incrementing the value for this data
			// if no, we add a new (Key, Value) to the hash map (data, 1)
			hashMap.put(datum, hashMap.containsKey(datum) ? hashMap.get(datum) + 1 : 1);
		}

		//Loop over the values of the hash map to find the maximum.
		Integer max = 0;
		for (Integer integer : hashMap.values()) {
			if (integer > max) {
				max = integer;
			}
		}

		return max; 	//TODO
	}

	public static void main(String[] args) {
		test1();
		measureRuntimeMode();
	}

	public static void test1() {
		long[] a1 = { 3, 5, 1, 0, 2, 4, 99, 0, 100, 1, 2, 1, 4, 2, 4, 1, 2, 2, 5 };
		System.out.println("mode a1[]: " + maxFrequency(a1));
	}

	public static void measureRuntimeMode() {
		for (int n = 10; n <= MAX_N; n *= 10) {

			// generate array with random data
			long[] an = new long[n];
			int k = (int) Math.sqrt(n);
			for (int i = 0; i < an.length; i++) {
				an[i] = (long) (Math.random() * k);
			}

			// measure runtime of version 1 (using a sorted array)
			long start1 = System.nanoTime();
			long frequency1 = maxFrequency(an);
			long ende1 = System.nanoTime();

			// print results
			System.out.printf("n = %8d | maxFrequency: %4d, runtime: %8.2f ms %n", n, frequency1,
					(ende1 - start1) / 1e6);

		}
		System.out.println("- done -");
	}
}
