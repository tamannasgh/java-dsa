import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("enter a num : ");
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            sum += n;
        }
        System.out.println("the sum is : " +sum);
    }
}
