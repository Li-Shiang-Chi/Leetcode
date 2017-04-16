import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class powerset {
    
    
    public static List<List<Integer>> getPowerSet(List<Integer> set) {
        List<List<Integer>> ps = new ArrayList<>();
        ps.add(new ArrayList<Integer>());
        
        
        for(Integer item : set) {
            List<List<Integer>> newPS = new ArrayList<>();
            
            System.out.println(Arrays.toString(ps.toArray()));
            
            for(List list : ps) {
                newPS.add(new ArrayList<>(list));
                
                ArrayList<Integer> subset = new ArrayList<Integer>(list);
                subset.add(item);
                newPS.add(subset);                
            }
            System.out.println("................");
            ps = newPS;
        }
        return ps;
    }
    
    public static void printPowerSet(List<List<Integer>> input) {
        for(List subset : input) {
            //System.out.println(Arrays.toString(subset.toArray()));
        }
    }
    
    public static void main(String[] args) {
        List<Integer> set = new ArrayList<Integer>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        
        List<List<Integer>> ps = getPowerSet(set);
        printPowerSet(ps);
        
        
    }
}
