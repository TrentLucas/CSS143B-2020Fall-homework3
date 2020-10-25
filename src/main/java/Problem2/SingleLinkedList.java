package Problem2;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        // homework
        if (list == null) {
            return;
        }
        ListNode p1 = new ListNode();
        head = p1;
        ListNode p2 = list.head.next;
        while (p2 != null) {
            p1.next = new ListNode(p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        size = list.size;
    }

    public int removeAll(int valueToRemove) {
        // homework
        int count = 0;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p1 != null) {
            if (p1.val == valueToRemove) {
                count++;
                size--;
            }
            p1 = p1.next;
        }
        return count; // place holder
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // homework
        ListNode p0 = head;
        ListNode p1 = head.next;
        ListNode p2 = null;
        //System.out.println(p1.val);
        if (size > 0) {
            while (p2 != null) {
                p2.next = p0.next;
                p0.next = p2;
                p1.next = p2.next;
            }
        }
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
