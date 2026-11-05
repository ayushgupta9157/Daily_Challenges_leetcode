class StockSpanner {
    Stack<int[]> st = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count = 1 ;
        while(st.size()>0 && st.peek()[0]<=price){
            count = count + st.pop()[1];
        }
        st.push(new int[]{price,count});
        return count;
    }
}

