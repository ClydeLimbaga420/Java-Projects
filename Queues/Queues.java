public class Queues {
    private Node head;
    int limit = 5;
    int add = 0;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if ( add != limit ) {
            if ( head == null ) {
                head = newNode;
                add = add + 1;
                return;
            }
            Node temp = head;
            while ( temp.next != null ) {
                temp = temp.next;
            }
            temp.next = newNode;
            add = add + 1;
        } else {
            System.out.println("Queue is full");
        }
        }

    public void dequeue() {
        if ( head == null ) {
            System.out.println("Queue is empty");
            return;
        }
        head = head.next;
    }

    public void peek() {
        if ( head == null ) {
            System.out.println("Queue is empty");

        } else {
            System.out.println( head.data );
        }
    }

    public void isEmpty() {
        if ( head == null ) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public void isFull() {
        if ( head == null ) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is full");
        }
    }

    public void display() {
        if ( head == null ) {
            System.out.println("Queue is empty");
        } else {
            Node temp = head;
            while ( temp != null ) {
                System.out.print( temp.data + " ");
                temp = temp.next;
            }
        }
    }


}
