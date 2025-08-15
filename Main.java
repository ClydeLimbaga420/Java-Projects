public class Main {
    public static void main (String[] args) {
        int [] scores = { 90,87,65,89,98,88,94,95,75,100 };
        int highScore = 0;
        int lowScore = scores[0];
        int total = 0;
        float average = 0;
        for ( int i = 0; i < scores.length; i++ ) {
            if ( highScore <= scores[i] ) {
                highScore = scores[i];
            }
        }
        System.out.println("Highest Score:"+ highScore);
        for ( int i = 0; i < scores.length; i++ ) {
            if ( lowScore >= scores[i] ) {
                lowScore = scores[i];
            }
        }
        System.out.println("Lowest Score:"+ lowScore);

        for ( int i = 0; i < scores.length; i++ ) {
            total = total + scores[i];
        }
        average = total / scores.length;
        System.out.println("Average:"+average);
    }
}