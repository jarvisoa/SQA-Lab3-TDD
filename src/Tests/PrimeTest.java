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
	
	@Test
	public void testFour() {
		assertEquals(list(2,2),Primes.getPrimeFactors(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2,3),Primes.getPrimeFactors(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2,2,2),Primes.getPrimeFactors(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3,3),Primes.getPrimeFactors(9));
	}
	
	@Test
	public void test325115() {
		assertEquals(list(5, 7, 7, 1327),Primes.getPrimeFactors(325115));
	}
	
	
	private List<Integer> list(Integer ...integers) {
		return Arrays.asList(integers);
	}

}
