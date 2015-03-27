package Tests;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneration {

	public static List<Integer> generate(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		if(i>2){
			primes.add(2);
		}

		if (i>3){
			primes.add(3);
		}
		return primes;
	}
}
