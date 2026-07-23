class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap();

        for(int high=0;high<n;high++){
            int fruit = fruits[high];
            map.put(fruit,map.getOrDefault(fruit,0)+1);

            while(map.size()>2){
                int fruit1 = fruits[low];
                map.put(fruit1,map.getOrDefault(fruit1,0)-1);

                if(map.get(fruit1) == 0){
                    map.remove(fruit1);
                }
                low++;
            }

            if(map.size()==2 || map.size()<2){
                int len = high-low+1;
                res = Math.max(len,res);
            } 
        }
        return res;
    }
}