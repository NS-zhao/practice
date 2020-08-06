package R;

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
//        return 3.14*r*r;
//    }
//}
//
//class Rectangle extends Geometry{
//    double a;
//    double b;
//    Rectangle(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b;
//    }
//}
//
//public class S {
//    public static void main (String[] args) {
//        Pillar pillar;
//        Geometry bottom;
//        bottom = new Circle(10);
//        pillar = new Pillar(bottom,58);
//        System.out.println("圆形底的柱体的体积："+pillar.getVolume());
//        bottom = new Rectangle(10,20);
//        pillar = new Pillar(bottom,58);
//        System.out.println("矩形底的柱体的体积："+pillar.getVolume());
//    }
//}



//abstract class Geometry{
//    public abstract double getArea();
//}
//
//class Rect extends Geometry{
//    double a;
//    double b;
//    Rect(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b;
//    }
//}
//
//class Circle extends Geometry{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return 3.14*r*r;
//    }
//}
//
//class Student{
//    public double area(Geometry...p){
//        double sum = 0;
//        for (int i = 0; i < p.length; i++) {
//            sum = sum+p[i].getArea();
//        }
//        return sum;
//    }
//}
//
//public class S{
//    public static void main (String[] args) {
//        Student zhao = new Student();
//        double area = zhao.area(new Rect(2,3),new Circle(5.2),new Circle(12));
//        System.out.println("2个圆和一个矩形的面积和:"+area);
//    }
//}



//abstract class Geometry{
//    public abstract double getArea();
//}
//
//class Rect extends Geometry{
//    double a;
//    double b;
//    Rect(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b;
//    }
//}
//
//class Circle extends Geometry{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return 3.14*r*r;
//    }
//}
//
//class Triangle extends Geometry{
//    double a;
//    double b;
//    double c;
//    Triangle(double a,double b,double c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//    public double getArea(){
//        double p = (a+b+c)/2;
//        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        return area;
//    }
//}
//
//class Student{
//    public double area(Geometry...p){
//        double sum = 0;
//        for (int i = 0; i < p.length; i++) {
//            sum = sum+p[i].getArea();
//        }
//        return sum;
//    }
//}
//
//public class S{
//    public static void main (String[] args) {
//        Student zhao = new Student();
//        double area = zhao.area(new Rect(2,3),new Circle(5.2),new Triangle(3,4,5));
//        System.out.println("1个圆和1个矩形和1个三角形的面积和:"+area);
//    }
//}