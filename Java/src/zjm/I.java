package zjm;

//import java.awt.*;
//import java.io.*;
//public class I {
//    public static void main(String[] args) {
//        try {
//            File file = new File("p.txt");
//            FileOutputStream out = new FileOutputStream(file);
//            PrintStream ps = new PrintStream(out);
//            ps.print(12345.6789);
//            ps.println("how are you");
//            ps.println(true);
//            ps.close();
//        } catch (IOException e) {
//        }
//    }
//}




//import java.io.*;
//import java.util.*;
//public class I {
//    public static void main(String args[]) {
//        File file = new File("a.txt");
//        Scanner sc = null;
//        double sum=0;
//        int count = 0;
//        try { sc = new Scanner(file);
//            sc.useDelimiter("[^0123456789.]+");
//            while(sc.hasNext()){
//                try{  double price = sc.nextDouble();
//                    count++;
//                    sum = sum+price;
//                    System.out.println(price);
//                }
//                catch(InputMismatchException exp){
//                    String t = sc.next();
//                }
//            }
//            System.out.println("平均价格:"+sum/count);
//        }
//        catch(Exception exp){
//            System.out.println(exp);
//        }
//    }
//}
//




//public class I{
//    public static void main(String[] args) {
//        System.out.println("你好，很高兴学习java");
//        Student zhao = new Student();
//        zhao.speak();
//    }
//}
//
//class Student{
//    void speak(){
//        System.out.println("We are students");
//    }
//}



//public class I{
//    public static void main(String[] args) {
//        double radius;
//        double area;
//        radius = 123.86;
//        area = 3.14*radius*radius;
//        System.out.println(radius);
//    }
//}




//class Circle{
//    double radius;
//    double getArea(){
//        double area = 3.14*radius*radius;
//        return area;
//    }
//}
//
//
//public class I{
//    public static void main(String[] args) {
//        Circle circleOne,circleTwo;
//        circleOne = new Circle();
//        circleTwo = new Circle();
//        circleOne.radius = 123.86;
//        circleTwo.radius = 69;
//        double area = circleOne.getArea();
//        System.out.println("circleOne的面积"+area);
//        area = circleTwo.getArea();
//        System.out.println("circleTwo的面积"+area);
//    }
//}




//class Rect{
//    double width;
//    double height;
//    double getArea(){
//        double area = width*height;
//        return area;
//    }
//}
//
//class Lader{
//    double above;
//    double bottom;
//    double height;
//    double getArea(){
//        double area = (above+bottom)*height/2;
//        return area;
//    }
//}
//
//public class I{
//    public static void main(String[] args) {
//        Rect rect = new Rect();
//        rect.width = 107.87;
//        rect.height = 25.18;
//        double area = rect.getArea();
//        System.out.println("矩形的面积："+area);
//        Lader lader = new Lader();
//        lader.above = 10.798;
//        lader.bottom = 156.65;
//        lader.height = 18.12;
//        area = lader.getArea();
//        System.out.println("梯形的面积："+area);
//    }
//}



