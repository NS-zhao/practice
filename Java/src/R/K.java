package R;

//class Circle{
//    double radius,area;
//    Circle(){
//
//    }
//    Circle(double r){
//        radius = r;
//    }
//    void setRadius(double r){
//        if(r>0){
//            radius = r;
//        }
//    }
//    double getRadius(){
//        return radius;
//    }
//    double getArea(){
//        area = 3.14*radius*radius;
//        return area;
//    }
//}

//public class K {
//    public static void main (String[] args) {
//        Circle circle = new Circle();
//        double w = 121.709;
//        circle.setRadius(w);
//        System.out.println("圆的半径："+circle.getRadius());
//        System.out.println("圆的面积："+circle.getArea());
//        System.out.println("更改向方法参数r传递值的w的值为100");
//        w = 100;
//        System.out.println("w = "+w);
//        System.out.println("圆的半径："+circle.getRadius());
//    }
//}



//class Circle{
//    double radius,area;
//    Circle(){
//
//    }
//    Circle(double r){
//        radius = r;
//    }
//    void setRadius(double r){
//        if(r>0){
//            radius = r;
//        }
//    }
//    double getRadius(){
//        return radius;
//    }
//    double getArea(){
//        area = 3.14*radius*radius;
//        return area;
//    }
//}
//
//class Circular{
//    Circle bottom;
//    double height;
//    Circular(Circle c,double h){
//        bottom = c;
//        height = h;
//    }
//    void setBottomRadius(double r){
//        bottom.setRadius(r);
//    }
//    double getBottomRadius(){
//        return bottom.getRadius();
//    }
//    double getVolme(){
//        return bottom.getArea()*height/3.0;
//    }
//}
//
//public class K{
//    public static void main (String[] args) {
//        Circle circle = new Circle(10);
//        System.out.println("main方法中circle的引用："+circle);
//        System.out.println("main方法中circle的半径："+circle.getRadius());
//        Circular circular = new Circular(circle,20);
//        System.out.println("circular圆锥的bottom的引用："+circular.bottom);
//        System.out.println("圆锥的bottom半径："+circular.getBottomRadius());
//        System.out.println("圆锥的体积："+circular.getVolme());
//        double r = 8888;
//        System.out.println("圆锥更改底圆bottom的半径："+circular.getBottomRadius());
//        circular.setBottomRadius(r);
//        System.out.println("圆锥的bottom半径："+circular.getBottomRadius());
//        System.out.println("圆锥的体积："+circular.getVolme());
//        System.out.println("main方法中circle的半径："+circle.getRadius());
//        System.out.println("main方法中circle的引用将发生变化");
//        circle = new Circle(1000);
//        System.out.println("现在main方法中circle的引用："+circle);
//        System.out.println("main方法中circle的半径："+circle.getRadius());
//        System.out.println("但是不影响circular圆锥的bottom的引用");
//        System.out.println("circular圆锥的bottom的引用："+circular.bottom);
//        System.out.println("圆锥的bottom半径："+circular.getBottomRadius());
//    }
//}