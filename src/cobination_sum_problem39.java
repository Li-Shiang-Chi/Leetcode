public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(res , tmp , candidates , target , 0);
        return res;
        
    }
    public void dfs(List<List<Integer>> res , List<Integer> tmp , int[] candidates , int target , int start){
        if(target < 0) return ;
        if(target == 0){
            res.add(new ArrayList(tmp));
            return;
        }
        for(int i = start ; i < candidates.length ; i++){
            tmp.add(candidates[i]);
            dfs(res , tmp , candidates , target - candidates[i] , i);
            tmp.remove(tmp.size()-1);
        }
        
    }
}