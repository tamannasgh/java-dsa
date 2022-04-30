public class SubProSum {
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;

        while(n > 0){
            sum += n%10;
            pro *= n %10;
            n /= 10;
        }
        return pro-sum;
    }
}
