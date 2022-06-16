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
