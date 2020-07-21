package R;

//class Sum{
//    void giveSum(int number,int length) {
//        if (number <= 9 && number >= 1) {
//            long sum = 0;
//            long item = number;
//            for (int i = 1; i <= length; i++) {
//                sum = sum + item;
//                item = item * 10 + number;
//            }
//            System.out.println(sum);
//        }
//        else {
//            System.out.println("请给出正确的数字");
//        }
//    }
//}
//
//public class E {
//    public static void main (String[] args) {
//        Sum sum = new Sum();
//        sum.giveSum(2,5);
//    }
//}



//public class E {
//    public static void main (String[] args) {
//        int i = 1;
//        double sum = 0;
//        while (i <= 20) {
//            sum = sum + (1.0/i);
//            i++;
//        }
//        System.out.println(sum);
//    }
//}



//public class E{
//    public static void main (String[] args) {
//        double sum = 0;
//        double item = 1;
//        int i = 1;
//        while(i<=20){
//            sum = sum+item;
//            i++;
//            item = item*(1.0/i);
//
//        }
//        System.out.println(sum);
//    }
//}



//public class E{
//    public static void main (String[] args) {
//        for (char c = 'A'; c <= 'Z'; c++) {
//            switch(c){
//                case 'B':
//                case 'F':
//                case 'M':
//                case 'Q':
//                case 'T':
//                case 'W':continue;
//            }
//            System.out.print(c+" ");
//        }
//        System.out.println(" ");
//        int sum = 0;
//        int max = 1931;
//        int i = 1;
//        int n = 0;
//       while(true){
//           sum = sum+i;
//           if(sum>=max){
//               n = i-1;
//               break;
//           }
//           i++;
//       }
//        System.out.println("最大整数n为："+n);
//    }
//}



//public class E{
//    public static void main (String[] args) {
//        int a[] = {1,2,3,4};
//        int b[] = {100,200,300};
//        System.out.println("数组a的元素个数："+a.length);
//        System.out.println("数组b的元素个数："+b.length);
//        System.out.println("数组a的引用 = "+a);
//        System.out.println("数组b的引用 = "+b);
//        a = b;
//        System.out.println("数组a的元素个数："+a.length);
//        System.out.println("数组b的元素个数："+b.length);
//        System.out.println("a == b的结果是"+(a == b));
//        System.out.println("a[0] = "+a[0]+",a[1] = "+a[1]+",a[2] = "+a[2]);
//        System.out.println("b[0] = "+b[0]+",b[1] = "+b[1]+",b[2] = "+b[2]);
//    }
//}



//import java.util.Arrays;
//
//public class E{
//    public static void main (String[] args) {
//        char a[] = {'a','b','c','d'};
//        for (int n = 0; n < a.length; n++) {
//            System.out.print(a[n]+" ");
//        }
//        System.out.println();
//        for (char ch:a) {
//            System.out.print(ch+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(a));
//    }
//}