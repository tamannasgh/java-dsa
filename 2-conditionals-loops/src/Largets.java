import java.util.Scanner;

public class Largets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();


//        first method
//        int largest;
//
//        if(n1 > n2){
//            if(n1 > n3){
//                largest = n1;
//            } else{
//                largest = n3;
//            }
//        } else{
//            if(n2 > n3){
//                largest = n2;
//            } else{
//                largest =n3;
//            }
//        }

//        second method

        int largest = n1;

        if(largest < n2){
            largest = n2;
        }
        if(largest < n3){
            largest = n3;
        }

        System.out.println(largest);

    }
}
