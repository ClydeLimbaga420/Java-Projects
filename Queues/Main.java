import java.util.Scanner;
public class Main {
    public static void main ( String[] args ) {

        Queues queues = new Queues();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int data;
        int loop = 1;

        do {
            System.out.println("Pick a choice");
            System.out.println("1. Add an element");
            System.out.println("2. Remove first element");
            System.out.println("3. View front element");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print(">> ");
            choice = scanner.nextInt();
            if ( choice == 1 ) {
                System.out.print("Enter element to input >> ");
                data = scanner.nextInt();
                queues.enqueue(data);
                System.out.println();
            } else if ( choice == 2 ) {
                queues.dequeue();
                System.out.println();
            } else if ( choice == 3 ) {
                System.out.print("Front element: ");
                queues.peek();
                System.out.println();
            } else if ( choice == 4 ) {
                queues.isEmpty();
                System.out.println();
            } else if ( choice == 5 ) {
                queues.isFull();
                System.out.println();
            } else if ( choice == 6 ) {
                System.out.println();
                queues.display();
                System.out.println();
            }  else if ( choice == 7 ) {
                loop = 0;
            } else {
                System.out.println("Invalid");
            }

        } while ( loop == 1 );

    }
}