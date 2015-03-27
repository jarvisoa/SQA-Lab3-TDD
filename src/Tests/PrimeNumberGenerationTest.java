package Tests;


	import java.util.Arrays;
import java.util.Collection;
	 
import java.util.List;

	import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

	@RunWith(Parameterized.class)
public class PrimeNumberGenerationTest {
	   private Integer inputNumber;
	   private List<Integer> expectedResult;
	   private PrimeNumberGeneration primeNumberChecker;

	   @Before
	   public void initialize() {
	      primeNumberChecker = new PrimeNumberGeneration();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public PrimeNumberGenerationTest(Integer inputNumber, 
	      List<Integer> expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	   
	   private static List<Integer> list(Integer ...integers) {
			return Arrays.asList(integers);
		}

	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, list(1)},
	         { 3, list(1,2)}
	      });
	   }

	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, 
	      primeNumberChecker.generate(inputNumber));
	   }
	}