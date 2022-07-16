public class DivideChocolate {
    public static void main(String[] args) {
        int[] sweetness = {5,6,7,8,9,1,2,3,4};
        int k = 8;
        System.out.println(maxSweetness(sweetness, k));
    }

    static int maxSweetness(int[] sweetness, int k){
        int s = 1;
        int e = 0;

        for(int sweet : sweetness){
            e += sweet;
        }

        while(s < e){
            int m = s + (e-s)/2;

            if(canDivide(sweetness, m, k)){
                s = m+1;
            } else{
                e=m;
            }
        }
        return  canDivide(sweetness, s, k) ? s : s-1;
    }

    static boolean canDivide(int[] sweetness, int atLeastSweetness, int k){
        int pieces = 1;
        int sum = 0;
        for(int sweet : sweetness){
           if(sum < atLeastSweetness ){
               sum += sweet;
           }else{
               sum = sweet;
               pieces++;
           }
        }

        return pieces >= k+1;
    }

}
