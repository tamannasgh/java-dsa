public class Richest {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int max = 0;
        for (int[] person:accounts ) {
            int sum =0;
            for (int account:person  ) {
                sum += account;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;

    }
}
