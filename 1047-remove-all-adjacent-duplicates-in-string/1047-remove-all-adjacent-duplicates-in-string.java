class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();

        Stack<Character> st = new Stack();

        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s.charAt(i));
                continue;
            }
            char ch = s.charAt(i);
            if(st.peek() == ch){
                st.pop();
                continue;
            }
            st.push(ch);
        }
        while(!st.empty()){
            res.append(st.peek());
            st.pop();
        }
        return res.reverse().toString();
    }
}