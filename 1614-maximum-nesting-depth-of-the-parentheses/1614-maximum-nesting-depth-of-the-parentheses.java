class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else if(ch==')'){
                st.pop();
            }
            count=st.size();
            max = Math.max(max,count);
        }
        return max;
    }
}