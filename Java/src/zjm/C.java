package zjm;

import java.sql.SQLOutput;

//class Village{
//    static int treeAmount;
//    int peopleNumber;
//    String name;
//    Village(String s){
//        name = s;
//    }
//    void treePlanting(int n){
//        treeAmount = treeAmount+n;
//        System.out.println(name+"植树"+n+"棵");
//    }
//    void fellTree(int n){
//        if(treeAmount-n>=0){
//            treeAmount = treeAmount-n;
//            System.out.println(name+"伐树"+n+"棵");
//        }
//        else {
//            System.out.println("无树木可伐");
//        }
//    }
//    static int lookTreeAmount(){
//        return treeAmount;
//    }
//    void addPeopleNumber(int n){
//        peopleNumber = peopleNumber+n;
//        System.out.println(name+"增加了"+n+"人");
//    }
//}


//public class C {
//    public static void main(String[] args) {
//        Village zhaoZhuang,maJiaHeZhi;
//        zhaoZhuang = new Village("赵庄");
//        maJiaHeZhi = new Village("马家河子");
//        zhaoZhuang.peopleNumber = 100;
//        maJiaHeZhi.peopleNumber = 150;
//        Village.treeAmount = 200;
//        int leftTree = Village.treeAmount;
//        System.out.println("森林中有 "+leftTree+" 棵树");
//        zhaoZhuang.treePlanting(50);
//        leftTree = maJiaHeZhi.lookTreeAmount();
//        System.out.println("森林中有 "+leftTree+" 棵树");
//        maJiaHeZhi.fellTree(70);
//        leftTree = Village.lookTreeAmount();
//        System.out.println("森林中有 "+leftTree+"棵树");
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        zhaoZhuang.addPeopleNumber(12);
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//        maJiaHeZhi.addPeopleNumber(10);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//    }
//}





//abstract class Geometry{
//    public abstract double getArea();
//}
//class Rect extends Geometry{
//    double a,b;
//    Rect(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b;
//    }
//}
//class Circle extends Geometry{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return 3.14*r*r;
//    }
//}
//class Student{
//    public double area(Geometry...p){
//        double sum = 0;
//        for (int i = 0; i < p.length; i++) {
//            sum = sum+p[i].getArea();
//        }
//        return sum;
//    }
//}
//public class C{
//    public static void main(String[] args) {
//        Student zhang = new Student();
//        double area = zhang.area(new Rect(2,3),new Circle(5.2),new Circle(12));
//        System.out.printf("2个圆和1个矩形图形的面积和：\n%10.3f",area);
//    }
//}



//abstract class Geometry{
//    public abstract double getArea();
//}
//class Triangle extends Geometry{
//    double a,h;
//    Triangle(double a,double h){
//        this.a = a;
//        this.h = h;
//    }
//    public double getArea(){
//        return (a*h)/2;
//    }
//}
//class Circle extends Geometry{
//    double r;
//    Circle(double r){
//        this.r = r;
//    }
//    public double getArea(){
//        return 3.14*r*r;
//    }
//}
//class Student{
//    public double area(Geometry...p){
//        double sum = 0;
//        for (int i = 0; i < p.length; i++) {
//            sum = sum+p[i].getArea();
//        }
//        return sum;
//    }
//}
//public class C{
//    public static void main(String[] args) {
//        Student zhang = new Student();
//        double area = zhang.area(new Triangle(2,3),new Circle(5.2),new Circle(12));
//        System.out.printf("2个圆和1个三角形的面积和：\n%10.3f",area);
//    }
//}
