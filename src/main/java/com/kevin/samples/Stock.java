package com.kevin.samples;

import java.util.Arrays;

public class Stock
{
    public static void main(String[] args)
    {
        Integer[] prices = new Integer[]{7,1,5,3,6,4};

        solution(prices);
    }

    private static void solution(Integer[] prices)
    {
        int min = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++)
        {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        System.out.println( Arrays.asList(prices)+ " has best price:" + max);
    }
}
