public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        Arrays.sort(nums);
        //dfs(res , tmp , nums , 0);
        return iterative(nums);
    
    }
    public void dfs(List<List<Integer>> res , List<Integer> tmp , int[] nums , int pos){
        for(int i = pos ; i < nums.length ; i++){
            tmp.add(nums[i]);
            res.add(new ArrayList<Integer>(tmp));
            dfs(res , tmp , nums , i+1);
            tmp.remove(tmp.size()-1);
        }
    }
    public List<List<Integer>> iterative(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int item : nums){
            List<List<Integer>> newRes = new ArrayList<>();
            for(List list : res){
                newRes.add(new ArrayList<>(list));
                
                ArrayList<Integer> subset = new ArrayList<Integer>(list);
                subset.add(item);
                newRes.add(subset);
                
            }
            res = newRes;
        }
        return res;
    }
}