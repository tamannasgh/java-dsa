public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    static int guessNumber(int n){
        int s = 1;
        int e = n;

        while(s <= e){
            int m = s + (e-s)/2;

            int result = guess(m);

            if(result == 0){
                return m;
            }
            if(result == 1){
                s = m + 1;
            } else{
                e = m -1;
            }
        }

        return -1;
    }

    static int guess(int guessed){
        int num = 4;
        if (guessed == num) {
            return 0;
        }
        if(guessed < num){
            return 1;
        } return -1;
    }


}
