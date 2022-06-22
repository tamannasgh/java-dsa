import java.sql.Array;
import java.util.ArrayList;

public class SubSetLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        System.out.println(subSetDup(arr));
    }

    static void subSet(int[] arr){
       ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
       outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        outer.remove(0);
        System.out.println(outer);
    }

    static ArrayList<ArrayList<Integer>> subSetDup(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]);
            else{
                int n = outer.size();
                for (int j = 0; j < n; j++) {
                    ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
        }
        outer.remove(0);
        return outer;
    }
}
