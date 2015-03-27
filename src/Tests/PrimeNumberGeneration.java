package Tests;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneration {

	public static List<Integer> generate(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(1);
		if(i>2){
			primes.add(2);
		}
		return primes;
	}
}
