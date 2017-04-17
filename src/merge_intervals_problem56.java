/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        
        if(intervals.size() <= 1){return intervals;}
        
        Collections.sort(intervals , new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });
        
        List<Interval> res = new ArrayList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(Interval interval : intervals){
            if(interval.start <= end){
                end = Math.max(end, interval.end);
            }
            else{
                Interval temp = new Interval(start , end);
                res.add(temp);
                start = interval.start;
                end = interval.end;
            }
        }
        Interval last = new Interval(start , end);
        res.add(last);
        return res;
    }
}