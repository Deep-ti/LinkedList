public class Sum {
    private SingleLinkedList list1;
    private SingleLinkedList list2;
    private SingleLinkedList sum;
    int carry;

    public Sum(SingleLinkedList list1, SingleLinkedList list2){
        this.list1 = list1;
        this.list2 = list2;
    }

    public SingleLinkedList findUsingStack(){
        this.sum = new SingleLinkedList("");
        // first list is empty
        if (this.list1.head() == null){
            sum.setHead(this.list2.head());
            return sum;
        }

        // second list is empty
        if (this.list2.head() == null){
            sum.setHead(this.list1.head());
            return sum;
        }
        Length length = new Length(list1);
        int size1 = length.findIteratively();
        length = new Length(list2);
        int size2 = length.findIteratively();

        if(size1 == size2){
            sum = addListOfSameSize(list1.head(), list2.head());
        }else{
            sum = addListOfDifferentSize(size1, size2);
        }

        return sum;
    }
    SingleNode cur;
    private SingleLinkedList addListOfDifferentSize(int size1, int size2) {
        int diff = Math.abs(size1 - size2);
        SingleNode temp;
        if (size1 < size2){
            temp = this.list2.head();
            while (diff-- >= 0)
            {
                cur = temp;
                temp = temp.next;
            }
            // get addition of same size lists
            sum = addListOfSameSize(cur, this.list2.head());
            // get addition of remaining first list and carry
            propogatecarry(this.list2.head());

        }else {
            temp = this.list1.head();
            while (diff-- >= 0)
            {
                cur = temp;
                temp = temp.next;
            }
            // get addition of same size lists
            sum = addListOfSameSize(cur, this.list1.head());
            // get addition of remaining first list and carry
            propogatecarry(this.list1.head());
        }
        // if some carry is still there, add a new node to
        // the front of the result list. e.g. 999 and 87
        if (carry > 0)
            push(carry, 3);

        return sum;
    }

    private void propogatecarry(SingleNode head) {
        // If diff. number of nodes are not traversed, add carry
        if (head != cur)
        {
            propogatecarry(head.next);
            int sum = carry + Integer.valueOf(head.data());
            carry = sum / 10;
            sum %= 10;

            // add this node to the front of the result
            push(sum, 3);
        }
    }

    private SingleLinkedList addListOfSameSize(SingleNode n, SingleNode m) {
        // Since the function assumes linked lists are of
        // same size, check any of the two head pointers
        if (n == null)
            return null;

        // Recursively add remaining nodes and get the carry
        addListOfSameSize(n.next, m.next);

        // add digits of current nodes and propagated carry
        int sum = Integer.valueOf(n.data()) + Integer.valueOf(m.data()) + carry;
        carry = sum / 10;
        sum = sum % 10;

        // Push this to result list
        push(sum, 3);
        return this.sum;
    }
    /* A utility function to push a value to linked list */
    void push(int val, int list)
    {
        SingleNode newnode = new SingleNode(val+"");
        if (list == 1)
        {
            newnode.next = this.list1.head();
            this.list1.setHead(newnode);
        }
        else if (list == 2)
        {
            newnode.next = this.list2.head();
            this.list2.setHead(newnode);
        }
        else
        {
            newnode.next = this.sum.head();
            this.sum.setHead(newnode);
        }

    }

}
