package task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuTestFrequency {

	
	@Test
	public void testMaxFequency1() {
			long[] a1 = {4,2,5,1,6,8,1};
			assertEquals(2, Frequency.maxFrequency(a1));  // value 1 occurs most frequently: 2 times
	}

	
	@Test
	public void testMaxFequency2() {
			long[] a2 = {3, 5, 1, 2, 4, 99, 100, 1, 2, 1, 4, 2, 4, 1, 2, 2, 5};
			assertEquals(5, Frequency.maxFrequency(a2));  // value 2 occurs most frequently: 5 times
	}

	
	@Test
	public void testMaxFequency3() {
			long[] a3 = {2, 2, 2};
			assertEquals(3, Frequency.maxFrequency(a3));  // value 2 occurs most frequently (3 times)
	}

	@Test
	public void testMaxFequency4() {
			long[] a4 = {42};
			assertEquals(1, Frequency.maxFrequency(a4));  // value 42 occurs most frequently (1 time)
	}

	@Test
	public void testMaxFequency5() {
			long[] a4 = {13, 42, 15, 7, 13, 5, 1};
			assertEquals(2, Frequency.maxFrequency(a4));  // value 13 occurs most frequently (2 time)
	}


	
}
