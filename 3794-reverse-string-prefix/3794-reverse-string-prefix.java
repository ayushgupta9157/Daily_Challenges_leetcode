class Solution {
    public String reversePrefix(String s, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            st.push(ch);
        }
        while(st.size()>0){
            sb.append(st.pop());
        }
        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}