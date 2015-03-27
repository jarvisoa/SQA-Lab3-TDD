package Tests;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneration {

	public static List<Integer> generate(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		int candidate = 2;
		System.out.println(isPrime(4));
		for(;candidate < i; candidate++){
			if (isPrime(candidate)){
				primes.add(candidate);
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int candidate){
		for (int i = 2; i <= (candidate / 2); i++){
			if (candidate % i == 0){
				return false;
			}
		}
		return true;
	}
}