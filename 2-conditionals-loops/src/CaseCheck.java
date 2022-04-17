import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().trim().charAt(0);

        if(character >= 65 && character <=90){
            System.out.println("capital");
        } else if(character >= 97 && character <= 122){
            System.out.println("lower");
        } else {
            System.out.println("not an alphabet");
        }
    }
}
