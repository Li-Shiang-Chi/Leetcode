import java.util.*;
public class permutaion_problem46 {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        backtrack(res , tmp , nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res , List<Integer> tmp , int[] nums){
            if(tmp.size() == nums.length){
                res.add(new ArrayList<Integer>(tmp));
                return;
            } 
            for(int i = 0 ; i < nums.length ; i++){
                if(tmp.contains(nums[i])) continue;
                tmp.add(nums[i]);
                backtrack(res , tmp , nums);
                tmp.remove(tmp.size()-1);
            }
        }
}
