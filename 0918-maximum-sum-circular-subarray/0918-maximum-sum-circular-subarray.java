class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int i = 0;
        int bestMax = nums[i];
        int bestMin = nums[i];
        int maxSum = nums[i];
        int minSum = nums[i];
        int sum = 0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }

        for(i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v1Max = bestMax + nums[i];

            int v2 = nums[i];
            int v2Min = bestMin + nums[i];

            bestMax = Math.max(v1,v1Max);
            bestMin = Math.min(v2,v2Min);

            maxSum = Math.max(maxSum,bestMax);
            minSum = Math.min(minSum,bestMin);
        }
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum,sum-minSum);
    }
}