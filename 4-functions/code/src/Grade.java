import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        //
        //
        //Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your marks: ");
        int marks = scan.nextInt();
        System.out.println("your grade is : " +getGrade(marks));
    }
    static String getGrade(int marks){
        if(marks <=40){
            return "Fail";
        }
        if(marks <=50){
            return "DD";
        }
        if(marks <=60){
            return "CD";
        }
        if(marks <=70){
            return "BC";
        }
        if(marks <=80){
            return "BB";
        }
        if(marks <=90){
            return "AB";
        }
        return "AA";
    }
}
