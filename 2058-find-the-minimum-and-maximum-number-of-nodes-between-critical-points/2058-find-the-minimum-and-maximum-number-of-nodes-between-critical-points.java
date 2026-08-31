class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();
    ListNode prev = head;
    ListNode curr = head.next;
    ListNode next = curr.next;
    int index = 1;
    while (next != null) {
        if ((curr.val > prev.val && curr.val > next.val) ||
            (curr.val < prev.val && curr.val < next.val)) {
            list.add(index);
        }
        prev = curr;
        curr = next;
        next = next.next;
        index++;
    }
    if (list.size() < 2) {
        return new int[]{-1, -1};
    }
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < list.size(); i++) {
        min = Math.min(min, list.get(i) - list.get(i - 1));
    }
    int max = list.get(list.size() - 1) - list.get(0);
    return new int[]{min, max};
    }
}