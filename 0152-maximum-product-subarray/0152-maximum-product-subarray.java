class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int minend = nums[i];
        int maxend = nums[i];
        int res = nums[i];

        for(i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = minend * nums[i];
            int v3 = maxend * nums[i];

            minend = Math.min(v1,Math.min(v2,v3));
            maxend = Math.max(v1,Math.max(v2,v3));

            res = Math.max(res,Math.max(minend,maxend));
        }
        return res;
    }
}