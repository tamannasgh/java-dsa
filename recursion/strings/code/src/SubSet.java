import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(subSetRet(new ArrayList<>(), arr));
    }

    static void subSet(ArrayList<Integer> list, int[] arr){
        if(arr.length == 0){
            if(!list.isEmpty()){
                System.out.println(list);
            }
            return;
        }

        subSet(list, Arrays.copyOfRange(arr, 1, arr.length));
        ArrayList<Integer> listAdd = new ArrayList<>(list);
        listAdd.add(arr[0]);
        subSet(listAdd, Arrays.copyOfRange(arr, 1, arr.length));
    }
    static ArrayList<ArrayList<Integer>> subSetRet(ArrayList<Integer> list, int[] arr){
        if(arr.length == 0){
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            if(!list.isEmpty()){
                ans.add(list);
            }
            return ans;
        }

        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();

        finalAns.addAll(subSetRet(list, Arrays.copyOfRange(arr, 1, arr.length)));
        ArrayList<Integer> listAdd = new ArrayList<>(list);
        listAdd.add(arr[0]);
        finalAns.addAll(subSetRet(listAdd, Arrays.copyOfRange(arr, 1, arr.length)));

        return finalAns;
    }



    static void subSetDup(ArrayList<Integer> list, int[] arr){
        if(arr.length == 0){
            if(!list.isEmpty()){
                System.out.println(list);
            }
            return;
        }

        if(list.contains(arr[0])){
            list.clear();
            subSetDup(list, new int[0]);
        } else{
            subSetDup(list, Arrays.copyOfRange(arr, 1, arr.length));
            ArrayList<Integer> listAdd = new ArrayList<>(list);
            listAdd.add(arr[0]);
            subSetDup(listAdd, Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

}
