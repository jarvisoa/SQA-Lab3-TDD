package Tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void testOne() {
		assertEquals(list(),Primes.getPrimeFactors(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2),Primes.getPrimeFactors(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3),Primes.getPrimeFactors(3));
	}
	
	
	private List<Integer> list(Integer ...integers) {
		return Arrays.asList(integers);
	}

}
