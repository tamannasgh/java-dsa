public class PowerOf2 {
    public static void main(String[] args) {
        int n = 6;
        boolean powerOf2 = (n & (n-1)) == 0;
        System.out.println(powerOf2);
    }
}
