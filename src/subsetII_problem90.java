public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        Arrays.sort(nums);
        //dfs(res , tmp , nums , 0);
        return iterative(nums);
    }
    
    public void dfs(List<List<Integer>> res , List<Integer> tmp , int[] nums , int pos){
        for(int i = pos ; i < nums.length ; i++){
            if(i>pos && nums[i] == nums[i-1]) continue;
            tmp.add(nums[i]);
            res.add(new ArrayList<Integer>(tmp));
            dfs(res , tmp , nums , i+1);
            tmp.remove(tmp.size()-1);
        }
    }
    public List<List<Integer>> iterative (int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        int start = 0;
        for(int i=0;i<nums.length;i++){
            int size = res.size(); // must fixed beforehand
            for(int j=start;j<size;j++){
                ArrayList<Integer> newList = new ArrayList<Integer>(res.get(j));
                newList.add(nums[i]);
                res.add(newList);
            }
            start = i<nums.length-1 && nums[i] == nums[i+1] ? size : 0;
        }
        return res;
    }
}