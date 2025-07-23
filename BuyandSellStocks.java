package leetcode;

public class BuyandSellStocks {
	    public int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;
	        for(int price : prices){
	            if(price < minPrice){
	                minPrice = price;
	            }else{
	                maxProfit = Math.max(maxProfit,price - minPrice);
	            }
	        }
	        return maxProfit;
	    }
	    public static void main(String[] args) {
	    	BuyandSellStocks obj = new BuyandSellStocks();
	        int[] prices = {2,4,1};  
	        int profit = obj.maxProfit(prices);
	        System.out.println("Maximum Profit: " + profit);
		}

}
