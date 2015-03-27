package Tests;

import java.util.ArrayList;
import java.util.List;

public class Primes {

	public static List<Integer> getPrimeFactors(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		int divisor = 2;
		while(i > 1){
			for(;i % divisor == 0;i/=divisor){
				primes.add(divisor);
			}
			divisor++;
		}
		if (i > 1)
			primes.add(i);
		return primes;
	}

}
