public class MiddleElement {
    public void find(SingleLinkedList list){
        SingleNode current = list.head();
        int length = 0;
        SingleNode middle = list.head();

        while(current.next() != null){
            length++;
            if(length%2 ==0){
                middle = middle.next();
            }
            current = current.next();
        }

        if(length%2 == 1){
            middle = middle.next();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : "                                  + middle);


    }
}
