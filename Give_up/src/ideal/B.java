package ideal;

//import java.util.Scanner;
//public class B {
//    void sort(int a,int b,int c){
//        int tmp = 0;
//        int count = 0;
//        if(b<a){
//            tmp = a;
//            a = b;
//            b = tmp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果:"+a+","+b+","+c);
//        }
//        if(c<a){
//            tmp = a;
//            a = c;
//            c = tmp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果:"+a+","+b+","+c);
//        }
//        if(c<b){
//            tmp = b;
//            b = c;
//            c = tmp;
//            count++;
//            System.out.println("排序的第"+count+"次操作结果:"+a+","+b+","+c);
//        }
//        if(count == 0){
//            System.out.println("排序的第"+count+"次操作结果:"+a+","+b+","+c);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入三个整数，每输入一个需要回车确认");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        B b = new B();
//        b.sort(x,y,z);
//    }



//import java.util.Scanner;
//
//public class B{
//    void giveGuess(int number){
//        switch(number){
//            case 9:
//            case 131:
//            case 12:
//                System.out.println(number+"是三等奖");
//                break;
//            case 29:
//            case 406:
//            case 121:
//                System.out.println(number+"是二等奖");
//                break;
//            case 1875:
//            case 386:
//            case 96:
//                System.out.println(number+"是一等奖");
//                break;
//            default:
//                System.out.println("很遗憾，您未能中奖");
//                break;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个正整数");
//        int number = sc.nextInt();
//        B b = new B();
//        b.giveGuess(number);
//    }
//}




//public class B{
//    void giveSum(int number,int length){
//        if(number<=9&&number>=1){
//            long sum = 0, a = number,item = a, n = length,i = 1;
//            for(i = 1;i<=n;i++){
//                sum = sum + item;
//                item = item*10+a;
//            }
//            System.out.println(sum);
//        }
//        else{
//            System.out.println("请输入正确数字");
//        }
//    }
//
//    public static void main(String[] args) {
//        B b = new B();
//        b.giveSum(2,5);
//    }
//}