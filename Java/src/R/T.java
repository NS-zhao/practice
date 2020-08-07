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
//public class T {
//    public static void main (String[] args) {
//        A a = new A();
//        System.out.println("面积："+a.getArea(100));
//        a.speak();
//    }
//}



//class A{
//    double f(int x,int y){
//        return x+y;
//    }
//}
//
//class B extends A{
//    double f(double x,double y){
//        return x*y;
//    }
//}
//
//public class T{
//    public static void main (String[] args) {
//        B b = new B();
//        System.out.println(b.f(3,5));
//        System.out.println(b.f(3.0,5.0));
//    }
//}



//interface Computable{
//    int Max = 100;
//    int f(int x);
//}
//
//class China implements Computable{
//    int number;
//    public int f(int x){
//        int sum = 0;
//        for (int i = 1; i <= x; i++) {
//            sum = sum+i;
//        }
//        return sum;
//    }
//}
//
//class Japan implements Computable{
//    int number;
//    public int f(int x){
//        return 46+x;
//    }
//}
//
//public class T{
//    public static void main (String[] args) {
//        China zhao = new China();
//        Japan ruan = new Japan();
//        zhao.number = 28+Computable.Max;
//        ruan.number = 14+Computable.Max;
//        System.out.println("zhao的学号："+zhao.number+",zhao求和结果："+zhao.f(100));
//        System.out.println("ruan的学号："+ruan.number+",ruan求和结果："+ruan.f(100));
//    }
//}



//interface Computable{
//    final int MAX = 100;
//    void speak(String s);
//    int f(int x);
//    float g(float x,float y);
//}
//
//abstract class A implements Computable{
//    public int f(int x){
//        int sum = 0;
//        for (int i = 1; i <= x; i++) {
//            sum = sum+i;
//        }
//        return sum;
//    }
//}



//interface ShowMessage{
//    void 显示商标(String s);
//}
//
//class TV implements ShowMessage{
//    public void 显示商标(String s){
//        System.out.println(s);
//    }
//}
//
//class PC implements ShowMessage{
//    public void 显示商标(String s){
//        System.out.println(s);
//    }
//}
//
//public class T{
//    public static void main (String[] args) {
//        ShowMessage sm = new TV();
//        sm.显示商标("长城牌电视机");
//        sm = new PC();
//        sm.显示商标("联想奔月5008PC机");
//    }
//}