public class NewtonSqrt {
    public static void main(String[] args) {
        int n = 2;
        System.out.printf("%.2f", sqrt(n));
    }
    static double sqrt(int n){
        double root;
        double x = n;

        while (true){
            root = 0.5 * (x +(n/x));

            if(Math.abs(root - x) < 0.05){
                break;
            }
            x = root;
        }
        return root;
    }
}
