class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int res = 0;
        boolean oddFound = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val % 2 == 0){
                res+=val;
            }
            else{
                res+=val-1;
                oddFound = true;
            }
        }
        if(oddFound){
            res++;
        }
        return res;
    }
}