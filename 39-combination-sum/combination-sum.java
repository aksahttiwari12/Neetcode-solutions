class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> currenComb = new ArrayList<>();
        backtrack(candidates,target,0,currenComb,list);
          return list;
    }

    static void backtrack(int[] arr, int target, int start,ArrayList<Integer> currenComb,ArrayList<List<Integer>> result) {
            if(target == 0){
                result.add(new ArrayList<>(currenComb));
            }
            if(target<0){
                return;
            }
            for(int i = start ;i<arr.length ; i++){
                currenComb.add(arr[i]);
                backtrack(arr,target-arr[i],i,currenComb,result);
                currenComb.remove(currenComb.size() -1);
            }
    }
}