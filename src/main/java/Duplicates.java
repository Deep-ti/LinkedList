import java.util.HashSet;

public class Duplicates {
    public void remove(SingleNode head){
        // Hash to store seen values
        HashSet<String> hs = new HashSet<>();

        /* Pick elements one by one */
        SingleNode current = head;
        SingleNode prev = null;
        while (current != null)
        {
            String curval = current.data();

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }
}
