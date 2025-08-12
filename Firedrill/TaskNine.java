import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("enter number: ");
            int valid = input.nextInt();
            if(valid <= 100){
                sum += valid;
            }else{
                System.out.println("invalid");
            }
        }
        System.out.println(sum);

    }
}
