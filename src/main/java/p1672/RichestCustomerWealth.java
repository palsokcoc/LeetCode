package p1672;

public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		int result = 0;

		for(int[] bankAccountsOfCustomer: accounts) {
			int wealth = 0;
			for(int bankAccount: bankAccountsOfCustomer) {
				wealth += bankAccount;
			}

			if(wealth > result) {
				result = wealth;
			}
		}

		return result;
	}
}
