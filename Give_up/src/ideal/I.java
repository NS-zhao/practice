package ideal;

//class Lader{
//    double 上底;
//    double 高;
//    static double 下底;
//    void 设置上底(double a){
//        上底 = a;
//    }
//
//    void 设置下底(double b){
//        下底 = b;
//    }
//
//    double 获取上底(){
//        return 上底;
//    }
//
//    double 获取下底(){
//        return 下底;
//    }
//}
//
//
//public class I {
//    public static void main(String[] args) {
//        Lader.下底 = 100;
//        Lader laderOne = new Lader();
//        Lader laderTwo = new Lader();
//        laderOne.设置上底(28);
//        laderTwo.设置上底(66);
//        System.out.println("laderOne的上底"+laderOne.获取上底());
//        System.out.println("laderOne的下底"+laderOne.获取下底());
//        System.out.println("laderTwo的上底"+laderTwo.获取上底());
//        System.out.println("laderTwo的下底"+laderTwo.获取下底());
//    }
//}




//class Sum{
//    int x;
//    int y;
//    int z;
//    static int getContinueSum(int start,int end){
//        int sum = 0;
//        for(int i = start;i<=end;i++){
//            sum = sum+i;
//        }
//        return sum;
//    }
//}
//
//public class I{
//    public static void main(String[] args) {
//        int result = Sum.getContinueSum(0,100);
//        System.out.println(result);
//    }
//}




//class Circle{
//    double radius;
//    public void setRadius(double r){
//        if(r>0)
//            radius = r;
//    }
//
//    public double getRadius(){
//        return radius;
//    }
//
//    public double getArea(){
//        return 3.14*radius*radius;
//    }
//
//}
//
//
//class Tixing{
//    double above;
//    double bottom;
//    double height;
//    Tixing(double a,double b,double c){
//        above = a;
//        bottom = b;
//        height = c;
//    }
//    double getArea(){
//        return (above+bottom)*height/2;
//    }
//}
//
//class People{
//    double computerArea(Circle c){
//        double area = c.getArea();
//        return area;
//    }
//
//    double computerArea(Tixing t){
//        double area = t.getArea();
//        return area;
//    }
//}
//
//public class I{
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.setRadius(196.87);
//        Tixing lader = new Tixing(3,21,9);
//        People zhang = new People();
//        System.out.println("zhang计算圆的面积：");
//        double result = zhang.computerArea(circle);
//        System.out.println(result);
//        System.out.println("zhang计算梯形的面积：");
//        result = zhang.computerArea(lader);
//        System.out.println(result);
//    }
//}



class People{
    int leg;
    int hand;
    String name;
    People(String s){
        name = s;
        this.init();
    }

    void init(){
        leg = 2;
        hand = 2;
        System.out.println(name+"有"+hand+"只手"+leg+"条腿");
    }
}
public class I{
    public static void main(String[] args) {
        People boshi = new People("布什");
    }
}