package ideal;


//class Student {
//    int number;
//    Student(int n){
//        number = n;
//    }
//
//    void speak(){
//        System.out.println("Student类的包名是ideal，我的学号："+number);
//    }
//}
//
//public class L{
//    public static void main(String[] args) {
//        Student stu = new Student(10201);
//        stu.speak();;
//        System.out.println("主类的包名也是ideal");
//    }
//}





//import java.util.Date;
//public class L{
//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println("本地机器的时间：");
//        System.out.println(date);
//    }
//}




//class Triangle {
//    double sideA;
//    double sideB;
//    double sideC;
//    boolean isTriange;
//
//    public Triangle(double a, double b, double c) {
//        sideA = a;
//        sideB = b;
//        sideC = c;
//        if (a + b > c && a + c > b && c + b > a) {
//            isTriange = true;
//        } else {
//            isTriange = false;
//        }
//    }
//    public void 计算面积(){
//        if(isTriange){
//            double p = (sideA+sideB+sideC)/2.0;
//            double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
//            System.out.println("是一个三角形，面积是："+area);
//        }
//        else{
//            System.out.println("不是一个三角形，不能计算面积");
//        }
//    }
//
//    public void 修改三边(double a,double b,double c){
//        sideA = a;
//        sideB = b;
//        sideC = c;
//        if(a+b>c&&a+c>b&&c+b>a){
//            isTriange = true;
//        }
//        else{
//            isTriange = false;
//        }
//    }
//
//}
//
//
//public class L {
//    public static void main(String[] args) {
//        Triangle tri = new Triangle(6, 7, 10);
//        tri.计算面积();
//        tri.修改三边(3, 4, 5);
//        tri.计算面积();
//    }
//}




//class Student{
//    private int age;
//    public void setAge(int age){
//        if(age>=7&&age<=28){
//            this.age = age;
//        }
//    }
//
//    public int getAge(){
//        return age;
//    }
//}
//
//public class L{
//    public static void main(String[] args) {
//        Student zhang = new Student();
//        Student geng = new Student();
//        zhang.setAge(23);
//        System.out.println("zhang的年龄："+zhang.getAge());
//        geng.setAge(25);
//        System.out.println("geng的年龄："+geng.getAge());
//
//    }
//}


