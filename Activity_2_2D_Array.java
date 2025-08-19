import java.util.Scanner;
public class Activity_2_2D_Array {
    public static void main (String[] args) {

        int [][] grades = new int [5][4];
        int [] sum = {0,0,0,0,0};
        double [] average = {0,0,0,0,0};
        int length = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Enter Math Grade:  ");
            grades[i][0] = input.nextInt();
            System.out.println("Enter Science Grade:  ");
            grades[i][1] = input.nextInt();
            System.out.println("Enter English Grade:  ");
            grades[i][2] = input.nextInt();
            System.out.println("Enter History Grade:  ");
            grades[i][3] = input.nextInt();
        }

        String [] studentGrades  =
                {"Student ", "Math ", "Science ", "English ", "History ", "Total ", "Average "};

        for ( int i = 0; i < grades.length; i++ ) {
            length++;
            for ( int j = 0; j < grades[i].length; j++ ) {
                sum[i] = sum[i] + grades[i][j];


            }
        }

        for ( int i = 0; i < studentGrades.length; i++ ) {

            System.out.print(studentGrades[i] + "\t ");

        }
        System.out.println("\n");



        length-=1;
        for ( int i = 0; i < average.length; i++) {
            average[i] = (double)sum[i] / length;
        }

        for ( int i = 0; i < grades.length; i++ ) {
            System.out.print("Students " + (i + 1) +"\t ");
            for ( int j = 0; j < grades[i].length; j++ ) {
                System.out.print( grades[i][j] + "\t");
                System.out.print("\t  ");
            }

            System.out.print(sum[i] + "\t ");
            System.out.printf("%.2f\t",average[i]);
            System.out.println();
        }

    }
}

