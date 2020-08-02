package R;

//class Tom{
//    private float weight;
//    private float f(float a,float b){
//        return a+b;
//    }
//}
//
//class Jerry{
//    void g(){
//        Tom cat = new Tom();
//        cat.weight = 23f;
//        float sum = cat.f(3,4);
//    }
//}



//class Student{
//    private int age;
//    public void setAge(int age){
//        if(age>=7&&age<=28){
//            this.age = age;
//        }
//    }
//    public int getAge(){
//        return age;
//    }
//}
//
//public class O {
//    public static void main (String[] args) {
//        Student zhang = new Student();
//        Student geng = new Student();
//        zhang.setAge(23);
//        System.out.println("zhang的年龄："+zhang.getAge());
//        //zhang.age = 23;
//        geng.setAge(25);
//        //geng.age = 25;
//        System.out.println("geng的年龄："+geng.getAge());
//    }
//}



//class Tom{
//    public float weight;
//    public float f(float a,float b){
//        return a+b;
//    }
//}
//
//class Jerry{
//    void g(){
//        Tom cat = new Tom();
//        cat.weight = 23f;
//        float sum = cat.f(3,4);
//    }
//}



//class Computer{
//    public int getSum(int...x){
//        int sum = 0;
//        for (int i = 0; i < x.length; i++) {
//            sum = sum+x[i];
//        }
//        return sum;
//    }
//}
//
//public class O{
//    public static void main (String[] args) {
//        Computer computer = new Computer();
//        int result = computer.getSum(203,178,56,2098);
//        System.out.println("203,178,56,2098的和："+result);
//        result = computer.getSum(66,12,5,89,2,51);
//        System.out.println("66,12,5,89,2,51的和："+result);
//    }
//}



//class B{
//    int x = 100;
//    int y = 200;
//    public void setX(int x){
//        x = x;
//    }
//    public int getX(){
//        return x;
//    }
//    public void setY(int y){
//        this.y = y;
//    }
//    public int getY(){
//        return y;
//    }
//    public int getSum(){
//        return x+y;
//    }
//}
//
//public class O{
//    public static void main (String[] args) {
//        B b = new B();
//        b.setX(-100);
//        b.setY(-200);
//        System.out.println("sum = "+b.getSum());
//    }
//}




//class B{
//    int n;
//    static int sum = 0;
//    void setN(int n){
//        this.n = n;
//    }
//    int getSum(){
//        for (int i = 1; i <= n; i++)
//            sum = sum + i;
//        return sum;
//    }
//}
//
//public class O{
//    public static void main (String[] args) {
//        B b1 = new B();
//        B b2 = new B();
//        b1.setN(3);
//        b2.setN(5);
//        int s1 = b1.getSum();
//        int s2 = b2.getSum();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1+s2);
//    }
//}