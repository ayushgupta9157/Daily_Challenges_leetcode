class RecentCounter {
    int[] arr;
    int start;
    int end;
    public RecentCounter() {
        arr = new int[10000];
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        arr[end++]=t;
        while(arr[start]<t-3000){
            start++;
        }
        return end-start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */