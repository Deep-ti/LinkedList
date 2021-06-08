public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("###############################START###############################");
        System.out.println("Problem 1");
        System.out.println("How do you find the middle element of a singly linked list in one pass?");

        SingleLinkedList singleLinkedList = new SingleLinkedList("0");
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("2"));
        singleLinkedList.add(new SingleNode("3"));
        singleLinkedList.add(new SingleNode("4"));

        System.out.println("Given List::: ");
        main.printList(singleLinkedList);

        MiddleElement middleElement = new MiddleElement();
        middleElement.find(singleLinkedList);

        System.out.println("##############################################################");
        System.out.println("Problem 2");
        System.out.println("How do you check if a given linked list contains a cycle? How do you find the starting node of the cycle?");
        //creating LinkedList with 5 elements including head
        singleLinkedList = new SingleLinkedList("001");
        singleLinkedList.add(new SingleNode("101"));
        SingleNode cycle = new SingleNode("201");
        singleLinkedList.add(cycle);
        singleLinkedList.add(new SingleNode("301"));
        singleLinkedList.add(new SingleNode("401"));
        singleLinkedList.add(new SingleNode("501"));
        singleLinkedList.add(cycle);

        System.out.println("Given List::: ");
       // main.printList(singleLinkedList);

        Cycles cycles = new Cycles();
        if (cycles.isCyclic(singleLinkedList)) {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
        System.out.println("##############################################################");
        System.out.println("Problem 3");
        System.out.println("How do you reverse a linked list?");

        singleLinkedList = new SingleLinkedList("0"); // adding node into singly linked list
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("2"));
        singleLinkedList.add(new SingleNode("3"));
        singleLinkedList.add(new SingleNode("4"));
        singleLinkedList.add(new SingleNode("5"));

        System.out.println("Given List::: ");
        main.printList(singleLinkedList);

        Reverse reverse = new Reverse();
        reverse.reverseWithoutRecursion(singleLinkedList);

        System.out.println("Reverse without recursion List::: ");
        main.printList(singleLinkedList);


        singleLinkedList.reverseRecursively(singleLinkedList);

        System.out.println("Reverse with recursion List::: ");
        main.printList(singleLinkedList);


        System.out.println("##############################################################");
        System.out.println("Problem 4");
        System.out.println("How are duplicate nodes removed in an unsorted linked list?");

        singleLinkedList = new SingleLinkedList("4"); // adding node into singly linked list
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("2"));
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("3"));
        singleLinkedList.add(new SingleNode("2"));

        System.out.println("Given List::: ");
        main.printList(singleLinkedList);

        Duplicates duplicates = new Duplicates();
        duplicates.remove(singleLinkedList.head());

        System.out.println("List without duplicates::: ");
        main.printList(singleLinkedList);

        System.out.println("##############################################################");
        System.out.println("Problem 5");
        System.out.println("How do you find the length of a singly linked list? ");

        singleLinkedList = new SingleLinkedList("0"); // adding node into singly linked list
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("2"));
        singleLinkedList.add(new SingleNode("3"));
        singleLinkedList.add(new SingleNode("4"));
        singleLinkedList.add(new SingleNode("5"));

        System.out.println("Given List::: ");
        main.printList(singleLinkedList);

        Length length = new Length(singleLinkedList);

        System.out.println("Length of list found iteratively = " + length.findIteratively());
        System.out.println("Length of list found recursively = "+length.findRecursively(singleLinkedList.head()));


        System.out.println("##############################################################");
        System.out.println("Problem 6");
        System.out.println("How do you find the third node from the end in a singly linked list?");

        singleLinkedList = new SingleLinkedList("0"); // adding node into singly linked list
        singleLinkedList.add(new SingleNode("1"));
        singleLinkedList.add(new SingleNode("2"));
        singleLinkedList.add(new SingleNode("3"));
        singleLinkedList.add(new SingleNode("4"));
        singleLinkedList.add(new SingleNode("5"));

        System.out.println("Given List::: ");
        main.printList(singleLinkedList);

        KthNode kthNode = new KthNode(singleLinkedList);
        System.out.println("3rd Last node is " + kthNode.find(3));

        System.out.println("##############################################################");
        System.out.println("Problem 7");
        System.out.println("How do you find the sum of two linked lists using Stack?");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList("0"); // adding node into singly linked list
        singleLinkedList1.add(new SingleNode("1"));
        singleLinkedList1.add(new SingleNode("2"));
        singleLinkedList1.add(new SingleNode("3"));
        singleLinkedList1.add(new SingleNode("4"));
        singleLinkedList1.add(new SingleNode("5"));

        SingleLinkedList singleLinkedList2 = new SingleLinkedList("0"); // adding node into singly linked list
        singleLinkedList2.add(new SingleNode("1"));
        singleLinkedList2.add(new SingleNode("2"));
        singleLinkedList2.add(new SingleNode("3"));
        singleLinkedList2.add(new SingleNode("4"));
        singleLinkedList2.add(new SingleNode("5"));
        singleLinkedList2.add(new SingleNode("5"));

        System.out.println("Given Lists::: ");
        main.printList(singleLinkedList1);
        main.printList(singleLinkedList2);

        Sum sum = new Sum(singleLinkedList1, singleLinkedList2);
        SingleLinkedList result = sum.findUsingStack();
        System.out.println("Sum of List::: ");
        main.printList(result);

    }

    void printList(SingleLinkedList singleLinkedList){
        SingleNode node = singleLinkedList.head();
        while (node != null) {
            System.out.print(node.data() + " ");
            node = node.next();
        }
        System.out.println("");
    }

}
