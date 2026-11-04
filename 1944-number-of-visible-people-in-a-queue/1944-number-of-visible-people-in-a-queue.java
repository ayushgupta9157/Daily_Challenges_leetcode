class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] arr = new int[n];
        arr[n-1]=0;
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(st.size()>0 && st.peek()<heights[i]){
                st.pop();
                count++;
            }
            if(st.size()>0){
                count++;
            }
            st.push(heights[i]);
            arr[i]=count;
        }
        return arr;
    }
}