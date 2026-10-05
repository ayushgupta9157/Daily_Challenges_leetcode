class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push(0);
            }
            else {
                int count = st.pop();
                if(s.charAt(i - 1) == '(') {
                    count = 1;
                }
                else {
                    count = 2 * count;
                }
                st.push(st.pop() + count);
            }
        }
        return st.pop();
    }
}