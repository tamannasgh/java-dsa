import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("", 3));
        System.out.println(diceFaceRet("", 7, 8));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p+i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target ; i++) {
             ans.addAll(diceRet(p+i, target - i));
        }

        return ans;
    }

    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i <= target ; i++) {
            ans.addAll(diceFaceRet(p+i, target - i, face));
        }

        return ans;
    }
}
