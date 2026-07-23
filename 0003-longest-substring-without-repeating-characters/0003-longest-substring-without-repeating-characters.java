class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res = 0;
        int n = s.length();

        HashMap<Character,Integer> map = new HashMap();

        for(int high=0;high<n;high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);

            int k = high-low+1;
            while(map.size()<k){
                char ch1 = s.charAt(low);
                map.put(ch1,map.getOrDefault(ch1,0)-1);

                if(map.get(ch1) == 0){
                    map.remove(ch1);
                }
                low++;

                k = high-low+1;
            }

            int len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}