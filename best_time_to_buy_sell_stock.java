import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)<min)min=prices.get(i);
            if(prices.get(i)-min>max)max=prices.get(i)-min;
        }
        return max;
    }
}
