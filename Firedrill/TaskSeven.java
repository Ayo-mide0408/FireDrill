import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter number: ");
            int scores = input.nextInt();
            if (count % 2 == 0){
                sum += scores;
            }
        }
        average = (double) sum / 10;
        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Average: " + average);

    }
}
