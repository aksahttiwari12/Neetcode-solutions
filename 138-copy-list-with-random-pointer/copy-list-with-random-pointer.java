class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        if (head == null) {
            return null;
        }

        Node l1 = head;

        Node firstcopy = new Node(l1.val);
        Node l2 = firstcopy;
        map.put(l1, l2);
        l1 = l1.next;

        while (l1 != null) {
            Node copy = new Node(l1.val);
            l2.next = copy;
            l2 = l2.next;
            map.put(l1, l2);
            l1 = l1.next;
        }
        Node curr = head;

        while (curr != null) {

            Node copy = map.get(curr);

            copy.random = map.get(curr.random);

            curr = curr.next;
        }
        return firstcopy;
    }
}