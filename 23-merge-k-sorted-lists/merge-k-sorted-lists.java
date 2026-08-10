class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (true) {
            int smallestindex = -1;
            //finding the smallest head node
            for (int i = 0; i < k; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (smallestindex == -1 || lists[i].val < lists[smallestindex].val) {
                    smallestindex = i;
                }
            }

            if (smallestindex == -1) {
                break;
            }
            
            //adding the smallest node to the new LL
            tail.next = lists[smallestindex];
            tail = tail.next;

            //moving the head of the list that we added to dummy
            lists[smallestindex] = lists[smallestindex].next;

        }

        return dummy.next;
    }
}