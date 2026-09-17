class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        permutation(nums, result, p, used);
        return result;
    }

    static void permutation(int[] nums, ArrayList<List<Integer>> result, ArrayList<Integer> p, boolean[] used) {
        if(p.size() == nums.length) {
            result.add(new ArrayList<>(p));
            return;
        }

        for(int i = 0;i<nums.length;i++){

            if(used[i]) continue;
            
            used[i] = true;
            p.add(nums[i]);
           
            permutation(nums,result,p,used);
            p.remove(p.size()-1);
            used[i] = false;
        }
    }
}