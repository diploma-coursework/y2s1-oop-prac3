import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get number of scores to enter
        System.out.print("Enter number of quiz scores to process: ");
        int numOfScores = scanner.nextInt();
        int[] scores = new int[numOfScores];

        // read all scores
        int sumOfScores = 0;
        for (int i = 0; i < numOfScores; i++) {
            System.out.printf("Score %d: ", i + 1);
            scores[i] = scanner.nextInt();
            sumOfScores += scores[i];
        }

        double average = (double) sumOfScores / numOfScores;
        int aboveEqAvg = 0, belowAvg = 0;
        for (int score : scores) {
            if ((double) score >= average) aboveEqAvg++;
            else belowAvg++;
        }

        System.out.printf("""
            Results
            =======
            Average is %.1f
            Number of scores above or equal to the average is %d
            Number of scores below the average is %d
            """,
            average, aboveEqAvg, belowAvg
        );
    }
}
