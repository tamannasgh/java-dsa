import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("enter the operator: ");
            char op = scan.next().trim().charAt(0);
            if(op == 'X' || op == 'x'){
                break;
            }
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.print("enter 1st num : ");
                int num1 = scan.nextInt();
                System.out.print("enter 2nd num : ");
                int num2 = scan.nextInt();

                if(op == '+'){
                    System.out.println("the sum is : " + (num1 + num2));
                }

                else if(op == '-'){
                    System.out.print("subtract " +num2+ " from " +num1+ " y or n : ");
                    char ch = scan.next().toLowerCase().trim().charAt(0);
                    if(ch == 'y'){
                        System.out.println("the subtraction is : " + (num1 - num2));
                    } else{
                        System.out.println("the subtraction is : " + (num2 - num1));
                    }
                }

                else if(op == '*'){
                    System.out.println("the multiply is : " + (num1 * num2));
                }

                else if(op == '/'){
                    if(num2 == 0){
                        System.out.println("any number can't divide by 0.");
                    } else{
                        System.out.println("the division is : " + (num1 / num2));
                    }
                }

                else{
                    if(num2 == 0){
                        System.out.println("any number can't divide by 0, so remainder is not possible.");
                    } else{
                        System.out.println("the remainder is : " + (num1 % num2));
                    }
                }
            } else{
                System.out.println("please enter valid stuff.");
            }
        }
    }
}
