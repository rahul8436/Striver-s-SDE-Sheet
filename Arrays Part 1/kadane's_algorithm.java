import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] nums, int n) {
		// write your code here
        long sum=0,maxi=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi)maxi=sum;
            if(sum<0)sum=0;
        }
        return maxi;
	}

}
