package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class besttimestock {
	/*
	public int maxProfit(int[] prices) {
		int minPrice =Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int price : prices) {
			minPrice = Math.min(minPrice, price);
			
			maxProfit =Math.max(maxProfit, price - minPrice);
		}
		return maxProfit;
	}
	
	   public static void main(String[] args) {
	        besttimestock solver = new besttimestock();

	        // Example test case
	        int[] prices = {7, 1, 5, 3, 6, 4,45 ,57,58};
	        int result = solver.maxProfit(prices);

	        System.out.println("Maximum Profit: " + result);
	    }*/
	
	
/*	public int subarraysum(int [] nums , int k) {
		Map <Integer,Integer> map =new HashMap<>();
		map.put(0, 1);
		
		int sum=0,count=0;
		
		for(int num:nums) {
		sum+=num;
		if(map.containsKey(sum-k)) {
			count += map.get(sum-k);
		}
		map.put(sum, map.getOrDefault(sum,0)+1);
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
        besttimestock bt = new besttimestock();

        // Example test case
        int[] nums = {1,12,12,13,11,};
        
       

        System.out.println("subarray: " + nums);
	
	}*/
	
	/*
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}*/
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j>=5;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		}
		
	
}



