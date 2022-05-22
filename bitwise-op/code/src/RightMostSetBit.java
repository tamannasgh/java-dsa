public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 4;    //complement and 1 to it its is 2s complement method which convert binary num to negative, or bss tu khud soch tannu 101 ko negative bnana h to ulta 010 to ab tu dekhri h jo 1 the set bits wo zero bn gye or 0 -> 1 ab +1 krne pr kya hoga aage ko jitne 0 the wo to ab 1 h to 1+1 ho jaeyga 10 1 carry or neeche 0 fir krte krte ye karry jb set bit jo ab reverse hoke 0 h uspe aaegi tb ye wahan 1 hoga or peeche sarri cheezein ab tu khud soch jo pehle zero the vo zero rhe jo 1 the wo 1 pr ab baai soch mujhe pta h tu smjh gyi ab
        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.toBinaryString(~n+1));
        n = n & (-n);
        System.out.println(Integer.toBinaryString(n));

    }
}
