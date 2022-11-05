class MyLinkedList {
    int length;
    Node head;

    public MyLinkedList() {
        this.length = 0;
        head = new Node();
    }

    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        int count = 0;
        Node now = head.next;
        while (count != index) {
            now = now.next;
            count++;
        }
        return now.val;
    }

    public void addAtHead(int val) {
        Node nodeToAdd = new Node(val);
        Node next = head.next;
        head.next = nodeToAdd;
        nodeToAdd.next = next;
        this.length++;
    }

    public void addAtTail(int val) {
        Node now = head;
        while (now.next != null) {
            now = now.next;
        }
        now.next = new Node(val);
        this.length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        Node now = head;
        while (index > 0) {
            now = now.next;
            index--;
        }
        Node next = now.next;
        now.next = new Node(val);
        now.next.next = next;
        this.length++;

    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        Node now = head;
        while (index > 0) {
            now = now.next;
            index--;
        }
        now.next = now.next.next;
        this.length--;
    }
}
class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */