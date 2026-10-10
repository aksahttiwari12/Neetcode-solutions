class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = nums.length / 3;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : freqMap.keySet()) {
            int currcount = freqMap.get(num);

            if (currcount > count) {
                list.add(num);
            }
        }

        return list;
    }
}