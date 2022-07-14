package p0412;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz solution;

	@BeforeEach
	void setUp() {
		solution = new FizzBuzz();
	}

	@Test
	public void test_FizzBuzz_n3() {
		final List<String> actual = solution.fizzBuzz(3);
		final List<String> expected = Arrays.asList("1", "2", "Fizz");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void test_FizzBuzz_n5() {
		final List<String> actual = solution.fizzBuzz(5);
		final List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void test_FizzBuzz_n15() {
		final List<String> actual = solution.fizzBuzz(15);
		final List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
		Assertions.assertEquals(expected, actual);
	}
}