import java.util.Scanner;

public class TaskTwo {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sum = 0;
       double average = 0;
       for(int count = 1; count <= 10; count++){
           sum += count;
           System.out.print("enter score: ");
           int score = input.nextInt();
       }
        average = (double) sum/10;System.out.println(sum);
       System.out.println(average);
   }
}
