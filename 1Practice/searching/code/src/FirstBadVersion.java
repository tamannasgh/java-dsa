public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    static int firstBadVersion(int n) {
        if(isBadVersion(1)){
            return 1;
        }

        int s = 1;
        int e = n;
        while(s < e){
            int m = s + (e -s)/2;

            if(isBadVersion(m)){
                e = m;
            } else{
                s = m +1;
            }
        }
        return s;
    }

    static boolean isBadVersion(int n){
        return n == 4;
    }
}
