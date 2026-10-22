class Solution {
    public Node deepCopy(Node head1){
        Node dummy = new Node(-1);
        Node temp1 = head1;
        Node temp2 = dummy;
        while(temp1!=null){
            temp2.next=new Node(temp1.val);
            temp1= temp1.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        Node b = deepCopy(head);
        HashMap<Node,Node> map = new HashMap<>();
        Node tempA = head;
        Node tempB = b;
        map.put(null,null);
        while(tempA!=null){
            map.put(tempA,tempB);
            tempA=tempA.next;
            tempB=tempB.next;
        }
        tempA=head;
        while(tempA!=null){
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }
        return b;
    }
}