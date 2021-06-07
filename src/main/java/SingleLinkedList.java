import javax.xml.soap.Node;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    public SingleLinkedList(){
        this.head = new SingleNode("");
        tail = head;
    }
    public SingleNode head(){
        return head;
    }
    public void setHead(SingleNode node){
        head = node;
    }

    public void add(SingleNode node){
        tail.next = node;
        tail = node;
    }
    public void reverseRecursively(SingleLinkedList list){
        Reverse reverse = new Reverse();
        head = reverse.reverseRecursively(list.head());
    }

}
