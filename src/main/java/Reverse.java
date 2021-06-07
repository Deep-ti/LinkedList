public class Reverse {
    public void reverseWithoutRecursion(SingleLinkedList list) {
        SingleNode pointer = list.head();
        SingleNode previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
            list.setHead(current);
        }
    }

    public SingleNode reverseRecursively(SingleNode node) {
        SingleNode newHead;
        //base case - tail of original linked list
        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);
        //reverse the link e.g. C->D->null will be null
        node.next.next = node;
        node.next = null;
        return newHead;
    }
}
