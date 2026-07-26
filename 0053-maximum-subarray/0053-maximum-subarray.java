class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int bestending = nums[i];
        int answer = nums[i];

        for(i=1;i<nums.length;i++){
            int v1 = bestending+nums[i];
            int v2 = nums[i];

            bestending = Math.max(v1,v2);
            answer = Math.max(answer,bestending);
        }
        return answer;
    }
}