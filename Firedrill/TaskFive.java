import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter number: ");
            int scores = input.nextInt();
            if (scores % 2 == 0){
                sum += scores;
            }
        }
        System.out.println("Sum of even numbers: " + sum);

    }
}
