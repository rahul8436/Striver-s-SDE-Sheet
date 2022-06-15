import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int numRows) {
            ArrayList<ArrayList<Long>> l=new ArrayList<>();
        ArrayList<Long> row,pre=null;
        for(int i=0;i<numRows;i++){
            row=new ArrayList<Long>();
            for(int j=0;j<=i;j++){
                //check for 1st or last col as they are all 1s
                if(j==0 || j==i)row.add((long)1);
                else row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            l.add(row);
        }
        return l;
	}
}
