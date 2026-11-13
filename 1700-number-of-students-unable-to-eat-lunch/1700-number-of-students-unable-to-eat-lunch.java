class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int n = sandwiches.length;
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int count = 0;
        while (!q.isEmpty() && count < q.size()) {
            if (st.peek().equals(q.peek())) {
                st.pop();
                q.remove();
                count = 0;
            } else {
                q.add(q.remove());
                count++;
            }
        }
        return q.size();
    }
}