public class SkipX {
    public static void main(String[] args) {
        String up = "rapptletab";
        System.out.println(skipAppNotAppleRet(up));
    }

    static void skipA(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skipA(p, up.substring(1));
        } else{
            skipA(p+ch, up.substring(1));
        }
    }
    static String skipARet(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipARet(up.substring(1));
        } else{
            return ch + skipARet(up.substring(1));
        }
    }
    static String skipAppleRet(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipAppleRet(up.substring(5));
        } else{
            return up.charAt(0) + skipAppleRet(up.substring(1));
        }
    }
    static String skipAppNotAppleRet(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple") ){
            return skipAppNotAppleRet(up.substring(3));
        } else{
            return up.charAt(0) + skipAppNotAppleRet(up.substring(1));
        }
    }
}
