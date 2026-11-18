class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        boolean skip = true;
        int[] ans = new int[deck.length];
        int i = 0;
        int j = 0;
        while(i < deck.length) {
            if(ans[j] == 0) {
                if(skip == true) {
                    ans[j] = deck[i];
                    i++;
                }
                skip = !skip;
            }
            j = (j + 1) % deck.length;
        }
        return ans;
    }
}
