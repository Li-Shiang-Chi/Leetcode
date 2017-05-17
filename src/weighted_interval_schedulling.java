import java.util.*;


public class weighted_interval_schedulling {
    
    
    public static int computeOptimal(int j , ArrayList<Interval> intervals , int[] ps , int[] max) {
        if(max[j] == -1) {
            max[j] = Math.max(intervals.get(j).weight + computeOptimal(ps[j], intervals, ps, max), computeOptimal(j-1, intervals, ps, max));
        }
        return max[j];
    }
    public static int[] initPS(ArrayList<Interval> intervals) {
        int size = intervals.size();
        int[] ps = new int[size];
        for(int i = 0 ; i < size ; i++)
            for(int j = 0 ; j < size ; j++) {
                int start = intervals.get(i).start;
                int end = intervals.get(j).end;
                if(start > end) {
                    ps[i] = j;
                }
            }
        for (int i = 0 ; i < size ; i++)
            System.out.print(ps[i]+" ");
        return ps;
    }
    public static int[] initMax(int size) {
        int[] temp = new int[size];
        for(int i =0 ; i<temp.length;i++) {
            temp[i] =-1;
        }
        temp[0] = 0;
        return temp;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intervalCount = scan.nextInt();
        int[] previous = new int[intervalCount];
        int[] max = new int[intervalCount+1];
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        
        for(int i = 0 ; i < intervalCount ; i++) {
            String[] input = scan.nextLine().split(" ");
            int start = scan.nextInt();
            int end = scan.nextInt();
            int weight = scan.nextInt();
            intervals.add(new Interval(start, end, weight));
        }
       
        
       Collections.sort(intervals, new Comparator<Interval>() {

           @Override
           public int compare(Interval o1, Interval o2) {
               if(o1.end > o2.end) return 1;
               else return -1;
           }
           });
       previous = initPS(intervals);
       max = initMax(intervals.size());
       
       System.out.println("result is : " + computeOptimal(intervalCount-1, intervals, previous, max));
       
}

}
class Interval{
    int start;
    int end;
    int weight;
    
    public Interval(int start , int end , int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
 
}
