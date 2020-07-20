package R;

//import java.util.Scanner;
//
//class Number{
//    void sort(int a,int b,int c){
//        int count = 0;
//        int temp = 0;
//        if(b<a){
//            temp = a;
//            a = b;
//            b = temp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果："+a+","+b+","+c);
//        }
//        if(c<a){
//            temp = a;
//            a = c;
//            c = temp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果："+a+","+b+","+c);
//        }
//        if(c<b){
//            temp = b;
//            b = c;
//            c = temp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果："+a+","+b+","+c);
//        }
//    }
//}
//
//public class D {
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("输入三个整数，每输入一个需回车确认");
//        int x = reader.nextInt();
//        int y = reader.nextInt();
//        int z = reader.nextInt();
//        Number number = new Number();
//        number.sort(x,y,z);
//    }
//}



//import java.util.Scanner;
//
//class JudgeAward{
//    void giveMess(int number){
//        switch(number){
//            case 9:
//            case 131:
//            case 12:
//                System.out.println(number+"是三等奖");
//                break;
//            case 209:
//            case 596:
//            case 27:
//                System.out.println(number+"是二等奖");
//                break;
//            case 875:
//            case 316:
//            case 59:
//                System.out.println(number+"是一等奖");
//                break;
//            default:
//                System.out.println("未中奖");
//        }
//    }
//}
//
//public class D{
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("输入正整数回车确认");
//        int number = reader.nextInt();
//        JudgeAward judge = new JudgeAward();
//        judge.giveMess(number);
//    }
//}




//class ComputerSum{
//    void giveSum(int number,int length){
//        long sum = 0;
//        long a = number;
//        long item = a;
//        long n = length;
//        if(number<=9&&number>=1) {
//            for (int i = 1; i <= n; i++) {
//                sum = sum + item;
//                item = item * 10 + a;
//            }
//            System.out.println(sum);
//        }
//        else{
//            System.out.println("请给出正确的数字");
//        }
//    }
//
//}
//
//public class D{
//    public static void main (String[] args) {
//        ComputerSum computerSum = new ComputerSum();
//        computerSum.giveSum(2,5);
//    }
//}



//class ComputerSum{
//    void giveSum(int number,int length){
//        long sum = 0;
//        if(number<=9&&number>=1) {
//            for (int i = 1; i <= length; i++) {
//                sum = sum + number;
//                number = number * 10 + number;
//            }
//            System.out.println(sum);
//        }
//        else{
//            System.out.println("请给出正确的数字");
//        }
//    }
//
//}
//
//public class D{
//    public static void main (String[] args) {
//        ComputerSum computerSum = new ComputerSum();
//        computerSum.giveSum(2,5);
//    }
//}