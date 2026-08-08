class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int j=k;j<arr.length;j++){
            if(arr[j] >= pq.peek()){
                continue;
            }
            pq.remove();
            pq.add(arr[j]);
        }
        return pq.peek();
    }
}
