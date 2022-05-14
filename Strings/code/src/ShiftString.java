public class ShiftString {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("z", new int[]{53}));
    }
    static String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i+1; j++) {
                int a = (ans.charAt(j) -96) + shifts[i];

                int a2 = a % 26 == 0? 122: (a % 26) +96;
                ans.setCharAt(j, (char)(a2));
            }
        }
        return ans.toString();
    }
}
