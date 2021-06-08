public class Length {
    SingleLinkedList list;
    public Length(SingleLinkedList list){
        this.list = list;
    }

    public int findIteratively() {
        int count = 0;
        SingleNode current = this.list.head();
        while (current != null) {
            count++;
            current = current.next();
        }
        return count;
    }

    public int findRecursively(SingleNode current) {
        if (current == null) { //base case
            return 0;
        }
        return 1 + findRecursively(current.next());
    }
}
