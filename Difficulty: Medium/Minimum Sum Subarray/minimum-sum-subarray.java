class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int i =0;
        int bestending = a[i];
        int answer = a[i];
        
        for(i=1;i<size;i++){
            int v1 = bestending + a[i];
            int v2 = a[i];
            
            bestending = Math.min(v1,v2);
            answer = Math.min(answer,bestending);
        }
        return answer;
    }
}