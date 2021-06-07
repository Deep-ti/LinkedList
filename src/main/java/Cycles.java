public class Cycles {
    public boolean isCyclic(SingleLinkedList list){
        SingleNode fast = list.head();
        SingleNode slow = list.head();
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
}
