package general;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        int n = maxProfit1(new int[]{7,1,5,3,6,4});
        System.out.println(n);
    }

    private static int maxProfit(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i<prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return Math.max(maxProfit, 0);
    }

    private static int maxProfit1(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;

        for(int price : prices) {
            if(price < minValue) {
                minValue = price;
            } else if ( price - minValue > maxValue) {
                maxValue = price - minValue;
            }
        }
        return maxValue;
    }
}
