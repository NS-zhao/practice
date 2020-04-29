package ideal;

//class Circle{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return(3.14*r*r);
//    }
//}

//class Pillar{
//    Circle bottom;
//    double height;
//    Pillar(Circle bottom,double height){
//        this.bottom = bottom;
//        this.height = height;
//    }
//    public double getVolume(){
//        return bottom.getArea()*height;
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
//public class O {
//    public static void main(String[] args) {
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




//abstract class Geometry{
//    public abstract double getArea();
//    }
//
//class Rect extends Geometry{
//    double a;
//    double b;
//    Rect(double a,double b){
//       this.a = a;
//       this.b = b;
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
//public class O{
//    public static void main(String[] args) {
//        Student zhang = new Student();
//        double area = zhang.area(new Rect(2,3),new Circle(5.2),new Circle(12));
//        System.out.printf("两个圆和一个矩形图形的面积和：\n%10.3f",area);
//    }
//}