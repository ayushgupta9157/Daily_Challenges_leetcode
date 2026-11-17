class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            int count = 1 ;
            for(int i=1;i<=k;i++){
                if(count==k){
                    q.remove();
                }else{
                    q.add(q.remove());
                }
                count++;
            }
        }
        return q.remove();
    }
}