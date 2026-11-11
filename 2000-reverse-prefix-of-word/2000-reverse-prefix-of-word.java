class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder s = new StringBuilder();
        int count = 0;
        boolean found = false;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c==ch){
                count++;
                st.push(c);
                found = true;
                break;
            }
            count++;
            st.push(c);
        }
        if (!found) {
            return word;
        }
        while(st.size()>0){
            s.append(st.pop());
        }
        for(int i=count;i<word.length();i++){
            s.append(word.charAt(i));
        }
        return s.toString();
    }
}