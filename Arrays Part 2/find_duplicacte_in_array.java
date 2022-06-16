import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.size();i++){
            if(st.contains(arr.get(i)))return arr.get(i);
            else st.add(arr.get(i));
        }
        return -1;
    }
}
//Several Approaches
class Solution {
    public int findDuplicate(int[] nums) {
        //Map Approach
        //T.C : O(nlogn) S.C : O(n)
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num))return num;
            else mp.put(num,1);
        }
        return -1;
        
        //Set Approach
        //T.C : O(nlogn) S.C : O(n)
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            if(st.contains(num))return num;
            else st.add(num);
        }
        return -1;
        
        //Sort Approach
        //T.C : O(nlogn) S.C : O(1)
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])return nums[i];
        }
        return -1;
        
        //Frequency array approach
        //T.C : O(n) S.C : O(n)
        int n=nums.length;
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(freq[i]>1)return i;
        }
        return -1;
        
        //Tortoise and here algo
        //T.C : O(n) S.C : O(1)
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
    }
}
