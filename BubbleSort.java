import java.util.Scanner;
public class BubbleSort {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        int temp;
        boolean run = true;

        System.out.print("Enter size of the array >> ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for ( int i = 0; i < size; i++ ) {
            System.out.println("Enter element #" + ( i + 1 ));
            arr[i] = input.nextInt();
        }

        System.out.print("Elements inputted >> ");
        for ( int i = 0; i < size; i++ ) {
            System.out.print( arr[i] + " ");
        }

            System.out.println(" ");
            System.out.println("Choose the Order");
            System.out.println("1. Ascending Order");
            System.out.println("2. Descending Order");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");

            if (choice == 1) {
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                    for (int k = 0; k < size; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ");
                }
            } else if (choice == 2) {
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                    for (int k = 0; k < size; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ");
                }
            } else if ( choice == 3 ) {
                run = false;
            } else {
                System.out.println("Invalid Choice");
            }

    }
}
