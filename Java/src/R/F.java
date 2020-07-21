package R;

//import java.util.Scanner;
//import java.util.Random;
//public class F {
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("给你一个1至100之间的整数，请猜测这个数");
//        int realNumber = random.nextInt(100)+1;
//        int yourGuess = 0;
//        System.out.print("输入您的猜测：");
//        yourGuess = reader.nextInt();
//        while(yourGuess!=realNumber){
//            if(yourGuess>realNumber){
//                System.out.println("猜大了，再输入你的猜测：");
//                yourGuess = reader.nextInt();
//            }
//            else if(yourGuess<realNumber){
//                System.out.println("猜小了，再输入你的猜测：");
//                yourGuess = reader.nextInt();
//            }
//        }
//        System.out.println("猜对了！");
//    }
//}




//public class F{
//    public static void main (String[] args) {
//        int x = 10;
//        int y = 5;
//        int z = 100;
//        int result = 0;
//        if(x>y)
//            x = z;
//        else
//            y = x;
//        z = y;
//        result = x+y+z;
//        System.out.println(result);
//    }
//}




//public class F{
//    public static void main (String[] args) {
//        char c = '\0';
//        for (int i = 1; i <= 4; i++) {
//            switch(i){
//                case 1:
//                    c = '新';
//                    System.out.print(c);
//                case 2:
//                    c = '亲';
//                    System.out.print(c);
//                    break;
//                case 3:
//                    c = '斤';
//                    System.out.print(c);
//                default:
//                    System.out.print("!");
//            }
//        }
//    }
//}



//import java.util.Scanner;
//
//class JudgeAward{
//    void giveMess(int number){
//        if(number == 9&&number == 131&&number == 12) {
//            System.out.println(number + "是三等奖");
//        }
//        else if(number == 209&&number == 596&&number == 27) {
//            System.out.println(number + "是二等奖");
//        }
//        else if(number == 875&&number == 316&&number == 59) {
//            System.out.println(number + "是一等奖");
//        }
//        else{
//            System.out.println("未中奖");
//        }
//    }
//}
//
//public class F{
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("输入正整数回车确认");
//        int number = reader.nextInt();
//        JudgeAward judge = new JudgeAward();
//        judge.giveMess(number);
//    }
//}



