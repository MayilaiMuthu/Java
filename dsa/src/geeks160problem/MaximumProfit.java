package geeks160problem;

/*Stock Buy and Sell – Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 67K+Points: 2Average Time: 10m
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0 
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10 
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].*/

public class MaximumProfit {

	public int maximumProfit(int prices[]) {
		int count = 0;
		/*
		 * for(int i=0; i<prices.length; i++){ for(int j=i+1; j<prices.length; j++){
		 * if(prices[j]>prices[i]){ int temp = prices[j] - prices[i]; if(temp>count){
		 * count = temp; } } } }
		 */
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minValue) {
				minValue = prices[i];
			} else {
				count = Math.max(count, prices[i] - minValue);
			}
		}
		return count;
	}

}
