import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList url = new DoublyLinkedList();
        int choice;
        String link;
        url.addUrl("https://github.com/");
        url.addUrl("https://facebook.com/");
        url.addUrl("https://twitter.com/");
        do {

            System.out.println("What do you want to do?");
            System.out.println("1. Visit a new site");
            System.out.println("2. Move Backward");
            System.out.println("3. Move Forward");
            System.out.println("4. Display History");
            System.out.println("Enter Choice >> ");
            Scanner myScanner = new Scanner(System.in);
            choice = myScanner.nextInt();
            myScanner.nextLine();


            if ( choice == 1 ) {
                System.out.println("Enter the URL");
                link =  myScanner.nextLine();
                url.addUrl(link);
            } else if ( choice == 2 ) {
                url.moveBackward();
            }  else if ( choice == 3 ) {
                url.moveForward();
            } else if ( choice == 4 ) {
                url.displayForward();
                url.displayBackward();
            } else {
                System.out.println("Invalid");
            }



        } while (true);
    }
}
