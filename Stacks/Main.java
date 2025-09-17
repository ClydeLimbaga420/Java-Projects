import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Stacks s = new Stacks();
        Scanner input = new Scanner(System.in);
        int choice;
        int data;
        int run = 1;

        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);

        while ( run == 1 ) {
            System.out.println("1. Push an value in stack");
            System.out.println("2. Pop an value in stack");
            System.out.println("3. Check the size");
            System.out.println("4. Check if the Stack is full");
            System.out.println("5. Check if the Stack is empty");
            System.out.println("6. Check the top number");
            System.out.println("7. Search for a value");
            System.out.println("8. Display Stack");
            System.out.println("9. Exit");
            System.out.print("Enter your choice >> ");
            choice = input.nextInt();

            if ( choice == 1 ) {
                System.out.print("Enter value to push >> ");
                data = input.nextInt();
                s.push(data);
            } else if ( choice == 2 ) {
                s.pop();
            } else if ( choice == 3 ) {
                System.out.println("Size of the Stack >> " + s.size());
            } else if ( choice == 4 ) {
                s.isFull();
            } else if ( choice == 5 ) {
                System.out.println(s.isEmpty());
            } else if ( choice == 6 ) {
                s.peek();
            } else if ( choice == 7 ) {
                System.out.print("Enter value to search >> ");
                data = input.nextInt();
                System.out.println(s.search(data));
            } else if ( choice == 8 ) {
                s.display();
            } else if ( choice == 9 ) {
                run = 0;
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
