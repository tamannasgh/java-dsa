public class Main {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            int c = (2*n-1)- 2*row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern8(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n- row-1; space++) {
                System.out.print("  ");
            }
            int c = row*2 +1;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row < n; row++) {
            for (int spacing = 0; spacing < row; spacing++) {
                System.out.print("  ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int spacing =0 ; spacing < n - row-1 ; spacing++){
                System.out.print("  ");
            }
            for (int col = 0; col < row +1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n-1 ; row++) {
            int c = row < n ? row+1 : 2*n -1 - row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}