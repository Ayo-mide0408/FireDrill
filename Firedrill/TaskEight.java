import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for(int count = 1; count <= 10; count++){
            System.out.println("Enter valid scores between 0 and 100: ");
            int valid = input.nextInt();
            if(valid >= 0 && valid <= 100){
                sum += valid;
            }else{
                System.out.println("invalid");
            }

        }
        System.out.println("Sum of valid score: "+ sum);


    }
}
