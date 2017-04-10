import java.util.*;

public class subset_problem78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        Arrays.sort(nums);
        dfs(res , tmp , nums , 0);
        return res;
    
    }
    public void dfs(List<List<Integer>> res , List<Integer> tmp , int[] nums , int pos){
        for(int i = pos ; i < nums.length ; i++){
            tmp.add(nums[i]);
            res.add(new ArrayList<Integer>(tmp));
            dfs(res , tmp , nums , i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
