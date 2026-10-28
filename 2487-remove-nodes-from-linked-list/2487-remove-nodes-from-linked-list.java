class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head ;
        while(temp!=null){
            int a=temp.val;
            while(!st.isEmpty() && st.peek()<a){
                st.pop();
            }
            st.push(a);
            temp = temp.next;
        }
        int a = st.size();
        int[] arr = new int[a];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp1  = dummy;
        for(int i=0;i<arr.length;i++){
            temp1.next = new ListNode(arr[i]);
            temp1=temp1.next;
        }
        return dummy.next;
    }
}