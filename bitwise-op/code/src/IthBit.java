public class IthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(Integer.toBinaryString(n));
        int mask = 1 << (i-1);
        int ans = n & mask;
        if(ans == 0){
            System.out.println(0);
        } else{
            System.out.println(1);
        }
    }
}
