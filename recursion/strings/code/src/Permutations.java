import javax.management.monitor.StringMonitor;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
//        System.out.println(permRet("", up));
        System.out.println(permCount("", up));
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int n = p.length();
        char ch = up.charAt(0);

        for (int i = 0; i <= n; i++) {
            String f  = p.substring(0, i);
            String l = p.substring(i, n);

            perm(f + ch + l, up.substring(1));
        }
    }

    static ArrayList<String> permRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int n = p.length();
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            String f  = p.substring(0, i);
            String l = p.substring(i, n);

            ans.addAll(permRet(f + ch + l, up.substring(1)));
        }
        return ans;
    }

    static int permCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int n = p.length();
        char ch = up.charAt(0);

        int count =0;

        for (int i = 0; i <= n; i++) {
            String f  = p.substring(0, i);
            String l = p.substring(i, n);

            count += permCount(f + ch + l, up.substring(1));   //ye sbse pele call krega ("a", "bc) ko fir ye krega oron ko pr ye mt sochna to ye to fir jada ho jaega dhyaan se dekho hum 1 tbhi return krre h jb up emty ho jaye mtlb jb ek perm mil jaye to ye number hi return krega isliye ye call return jo kregi seedha usi ko hi add krre h return krega
        }
        return count;
    }
}
