package R;

//public class B {
//    public static void main (String[] args) {
//        char chinaWord = '好',japanWord = 's';
//        int position = 20320;
//        System.out.println("汉字："+chinaWord+"的位置："+(int)chinaWord);
//        System.out.println("日文："+japanWord+"的位置："+(int)japanWord);
//        System.out.println(position+"位置上的字符是："+(char)position);
//        position = 21319;
//        System.out.println(position+"位置上的字符是："+(char)position);
//    }
//}



//class People{
//    int age;
//    float weight;
//    void speak(){
//        System.out.println("我的年龄："+age+"岁");
//        System.out.println("我的体重："+weight+"公斤");
//    }
//}
//
//public class B{
//    public static void main (String[] args) {
//        People zhao = new People();
//        zhao.age = 19;
//        zhao.weight = 50f;
//        zhao.speak();
//        People ruan = new People();
//        ruan.age = 20;
//        ruan.weight = 250.5f;
//        ruan.speak();
//    }
//}



//public class B{
//    public static void main (String[] args) {
//        byte b = 22;
//        int n = 129;
//        float f = 123456.6789f;
//        double d = 123456789.123456789;
//        System.out.println("b =   "+b);
//        System.out.println("n =   "+n);
//        System.out.println("f =   "+f);
//        System.out.println("d =   "+d);
//        b = (byte)n;
//        f = (float)d;
//        System.out.println("b =   "+b);
//        System.out.println("f =   "+f);
//    }
//}



//import java.util.Scanner;
//class People{
//    int age;
//    float weight;
//    void speak(){
//        System.out.println("我的年龄："+age+"岁");
//        System.out.println("我的体重："+weight+"公斤");
//    }
//}
//
//public class B{
//    public static void main (String[] args) {
//        People zhaojiamin = new People();
//        Scanner reader = new Scanner(System.in);
//        System.out.println("输入年龄，回车");
//        zhaojiamin.age = reader.nextInt();
//        System.out.println("输入体重，回车");
//        zhaojiamin.weight = reader.nextFloat();
//        zhaojiamin.speak();
//    }
//}




//import java.util.Scanner;
//public class B{
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        int amount = 0;
//        float price = 0,sum = 0;
//        System.out.println("输入产品数量（回车确认）：");
//        amount = reader.nextInt();
//        System.out.println("输入产品单价（回车确认）：");
//        price = reader.nextFloat();
//        sum = amount*price;
//        System.out.println("数量："+amount+",单价："+price+",总价值："+sum);
//        System.out.printf("数量：%d,单价：%1.1f,总价值：%1.1f",amount,price,sum);
//    }
//}