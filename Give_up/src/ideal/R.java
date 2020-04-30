package ideal;

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
//public class R {
//    public static void main(String[] args) {
//        ShowMessage sm;
//        sm = new TV();
//        sm.显示商标("长城牌电视机");
//        sm = new PC();
//        sm.显示商标("联想奔月5008PC机");
//    }
//}




//interface CompurerAverage{
//    public double average(double a,double b);
//}
//
//class A implements CompurerAverage{
//    public double average(double a,double b){
//        double aver = 0;
//        aver = (a+b)/2;
//        return aver;
//    }
//}
//
//class B implements CompurerAverage{
//    public double average(double a,double b){
//        double aver = 0;
//        aver = Math.sqrt(a*b);
//        return aver;
//    }
//}
//
//public class R{
//    public static void main(String[] args) {
//        CompurerAverage computer;
//        double a = 11.23;
//        double b = 22.78;
//        computer = new A();
//        double result = computer.average(a,b);
//        System.out.printf("%5.2f和%5.2f的算数平均数：%5.2f\n",a,b,result);
//        computer = new B();
//        result = computer.average(a,b);
//        System.out.printf("%5.2f和%5.2f的几何平均数：%5.2f",a,b,result);
//    }
//}




//interface SpeakHello{
//    void speakHello();
//}
//
//class Chinese implements SpeakHello{
//    public void speakHello(){
//        System.out.println("中国人习惯问候语：你好，吃饭了吗？");
//    }
//}
//
//class English implements SpeakHello{
//    public void speakHello(){
//        System.out.println("英国人习惯问候语：你好，天气不错");
//    }
//}
//
//class KindHello{
//    public void lookHello(SpeakHello hello){
//        hello.speakHello();
//    }
//}
//
//public class R{
//    public static void main(String[] args) {
//        KindHello kindHello = new KindHello();
//        kindHello.lookHello(new Chinese());
//        kindHello.lookHello(new English());
//    }
//}




//interface SpeakHello{
//    void speak();
//}
//
//class HelloMachine{
//    public void turnOn(SpeakHello hello){
//        hello.speak();
//    }
//}
//
//public class R{
//    public static void main(String[] args) {
//        HelloMachine machine = new HelloMachine();
//        machine.turnOn(new SpeakHello() {
//            @Override
//            public void speak() {
//                System.out.println("hello,you are welcome!");
//            }
//        });
//        machine.turnOn(new SpeakHello() {
//            @Override
//            public void speak() {
//                System.out.println("你好，欢迎光临");
//            }
//        });
//    }
//}