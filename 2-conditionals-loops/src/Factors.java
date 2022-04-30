import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //input a num and output all the factors of it abhi loops se fir function se or return krenge array

        System.out.print("enter a num: ");
        int n = scan.nextInt();

        for(int i =1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i +" ");
            }
        }
    }
}
