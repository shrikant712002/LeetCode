class Solution {
    public int maximumSum(int[] arr) {
        int i = 0;
        int noDelete = arr[i];
        int oneDelete = Integer.MIN_VALUE;
        int res = arr[i];
        for(i=1;i<arr.length;i++){
            int prevOneDelete = oneDelete;
            int prevNoDelete = noDelete;

            noDelete = Math.max(arr[i],noDelete+arr[i]);

            int v2;
            if(prevOneDelete == Integer.MIN_VALUE){
                v2 = arr[i];
            }
            else{
                v2 = prevOneDelete + arr[i];
            } 
            oneDelete = Math.max(v2,prevNoDelete);
            res = Math.max(res,Math.max(oneDelete,noDelete));
        }
         return res;
    }
}