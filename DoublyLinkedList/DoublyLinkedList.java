
class DoublyLinkedList {
    Url head;
    Url tail;

    public void addUrl ( String url ) {
        Url temp = new Url(url);
        if ( tail == null ) {
            head = temp;
            tail = temp;

        }else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        System.out.println("New Link " + url);
    }

    public void moveBackward() {
        Url current = tail;
        System.out.println("Url Backwards");
        while ( current != null ) {
            System.out.println(current.url + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void moveForward() {
        Url current = head;
        System.out.println("Url Forward");
        while ( current != null ) {
            System.out.println(current.url + " ");
            current = current.next;
        }
    }

    public void displayForward() {
        System.out.println("History List Forward");
        Url current = head;
        while (current != null) {
            System.out.println(current.url + " ");
            current = current.next;
        }
    }

    public void displayBackward() {
        System.out.println("History List Backwards");
        Url current = tail;
        while ( current != null ) {
            System.out.println(current.url + " ");
            current = current.prev;
        }
    }

}