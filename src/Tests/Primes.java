package Tests;

import java.util.ArrayList;
import java.util.List;

public class Primes {

	public static List<Integer> getPrimeFactors(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		if (i != 1)
			primes.add(i);
		return primes;
	}

}
