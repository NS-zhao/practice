package R;

//this是java的一个关键字，表示某个对象，this可以出现在实例方法和构造方法中，但不可以出现在类方法中

//构造方法中使用this

//class People{
//    int leg,hand;
//    String name;
//    People(String s){
//        name = s;
//        this.init();
//    }
//    void init(){
//        leg = 2;
//        hand = 2;
//        System.out.println(name+"有"+hand+"只手"+leg+"条腿");
//    }
//}
//public class N {
//    public static void main (String[] args) {
//        People boshi = new People("布什");
//    }
//}



//实例方法中使用this
//class A{
//    int x;
//    static int y;
//    void f(){
//        this.x = 100;
//        A.y = 200;
//    }
//}



//class B{
//    void f(){
//        this.g();
//        B.h();
//    }
//    void g(){
//        System.out.println("ok");
//    }
//    static void h(){
//        System.out.println("hello");
//    }
//}



//class Student{
//    int number;
//    Student(int n){
//        number = n;
//    }
//    void speak(){
//        System.out.println("Student类的包名是。。。，我的学号："+number);
//    }
//}
//
//public class N{
//    public static void main (String[] args) {
//        Student stu = new Student(10201);
//        stu.speak();
//        System.out.println("主类的包名也是。。。");
//    }
//}




//import java.util.Date;
//public class N{
//    public static void main (String[] args) {
//        Date date = new Date();
//        System.out.println("本机机器的时间：");
//        System.out.println(date);
//    }
//}



//class Triangle{
//    double sideA,sideB,sideC;
//    boolean isTriangle;
//    public Triangle(double a,double b,double c){
//        sideA = a;
//        sideB = b;
//        sideC = c;
//        if(a+b>c&&a+c>b&&b+c>a){
//            isTriangle = true;
//        }
//        else{
//            isTriangle = false;
//        }
//    }
//    public void 计算面积(){
//        if(isTriangle){
//            double p = (sideA+sideB+sideC)/2.0;
//            double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
//            System.out.println("是一个三角形，面积是："+area);
//        }
//        else{
//            System.out.println("不是一个三角形，不能计算面积");
//        }
//    }
//    public void 修改三边(double a,double b,double c){
//        sideA = a;
//        sideB = b;
//        sideC = c;
//        if(a+b>c&&a+c>b&&b+c>a){
//            isTriangle = true;
//        }
//        else{
//            isTriangle = false;
//        }
//    }
//}
//
//public class N{
//    public static void main (String[] args) {
//        Triangle triangle = new Triangle(6,7,10);
//        triangle.计算面积();
//        triangle.修改三边(3,4,5);
//        triangle.计算面积();
//    }
//}