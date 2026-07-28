class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int i = 0;
        int bestendingMin = nums[i];
        int bestendingMax = nums[i];
        int ansMin = nums[i];
        int ansMax = nums[i];
        for(i=1;i<nums.length;i++){
            int v1Max = bestendingMax + nums[i];
            int v1 = nums[i];

            int v2Min = bestendingMin + nums[i];
            int v2 = nums[i];

            bestendingMin = Math.min(v2Min,v2);
            bestendingMax = Math.max(v1Max,v1);

            ansMax = Math.max(ansMax,bestendingMax);
            ansMin = Math.min(ansMin,bestendingMin);
        }
        return Math.max(Math.abs(ansMin),Math.abs(ansMax));
    }
}