package ideal;

//class People{
//    float weight;
//    float height;
//    String name;
//    void speak(String s){
//        System.out.println(s);
//    }
//}
//
//class Student extends People{
//    int number;
//    double add(double a,double b){
//        return a+b;
//    }
//}
//
//public class K {
//    public static void main(String[] args) {
//        Student zhangSan = new Student();
//        zhangSan.weight = 65.9f;
//        zhangSan.height = 182f;
//        zhangSan.name = "张三";
//        zhangSan.number = 201011;
//        zhangSan.speak("我是"+zhangSan.name+",我的学号："+zhangSan.number);
//        System.out.println("我会做加法");
//        double sum = zhangSan.add(23.5,879.987);
//        System.out.println("sum="+sum);
//    }
//}




//class University{
//    void enterRule(double math,double english,double chinese){
//        double total = math+english+chinese;
//        if(total>=200)
//            System.out.println(total+"分数到大学录取线");
//        else
//            System.out.println(total+"分未达到大学录取线");
//    }
//}
//
//class ImportUniversity extends University{
//    void enterRule(double math,double english,double chinese){
//        double total = math+english+chinese;
//        if(total>=245)
//            System.out.println(total+"分数到重点大学录取线");
//        else
//            System.out.println(total+"分未达到重点大学录取线");
//    }
//
//}
//
//public class K{
//    public static void main(String[] args) {
//        double math = 64;
//        double english = 76.5;
//        double chinese = 66;
//        ImportUniversity univer = new ImportUniversity();
//        univer.enterRule(math,english,chinese);
//        math = 89;
//        english = 80;
//        chinese = 86;
//        univer = new ImportUniversity();
//        univer.enterRule(math,english,chinese);
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
//    float computer(float x, float y) {
//        return x*y;
//    }
//}
//
//public class K{
//    public static void main(String[] args) {
//        B b = new B();
//        double result = b.computer(8,9);
//        System.out.println("调用重写方法得到的结果："+result);
//        int m = b.g(12,8);
//        System.out.println("调用继承方法得到的结果："+m);
//    }
//}