class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st1.push('(');
            }
            else{
                if(!st1.isEmpty() && st1.peek() == '(') {
                    st1.pop();
                }
                else{
                    st2.push(')');
                }
            }
        }
        int a = Math.abs(st1.size()+st2.size());
        return a;
    }
}