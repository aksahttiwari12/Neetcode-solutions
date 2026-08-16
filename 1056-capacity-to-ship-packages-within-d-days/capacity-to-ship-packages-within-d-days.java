class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int sum = 0;
        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w); 
            sum += w;
        }
        int low = maxWeight;
        int high = sum;
        while(low<high){
            int mid = low+(high - low)/2;
            if(canship(weights,days,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    private boolean canship(int[] weights,int days,int capacity){
        int neededdays = 1;
        int currweight = 0;
        for(int w: weights){
            if(currweight + w > capacity){
                neededdays++;
                currweight = 0;
            }
           currweight += w;
        }
    return neededdays <=days;
    }
}