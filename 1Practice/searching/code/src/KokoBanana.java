public class KokoBanana {
    public static void main(String[] args) {
        int[] piles = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = piles[0];

        for(int pile : piles){
            e = Math.max(e, pile);
        }

        while(s < e){
            int m = s + (e-s)/2;

            if(hoursIfKIsM(piles, m, h)){
                e = m;
            } else{
                s = m +1;
            }
        }
        return s;
    }

    static boolean hoursIfKIsM(int[] piles, int assumedK, int h) {
        int hours = 0;

        for(int pile : piles){
           // dekh agr mne allow kre h 4 banana in 1 hour or is pile main 10 h to 4 + 4 kha paegi or do bchange to 3 ghnte ab ek cheez dekh simple ye nh kr skti 10 /4 to vo seedha mtlb dedega ki 10 main kitne proper 4 ke piece bnenge baat smjh soch thoda thik h or fir ek check lga liyo ki agr modulo krke 0 nhi aaara to mtlb kya h iska ki abhi kuch bche h allowed se km mtlb 4 se km h to bss hour main 1 plus krde bss ab bss shant dimaag se soch aa jaega smjh or agr allowed to 4 h pr piles h 3 to 3 /4 0 aaega or aage bss ek plus ho jaega and that is right!!
           hours += pile / assumedK;
           if(pile % assumedK != 0){
               hours++;
           }
        }
        return hours <= h;
    }
}
