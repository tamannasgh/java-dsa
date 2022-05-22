public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,2,1,1};
        //will work only in even repetition.

        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        System.out.println(unique);
    }
}
