package ideal;

//public class ComputerCircleArea {
//    public static void main(String[] args) {
//        double radius;
//        double area;
//        radius = 123.86;
//        area = 3.14*radius*radius;
//        System.out.println(area);
//    }
//}


//public class Circle{
//    double radius;
//    double getArea(){
//        double area = 3.14*radius*radius;
//        return area;
//    }
//    public static void main(String[] args) {
//        Circle circleOne,circleTwo;
//        circleOne = new Circle();
//        circleTwo = new Circle();
//        circleOne.radius = 90;
//        circleTwo.radius = 120;
//        double area = circleOne.getArea();
//        System.out.println("circleOne的面积："+area);
//        area = circleTwo.getArea();
//        System.out.println("circleTwo的面积："+area);
//    }
//}


//public class Rect{
//    double width;
//    double height;
//    double getArea(){
//        return width*height;
//    }
//    public static void main(String[] args) {
//        Rect ractangle = new Rect();
//        ractangle.width = 109.87;
//        ractangle.height = 25.18;
//        double area = ractangle.getArea();
//        System.out.println("矩形的面积："+area);
//    }
//}




public class Lader{
    double above;
    double bottom;
    double height;
    double getArea(){
        return (above+bottom)*height/2;
    }

    public static void main(String[] args) {
        Lader lader = new Lader();
        lader.above = 10.798;
        lader.bottom = 156.65;
        lader.height = 18.12;
        double area = lader.getArea();
        System.out.println("梯形的面积："+area);
    }
}