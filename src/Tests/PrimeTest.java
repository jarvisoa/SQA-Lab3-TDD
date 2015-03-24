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
	
	private List<Integer> list() {
		return Arrays.asList();
	}

}
