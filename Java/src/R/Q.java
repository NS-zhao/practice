package R;

//class A{
//    float computer(float x,float y){
//        return x+y;
//    }
//    public int g(int x,int y){
//        return x+y;
//    }
//}
//
//class B extends A{
//    float computer(float x,float y){
//        return x*y;
//    }
//}
//
//public class Q {
//    public static void main (String[] args) {
//        B b = new B();
//        double result = b.computer(8,9);
//        System.out.println("调用重写方法得到的结果："+result);
//        int m = b.g(8,9);
//        System.out.println("调用集成方法得到的结果："+m);
//    }
//}



//class A{
//    float computer(float x,float y){
//        return x+y;
//    }
//    public int g(int x,int y){
//        return x+y;
//    }
//}
//
//class B extends A{
//    float computer(float x,float y,double z){
//        return x*y;
//    }
//}
//
//public class Q {
//    public static void main (String[] args) {
//        B b = new B();
//        double result = b.computer(8,9);
//        System.out.println("调用重写方法得到的结果："+result);
//        int m = b.g(8,9);
//        System.out.println("调用集成方法得到的结果："+m);
//    }
//}



//class A{
//    protected float f(float x,float y){
//        return x-y;
//    }
//}
//
//class B extends A{
//    float f(float x,float y){
//        return x+y;
//    }
//}
//
//class C extends A{
//    public float f(float x,float y){
//        return x*y;
//    }
//}


import javax.swing.*;

//class Bank{
//    int saveMoney;
//    int year;
//    double interest;
//    public double computerInterest(){
//        interest = year*0.035*saveMoney;
//        System.out.println(saveMoney+"元存在银行"+year+"年的利息："+interest+"元");
//        return interest;
//    }
//}
//
//class JiansheBank extends Bank{
//    double year;
//    public double computerInterest(){
//        super.year = (int)year;
//        double n = year-(int)year;
//        int day = (int)(n*1000);
//        interest = super.computerInterest()+day*0.0001*saveMoney;
//        System.out.println(saveMoney+"元存在建设银行"+year+"年零"+day+"天的利息："+interest+"元");
//        return interest;
//    }
//}
//
//class DalianBank extends Bank{
//    double year;
//    public double computerInterest(){
//        super.year = (int)year;
//        double n = year-(int)year;
//        int day = (int)(n*1000);
//        interest = super.computerInterest()+day*0.00012*saveMoney;
//        System.out.println(saveMoney+"元存在建设银行"+year+"年零"+day+"天的利息："+interest+"元");
//        return interest;
//    }
//}
//
//public class Q{
//    public static void main (String[] args) {
//        int amount = 5000;
//        JiansheBank bank1 = new JiansheBank();
//        bank1.saveMoney = amount;
//        bank1.year = 5.216;
//        double interest1 = bank1.computerInterest();
//        DalianBank bank2 = new DalianBank();
//        bank2.saveMoney = amount;
//        bank2.year = 5.216;
//        double interest2 = bank2.computerInterest();
//        System.out.println("两个银行利息相差："+(interest2-interest1)+"元");
//    }
//}



//class Student{
//    int number;
//    String name;
//    Student(){
//
//    }
//    Student(int number,String name){
//        this.number = number;
//        this.name = name;
//        System.out.println("我的名字是："+name+"学号是："+number);
//    }
//}
//
//class UniverStudent extends Student{
//    boolean 婚否;
//    UniverStudent(int number,String name,boolean b){
//        super(number,name);
//        System.out.println("婚否"+婚否);
//    }
//}
//
//public class Q{
//    public static void main (String[] args) {
//        UniverStudent zhao = new UniverStudent(9901,"赵佳敏",false);
//    }
//}