package p1672;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RichestCustomerWealthTest {

	RichestCustomerWealth solution;

	@BeforeEach
	void setUp() {
		solution = new RichestCustomerWealth();
	}

	@Test
	public void test_Maximum_Wealth_2By2() {
		int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
		int maximumWealth = solution.maximumWealth(accounts);
		Assertions.assertEquals(10, maximumWealth);
	}

	@Test
	public void test_Maximum_Wealth_2By3() {
		int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
		int maximumWealth = solution.maximumWealth(accounts);
		Assertions.assertEquals(6, maximumWealth);
	}

	@Test
	public void test_Maximum_Wealth_3By3() {
		int[][] accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
		int maximumWealth = solution.maximumWealth(accounts);
		Assertions.assertEquals(17, maximumWealth);
	}
}