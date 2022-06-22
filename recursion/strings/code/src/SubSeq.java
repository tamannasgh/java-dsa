import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String up = "abbc";
        System.out.println(subSeqDupRet("", up));
    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }

        subSeq(p, up.substring(1));
        subSeq(p+ up.charAt(0), up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }

        ArrayList<String> belowCalls = new ArrayList<>();

        belowCalls.addAll(subSeqRet(p, up.substring(1)));
        belowCalls.addAll(subSeqRet(p+ up.charAt(0), up.substring(1)));

        return belowCalls;
    }

    static void subSeqDup(String p, String up){
        if(up.isEmpty()){
            if (!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }

        String check = String.valueOf(up.charAt(0));

        if(p.contains(check)){
            subSeqDup("", "");
        } else{
            subSeqDup(p, up.substring(1));
            subSeqDup(p+ up.charAt(0), up.substring(1));
        }


    }

    static ArrayList<String> subSeqDupRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            if (!p.isEmpty()){
                ans.add(p);
            }
            return ans;
        }

        String check = String.valueOf(up.charAt(0));
        ArrayList<String> finalAns = new ArrayList<>();

        if(p.contains(check)){
            subSeqDupRet("", "");
        } else{
            finalAns.addAll(subSeqDupRet(p, up.substring(1)));
            finalAns.addAll(subSeqDupRet(p+ up.charAt(0), up.substring(1)));
        }

        return finalAns;
    }
}
