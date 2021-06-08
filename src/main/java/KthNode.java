public class KthNode {
    private SingleLinkedList list;

    public KthNode(SingleLinkedList list){
        this.list = list;
    }

    String find(int k) {
        SingleNode fast = this.list.head();
        SingleNode slow = this.list.head();
        int start = 1;

        while (fast.next != null) {
            fast = fast.next;
            start++;

            if (start > k) {
                slow = slow.next;
            }

        }
        return slow.data();
    }
}
