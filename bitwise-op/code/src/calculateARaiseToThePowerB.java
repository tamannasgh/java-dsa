public class calculateARaiseToThePowerB {
    public static void main(String[] args) {
        int power = 4;
        int base = 3;
        int ans = 1;

        while(power > 0){
            int last = power & 1;
            if(last == 1){
                ans *= base;
            }
            base *= base;   //kyunki base 2 main base bhi to 2 fir 4 double hoke bdhta h to isliye
            power >>= 1;
        }
        System.out.println(ans);
    }
}
