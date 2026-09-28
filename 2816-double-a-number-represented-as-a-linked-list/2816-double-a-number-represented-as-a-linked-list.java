class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head ; 
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int carry=0;
        for(int i = list.size()-1;i>=0;i--){
            int x = list.get(i)*2 + carry ; 
            list.set(i,x%10);
            carry = x/10;
        }
        if (carry > 0) {
            list.add(0, carry);
        }
        ListNode dummy = new ListNode(0);
        temp = dummy;
        for (int x : list) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}