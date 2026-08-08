class Solution {
    public boolean isSorted(int[] arr) {
        boolean res = checksorted(arr,0,arr.length);
    
        return res;
    }
    
    public static boolean checksorted(int []arr,int i,int n){
        if(i==n || i==n-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checksorted(arr,i+1,n);
    }
}