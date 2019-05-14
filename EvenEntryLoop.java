import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int userEntry = 0;
        String result;
        Scanner input = new Scanner(System.in);

        while (userEntry != 999) {
            System.out.println("Welcome to my game.\n");
            System.out.println("Its called even loop\n");
            System.out.println("Enter an even number >>>>>\n");
            userEntry = input.nextInt();

            if (userEntry % 2 == 0) {
                result = userEntry + "Good job!";
            } else
                result = userEntry + "Error! not an even number";

            System.out.println(result);
        }
    }
}