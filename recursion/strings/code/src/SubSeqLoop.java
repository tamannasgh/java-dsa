import java.util.ArrayList;

public class SubSeqLoop {
    public static void main(String[] args) {
        String str = "abbd";
        System.out.println( subSeqRetDup(str));
    }


    static ArrayList<String> subSeqRet(String str){
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        for (int i = 0; i < str.length(); i++) {
            int n = list.size();
            for (int j =0; j < n; j++){
                list.add(String.valueOf(list.get(j)) + String.valueOf(str.charAt(i)) );
            }

        }
        list.remove(0);
        return list;
    }

    static ArrayList<String> subSeqRetDup(String str){
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        for (int i = 0; i < str.length(); i++) {
            if(i > 0 && str.charAt(i) == str.charAt(i-1));
            else {
                int n = list.size();
                for (int j =0; j < n; j++){
                    list.add(String.valueOf(list.get(j)) + String.valueOf(str.charAt(i)) );
                }
            }
        }
        list.remove(0);

        return list;
    }


}
