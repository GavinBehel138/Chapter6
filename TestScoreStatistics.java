import java.util.Scanner;

public class TestScoreStatistics
{
    public static void main(String[] args){
        int high =0;
        int low =100;
        int scoreEntered =0;
        int A =90-100;
        int B =80-89;
        int C =70-79;
        int D =60-69;
        int F =0-59;
        Scanner input = new Scanner(System.in);

        while(scoreEntered != 999) {
            scoreEntered = input.nextInt();

            if (scoreEntered > high) {
                high = scoreEntered;
            } else if (scoreEntered < low) {
                low = scoreEntered;
            }
        }
        System.out.println("*****************Display Graph**************");
        System.out.print("A's"); displayBar(A);
        System.out.print("B's"); displayBar(B);
        System.out.print("C's"); displayBar(C);
        System.out.print("D's"); displayBar(D);
        System.out.print("F's"); displayBar(F);
    }
    private static void displayBar ( int b){
        for (int i = 0; i < b; ++i) {
            System.out.print("#");
        }
        System.out.println();
    }
}
