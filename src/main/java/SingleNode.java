public class SingleNode {
    public SingleNode next;
    private String data;

    public SingleNode(String data){
        this.data = data;
    }

    public String data() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public SingleNode next() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public String toString(){
        return this.data;
    }
}
