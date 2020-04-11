package ideal;

//public class Vary {
//    public static void main(String[] args) {
//        byte a = 12;
//        int b = 129;
//        float c = 123456.6789f;
//        double d = 123456789.123456789;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        a = (byte)b;
//        c = (float)d;
//        System.out.println(a);
//        System.out.println(c);
//    }
//}



//import java.util.Scanner;
//public class Vary{
//    int age;
//    float weight;
//    void speak(){
//        System.out.println("我的年龄"+age+"岁");
//        System.out.println("我的体重"+weight+"公斤");
//    }
//    public static void main(String[] args) {
//        Vary zhangsan = new Vary();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入年龄，回车确认");
//        zhangsan.age = sc.nextInt();
//        System.out.println("输入体重，回车确认");
//        zhangsan.weight = sc.nextFloat();
//        zhangsan.speak();
//    }
//}



import java.util.Scanner;
public class Vary{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int amount = 0;
        float price = 0,sum = 0;

        System.out.println("输入产品数量：");
        amount = reader.nextInt();

        System.out.println("输入产品单价：");
        price = reader.nextFloat();
        sum = amount*price;
        System.out.printf("数量：%d,单价：%5.2f,总价值：%5.2f",amount,price,5sum);
    }
}