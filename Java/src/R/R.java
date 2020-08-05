package R;

//class A{
//    final double PI = 3.1415926;
//    public double getArea(final double r){
//        return PI*r*r;
//    }
//    public final void speak(){
//        System.out.println("您好，How's everything here?");
//    }
//}
//
//public class R {
//    public static void main (String[] args) {
//        A a = new A();
//        System.out.println("面积："+a.getArea(100));
//        a.speak();
//    }
//}



//class 类人猿{
//    public void crySpeak(String s){
//        System.out.println(s);
//    }
//}
//
//class People extends 类人猿{
//    public void compter(int a,int b){
//        System.out.println(a*b);
//    }
//    public void crySpeak(String s){
//        System.out.println("***"+s+"***");
//    }
//}
//
//public class R{
//    public static void main (String[] args) {
//        类人猿 monkey = new People();
//        monkey.crySpeak("I love this game");
//        People people = (People)monkey;
//        people.compter(10,10);
//    }
//}



//class 动物{
//    void cry(){
//
//    }
//}
//
//class 狗 extends 动物{
//    void cry () {
//        System.out.println("汪汪......");
//    }
//}
//
//class 猫 extends 动物{
//    void cry(){
//        System.out.println("喵喵.......");
//    }
//}
//
//public class R{
//    public static void main (String[] args) {
//        动物 animals;
//        animals = new 狗();
//        animals.cry();
//        animals = new 猫();
//        animals.cry();
//    }
//}



//abstract class A{
//    abstract int sum(int x,int y);
//    int sub(int x,int y){
//        return x-y;
//    }
//}
//
//class B extends A{
//    int sum(int x,int y){
//        return x+y;
//    }
//}
//
//public class R{
//    public static void main (String[] args) {
//        B b = new B();
//        int sum = b.sum(30,20);
//        int sub = b.sub(30,20);
//        System.out.println("sum = "+sum);
//        System.out.println("sub = "+sub);
//    }
//}




//abstract class Geometry{
//    public abstract double getArea();
//}
//
//class Pillar{
//    Geometry bottom;
//    double height;
//    Pillar(Geometry bottom,double height){
//        this.bottom = bottom;
//        this.height = height;
//    }
//    public double getVolume(){
//        return bottom.getArea()*height;
//    }
//}
//
//class Circle extends Geometry{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return(3.14*r*r);
//    }
//}
//
//class Rectangle extends Geometry{
//    double a,b;
//    Rectangle(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b;
//    }
//}
//
//public class R{
//    public static void main (String[] args) {
//        Pillar pillar;
//        Geometry bottom;
//        bottom = new Rectangle(12,22);
//        pillar = new Pillar(bottom,58);
//        System.out.println("矩形底的柱体的体积"+pillar.getVolume());
//        bottom = new Circle(10);
//        pillar = new Pillar(bottom,58);
//        System.out.println("圆形底的柱体的体积"+pillar.getVolume());
//    }
//}