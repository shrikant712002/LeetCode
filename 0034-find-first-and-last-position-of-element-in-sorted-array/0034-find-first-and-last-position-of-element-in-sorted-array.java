class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums,target);
        int last = last(nums,target);

        return new int[]{first,last};
    }

    public static int first(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    public static int last(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}