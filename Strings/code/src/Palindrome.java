public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            char str1 =  s.charAt(start);
            char str2 = s.charAt(end);
            boolean str1IsAlphabet = 'A' <= str1  && str1 <= 'Z' || 'a' <= str1 && str1 <= 'z' || 48 <= str1 && str1 <= 57;
            boolean str2IsAlphabet = 'A' <= str2  && str2 <= 'Z' || 'a' <= str2 && str2 <= 'z' || 48 <= str2 && str2 <= 57;

            if(str1IsAlphabet && str2IsAlphabet ){
                if(str1 != str2){
                    return false;
                }
                start++;
                end --;
            } else if(!str1IsAlphabet && !str2IsAlphabet){
                start++;
                end--;
            } else if(str1IsAlphabet){
                end--;
            } else{
                start++;
            }
        }
        return true;
    }
}
