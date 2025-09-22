import java.util.Scanner;
public class BubbleSort {
    public static void main( String[] args ) {

        Scanner input = new Scanner ( System.in );
        int temp;
        System.out.print("Enter size of array >> ");
        int size = input.nextInt();
        int[] array = new int[size];

        for ( int i = 0; i < size; i++ ) {
            System.out.println("Enter element " + ( i + 1) + " ");
            array[i] = input.nextInt();
        }
        System.out.print("Unsorted array >> ");
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + " ");
        }

        for ( int i = 0; i < size - 1; i++ ) {
            for ( int j = 0; j < size - 1; j++ ) {
                if ( array[j] > array[j + 1] ) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array >> ");
        for ( int i = 0; i < size; i++ ) {
            System.out.print(array[i] + " ");
        }

    }
}