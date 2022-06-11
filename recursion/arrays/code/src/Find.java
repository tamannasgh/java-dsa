import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
//        System.out.println(isThere(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexFromLast(arr, 4, arr.length-1));
//        updateTheGlobalList(arr, 4, 0);
//        System.out.println(list);
//        System.out.println(findAllIndex2(arr, 4, 0));
        System.out.println(findAllIndex3(arr, 4, 0));
    }

    static boolean isThere(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return isThere(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }
    static int findIndexFromLast(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexFromLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>(1);
    static void updateTheGlobalList(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        updateTheGlobalList(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(1);
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        list.addAll( findAllIndex2(arr, target, index+1));
        return list;
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(1);
        return helper(arr, target, index+1, list);
    }

    static ArrayList<Integer> helper(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return helper(arr, target, index+1, list);
    }
}
