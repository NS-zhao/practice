package R;

//import java.util.Scanner;
//
//public class G {
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        double account = 0;
//        double price = 0;
//        System.out.print("输入电量：");
//        account = reader.nextDouble();
//        if(account>=1&&account<=90){
//            price = 0.6*account;
//        }
//        else if(account>=91&&account<=150){
//            price = 0.6*90+(account-90)*1.1;
//        }
//        else if(account>151){
//            price = 0.6*90+(150-90)*1.1+(account-150)*1.7;
//        }
//        else {
//            System.out.println("请重新输入电费");
//        }
//        System.out.println("电费为："+price);
//    }
//
//}




//public class G{
//    public static void main (String[] args) {
//        for (char a = 'a'; a <= 'z'; a++) {
//            System.out.print(a+" ");
//        }
//        System.out.println();
//        for (char c = 'A'; c <= 'Z'; c++) {
//            System.out.print(c+" ");
//        }
//    }
//}



//public class G{
//    public static void main (String[] args) {
//        int sum = 0,i,j;
//        for (i = 1; i <= 1000; i++) {
//            for (j = 1,sum = 0; j < i; j++) {
//                if (i % j == 0) {
//                    sum = sum + j;
//                }
//            }
//            if (sum == i) {
//                System.out.println("完数：" + i);
//            }
//        }
//    }
//}




//public class G{
//    public static void main (String[] args) {
//        double sum = 0;
//        int n = 0,max = 9876;
//        while(true){
//            int jiecheng = 1;
//            for (int i = 1; i <= n; i++) {
//                jiecheng = jiecheng*i;
//            }
//            sum = sum+jiecheng;
//            if(sum>9876){
//                break;
//            }
//            n++;
//        }
//        System.out.println(n-1);
//    }
//}



//public class G{
//    public static void main (String[] args) {
//        int sum = 0,n = 0,jiecheng = 0;
//        while(true){
//            jiecheng = 1;
//            for (int i = 1; i <= n; i++) {
//                jiecheng = jiecheng*i;
//            }
//            sum = sum+jiecheng;
//            if(sum>9876){
//                break;
//            }
//            n++;
//        }
//        System.out.println("最大整数为："+(n-1));
//    }
//}