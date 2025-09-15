public class Stacks {
    private Node head;
    private int size;
    int limit;

    public Stacks() {
        head = null;
        size = 0;
        limit = 5;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        if (size == limit) {
            System.out.println("Stack Overflow");
            return;
        }
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else if (head.next == null) {
            int data = head.data;
            head = null;
            size--;
            System.out.println("Removed >> " + data);
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int data = temp.next.data;
            temp.next = null;
            size--;
            System.out.println("Removed >> " + data);
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public int size() {
        return size;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node temp = head;
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void isFull() {
        if (size == limit) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    public boolean search (int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Found");
                return true;

            }


            temp = temp.next;
        }
        System.out.println("Not found");
        return false;
    }
}