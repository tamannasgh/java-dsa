public class Patterns {
    public static void main(String[] args) {
        pattern1In2Way( 4, 0);
    }
    static void pattern1(int n, int r, int c){
        if(r == 0){
            return;
        }
        if(r+c <= n){
            System.out.print("* ");
            pattern1(n, r, c+1);
        } else{
            System.out.println();
            pattern1(n, r-1, 0);
        }
    }

    static void pattern2(int r, int c){
        if(r ==0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            pattern2(r, c+1);
        }
        else{
            System.out.println();
            pattern2(r-1, 0);
        }
    }

    static void pattern1In2Way(int r, int c){
        if(r ==0){
            return;
        }
        if(c < r){
            pattern1In2Way(r, c + 1);
            System.out.print("* ");
        }
        else{
            pattern1In2Way(r-1, 0);
            System.out.println();
        }
    }

}
