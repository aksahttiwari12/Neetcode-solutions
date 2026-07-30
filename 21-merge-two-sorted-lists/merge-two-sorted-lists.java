class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
        }
          if (l1 != null) {
                tail.next = l1;
            } else {
                tail.next = l2;
            }
        return dummy.next;
    }
}