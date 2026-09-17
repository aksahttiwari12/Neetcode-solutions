class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        backtrack(nums,result,p,0);
        return result;
    }
    static void backtrack(int[] nums,ArrayList<List<Integer>> result , ArrayList<Integer> p,int start){
          if(start == nums.length){
            result.add(new ArrayList<>(p));
            return;
          }
         backtrack(nums,result,p,start+1);
         p.add(nums[start]);
         backtrack(nums,result,p,start+1);
         p.remove(p.size()-1);
    }
}