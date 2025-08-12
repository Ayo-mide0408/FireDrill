import java.util.Scanner;

public class TaskThree {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            double average = 0;
            for(int counter = 1; counter <= 10; counter++){
                sum += counter;
                System.out.print("enter score: ");
                int score = input.nextInt();
            }
            average = (double) sum / 10;
            System.out.println("Sum of scores: " + sum);
            System.out.println("Average of scores: " + average);
        }
    }


