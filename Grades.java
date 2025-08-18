public class Grades {
    public static void main(String[] args) {
        int [][] grades = {
                {90,99,97},
                {91,98,80},
                {90,75,79}
        };

        int sum = 0;
        int num = 0;
        double average = 0;
        for ( int i = 0; i < grades.length; i++ ) {
            System.out.println();
            for ( int j = 0; j < grades.length; j++ ) {
                sum += grades[i][j];
                System.out.print(grades[i][j] + " ");
            }
        }
        for ( int i = 0; i < grades.length; i++ ) {
            num += grades.length;

        }
        System.out.println("\nSum: "+ sum);
        average = (double)sum / num;
        System.out.println("Average: "+ average);
    }
}