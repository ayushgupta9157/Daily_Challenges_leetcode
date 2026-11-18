class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        int n = deck.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int i=0;
        while(q.size()>0){
            int a = q.peek();
            result[a]=deck[i];
            q.remove();
            if(!q.isEmpty()){
                int b = q.peek();
                q.add(b);
                q.remove();
            }
            i++;
        }
        return result;
    }
}