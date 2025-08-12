import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int count = 1; count <= 10; count++){
            sum += count;
            System.out.print("enter score: ");
            int score = input.nextInt();
        }
        System.out.println("Sum of scores: " + sum);
    }
}
