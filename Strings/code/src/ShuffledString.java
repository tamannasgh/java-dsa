public class ShuffledString {
    public static void main(String[] args) {
        String ans = restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            ans.setCharAt(indices[i], s.charAt(i));
        }

        return ans.toString();
    }

}
