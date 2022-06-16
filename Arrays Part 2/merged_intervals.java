import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        int n=intervals.length;
        List<Interval> ans=new ArrayList<Interval>();
        //Sort the array according to start
        Arrays.sort(intervals,(a,b) -> a.start - b.start);
        //Find the soln
        for(int i=0;i<n;i++){
            int st=intervals[i].start;
            int ed=intervals[i].finish;
            if(ans.isEmpty() || ans.get(ans.size()-1).finish<st)
                ans.add(new Interval(st,ed));
            else {
                Interval in=new Interval(ans.get(ans.size()-1).start,
                                            Math.max(ed,
                                                  ans.get(ans.size()-1).finish));
                ans.set(ans.size()-1,in);
            }
        }
        return ans;
    }
}
