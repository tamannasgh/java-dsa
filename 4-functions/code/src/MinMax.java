public class MinMax {
    public static void main(String[] args) {
        System.out.println(min(37,58,68));
    }
    static int max(int a, int b, int c){
        return (Math.max(a, Math.max(b,c)));

//        int max = a;
//        if(b > max){
//            max =b;
//        }
//        if(c > max){
//            max =c;
//        }

//        int max = Integer.MIN_VALUE;
//        if(a > b){
//            if(a > c){
//                max =a;
//            } else{
//                max =c;
//            }
//        } else{
//            if(b > c){
//                max =b;
//            } else{
//                max =c;
//            }
//        }

       // return max;
    }
    static int min(int a, int b, int c){
        return (Math.min(a, Math.min(b,c)));

//        int min = a;
//        if(b < min){
//            min =b;
//        }
//        if(c < min){
//            min =c;
//        }

//        int min = Integer.MAX_VALUE;
//        if(a < b){
//            if(a < c){
//                min =a;
//            } else{
//                min =c;
//            }
//        } else{
//            if(b < c){
//                min =b;
//            } else{
//                min =c;
//            }
//        }

//         return min;
    }
}
