package zjm;

//import java.util.Scanner;
//import java.util.Random;
//
//public class B {
//    public static void main(String[] args) {
//       Scanner reader = new Scanner(System.in);
//       Random randow = new Random();
//        System.out.println("给你一个1至100之间的整数，请猜测这个数");
//        int realNumber = randow.nextInt(100)+1;
//        int yourGuess = 0;
//        System.out.print("输入您的猜测：");
//        yourGuess = reader.nextInt();
//        while(yourGuess!=realNumber){
//            if(yourGuess>realNumber){
//                System.out.print("猜大了，再输入你的猜测：");
//                yourGuess = reader.nextInt();
//            }
//            else if(yourGuess<realNumber){
//                System.out.print("猜小了，再输入你的猜测：");
//                yourGuess = reader.nextInt();
//            }
//        }
//        System.out.println("猜对了");
//    }
//}





//import java.util.Scanner;
//
//class JudgeAward{
//    void giveMess(int number){
//        if(number == 9||number == 131||number == 12){
//            System.out.println(number+"是三等奖");
//        }
//        else if(number == 209||number == 596||number == 27){
//            System.out.println(number+"是二等奖");
//        }
//        else if(number == 875||number == 316||number == 59){
//            System.out.println(number+"是一等奖");
//        }
//        else {
//            System.out.println("未中奖");
//        }
//    }
//}
//
//public class B{
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("输入正整数回车确认:");
//        int number = reader.nextInt();
//        JudgeAward judge = new JudgeAward();
//        judge.giveMess(number);
//    }
//}




//import java.util.Scanner;
//public class B{
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        double amount = 0;
//        double price = 0;
//        System.out.print("请输入用电量：");
//        amount = reader.nextDouble();
//        if(amount<=90&&amount>=1){
//            price = amount*0.6;
//        }
//        else if(amount<=150&&amount>=91){
//            price = 90*0.6+(amount-90)*1.1;
//        }
//        else if(amount>151){
//            price = 90*0.6+(150-90)*1.1+(amount-150)*1.7;
//        }
//        else{
//            System.out.println("输入的电量"+amount+"不合理");
//        }
//        System.out.printf("电费：%5.2f",price);
//    }
//}




//public class B{
//    public static void main(String[] args) {
//        for (char c = 'a'; c <= 'z'; c++) {
//            System.out.print(c+" ");
//        }
//        System.out.println();
//        for (char c = 'A'; c <= 'Z'; c++) {
//            System.out.print(c+" ");
//        }
//    }
//}



//public class B{
//    public static void main(String[] args) {
//        int sum = 0,i,j;
//        for (i = 1; i <= 1000; i++) {
//            for (j = 1,sum = 0; j < i; j++) {
//                if(i%j == 0)
//                    sum = sum+j;
//            }
//            if(sum == i)
//                System.out.println("完数："+i);
//        }
//    }
//}




//public class B{
//    public static void main(String[] args) {
//        int n = 1;
//        int i = 1;
//        int jiecheng = 1;
//        double sum = 0;
//        while(true){
//            jiecheng = 1;
//            for(i = 1;i <= n;i++){
//                jiecheng=jiecheng*i;
//            }
//            sum = sum+jiecheng;
//            if(sum>9876)
//                break;
//            n++;
//        }
//        System.out.println("满足条件的最大整数："+(n-1));
//    }
//}



