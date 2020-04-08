package ideal;

//public class Fibo {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.print(fibo(i)+" ");
//        }
//    }
//
//    public static int fibo(int n) {
//        if(n == 1){
//            return 1;
//        }
//        if(n == 2){
//            return 1;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
//}


//public class Fibo{
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.print(fiboNonMethon(i)+" ");
//        }
//    }
//
//    public static int fiboNonMethon(int n) {
//        if(n == 1||n == 2){
//            return 1;
//        }
//        else{
//            int last1 = 1;
//            int last2 = 1;
//            int cur = 0;
//            for (int i = 3; i <= n ; i++) {
//                cur = last1+last2;
//                last2 = last1;
//                last1 = cur;
//            }
//            return cur;
//        }
//    }
//}




public class Fibo{
    public static void main(String[] args) {
        int n = 41;
        long start = System.currentTimeMillis();
        System.out.println(fibo(n));
        long end = System.currentTimeMillis();
        System.out.println("递归函数耗时："+(end-start)+"ms");
        System.out.println(fiboNonMethon(n));
    }

    public static long fibo(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static long fiboNonMethon(int n) {
        long start = System.currentTimeMillis();
        if(n == 1||n == 2){
            return 1;
        }
        else{
            long last1 = 1;
            long last2 = 1;
            long cur = 0;
            for (int i = 3; i <= n ; i++) {
                cur = last1+last2;
                last2 = last1;
                last1 = cur;
            }
            long end = System.currentTimeMillis();
            System.out.println("非递归耗时："+(end-start)+"ms");
            return cur;
        }
    }
}



