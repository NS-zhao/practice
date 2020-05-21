package zjm;

//public class A {
//    public static void main(String[] args) {
//        System.out.println("你好，很高兴学习Java");
//        Student zhang = new Student();
//        zhang.speak();
//    }
//}
//class Student{
//    void speak(){
//        System.out.println("We are student");
//    }
//}



//public class A{
//    public static void main(String[] args) {
//        String s = "hello world";
//        System.out.println(s);
//    }
//}



//class MainClass{
//    public static void main(String[] args) {
//        System.out.println("你好，只需编译我");
//        A a = new A();
//        a.fA();
//        B b = new B();
//        b.fB();
//    }
//}

//public class A{
//    void fA(){
//        System.out.println("I am A");
//    }
//}

//class B{
//    void fB(){
//        System.out.println("I am B");
//    }
//}




//class Teacher{
//    double add(int x,int y){
//        return x+y;
//    }
//    double sub(int x,int y){
//        return x-y;
//    }
//}
//
//class Student{
//    void speak(){
//        System.out.println("老师好");
//    }
//}
//
//public class A{
//    public static void main(String[] args) {
//        Teacher zhao = new Teacher();
//        double a = zhao.add(12,236);
//        System.out.println(a);
//        double b = zhao.sub(234,120);
//        System.out.println(b);
//        Student ruan = new Student();
//        ruan.speak();
//    }
//}




//import java.util.Scanner;
//public class A{
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        int amount = 0;
//        float price = 0;
//        float sum = 0;
//        System.out.println("输入产品数量（回车确认）：");
//        amount = reader.nextInt();
//        System.out.println("输入产品单价（回车确认）：");
//        price = reader.nextFloat();
//        sum = price*amount;
//        System.out.printf("数量：%d,单价：%5.2f,总价值：%5.2f",amount,price,sum);
//    }
//}



//import java.util.Scanner;
//public class A{
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        double sum = 0;
//        int m = 0;
//        while(reader.hasNextDouble()){
//            double x = reader.nextDouble();
//            m = m+1;
//            sum = sum+x;
//        }
//        System.out.printf("%d个数的和为%f\n",m,sum);
//        System.out.printf("%d个数的平均值是%f\n",m,sum/m);
//    }
//}



//public class A{
//    public static void main(String[] args) {
//        for (int i = 20302; i <= 20322; i++) {
//            System.out.println((char)i);
//        }
//    }
//}



//public class A{
//    public static void main(String[] args) {
//        int x = 234,y = 432;
//        System.out.println(x+"<"+(2*x));
//        System.out.print("我输出结果后不回车");
//        System.out.println("我输出结果后自动回车到下一行");
//        System.out.println("x+y="+(x+y));
//    }
//}



//public class A{
//    public static void main(String[] args) {
//        for (char c = 'A'; c <= 'Z'; c++) {
//            System.out.print(c+" ");
//
//        }
//    }
//}