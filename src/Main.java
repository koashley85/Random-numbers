// This software is written by Kavion Ashley
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int number1 = 0, number2 = 0, sum = 0, answer = 0, i=0, totalCorrect=0, totalWrong=0;
        Scanner scanner = new Scanner(System.in);

        Random randomNumbers = new Random();

        while (i<10){
            number1 = randomNumbers.nextInt(10);
            number2 = randomNumbers.nextInt(10);
            sum = number1 + number2;
            System.out.printf("What is %d + %d = ", number1, number2);
            answer = scanner.nextInt();
            System.out.println();
            i++;
            if (answer == sum) {
                //System.out.println("Correct");
               // System.out.printf("%d + %d = %d", number1, number2, sum);
               // System.out.println(" ");
                totalCorrect++;
                System.out.flush();

            } else {
              //  System.out.println("");
                //System.out.println("WRONG");
               // System.out.printf("%d + %d = %d \n", number1, number2, sum);
                totalWrong++;
                System.out.flush();
            }

            // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        }
        System.out.printf("You had %d right \n", totalCorrect);
        System.out.printf("You had %d wrong \n", totalWrong);
    }
}