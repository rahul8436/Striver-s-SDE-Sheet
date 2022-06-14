import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
	{
		// Write your code here.
        int i=nums.size()-2;
        while(i>=0 && nums.get(i+1)<=nums.get(i))i--;
        if(i>=0){
            int j=nums.size()-1;
            while(nums.get(j)<=nums.get(i))j--;
            Collections.swap(nums,i,j);
        }
        reverse(nums,i+1);
        return nums;
	}
    public static void reverse(ArrayList<Integer> nums,int i){
        int j=nums.size()-1;
        while(i<j)Collections.swap(nums,i++,j--);
    }
}
