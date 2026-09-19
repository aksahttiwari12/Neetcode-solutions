class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(nums, result, temp, 0);
        return result;
    }

    static void backtrack(int[] nums, ArrayList<List<Integer>> result, ArrayList<Integer> temp, int start) {
        if (start == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[start]);
        backtrack(nums, result, temp, start + 1);
        temp.remove(temp.size() - 1);

        while (start + 1 < nums.length && nums[start] == nums[start + 1]) {
            start++;
        }
        backtrack(nums, result, temp, start + 1);
    }
}