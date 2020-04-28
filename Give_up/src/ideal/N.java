package ideal;


//class 类人猿{
//    void crySpeak(String s){
//        System.out.println(s);
//    }
//}
//
//class People extends 类人猿{
//    void computer(int a,int b){
//        int c = a*b;
//        System.out.println(c);
//    }
//    void crySpeak(String s){
//        System.out.println("***"+s+"***");
//    }
//}
//
//public class N {
//    public static void main(String[] args) {
//        类人猿 Monkey = new People();
//        Monkey.crySpeak("I love this game");
//        People people = (People)Monkey;
//        people.computer(10,10);
//    }
//}




//class 动物{
//    void cry(){
//
//    }
//}
//
//class 狗 extends 动物{
//    void cry(){
//        System.out.println("汪汪...");
//    }
//}
//
//class 猫 extends 动物{
//    void cry(){
//        System.out.println("喵喵...");
//    }
//}
//
//public class N{
//    public static void main(String[] args) {
//        动物 animal;
//        animal = new 狗();
//        animal.cry();
//        animal = new 猫();
//        animal.cry();
//    }
//}




//abstract class A{
//    abstract int sum(int x,int y);
//    int sub(int x,int y){
//        return x-y;
//    }
//}
//
//class B extends A{
//    int sum(int x,int y){
//        return x+y;
//    }
//}
//
//public class N{
//    public static void main(String[] args) {
//        B b = new B();
//        int sum = b.sum(30,20);
//        int sub = b.sub(30,20);
//        System.out.println("sum="+sum);
//        System.out.println("sub="+sub);
//    }
//}