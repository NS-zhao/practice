package ideal;

//class Bank{
//    int savedMoney;
//    int year;
//    double interest;
//    public double computerInterest(){
//        interest = year*0.035*savedMoney;
//        System.out.printf("%d 元存在银行%d年的利息：%f元\n",savedMoney,year,interest);
//        return interest;
//    }
//}
//
//class ConstructionBack extends Bank{
//    double year;
//    public double computerInterest(){
//        super.year = (int)year;
//        double remainNumber = year-(int)year;
//        int day = (int)(remainNumber*1000);
//        interest = super.computerInterest()+day*0.0001*savedMoney;
//        System.out.printf("%d 元存在建设银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
//        return interest;
//    }
//}
//
//class BackOfDalian extends Bank{
//    double year;
//    public double computerInterest(){
//        super.year = (int)year;
//        double remainNumber = year-(int)year;
//        int day = (int)(remainNumber*1000);
//        interest = super.computerInterest()+day*0.00012*savedMoney;
//        System.out.printf("%d 元存在大连银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
//        return interest;
//    }
//}
//
//public class M {
//    public static void main(String[] args) {
//        //int amount = 5000;
//        ConstructionBack bank1 = new ConstructionBack();
//        bank1.savedMoney = 5000;
//        bank1.year = 5.216;
//        double interest1 = bank1.computerInterest();
//        BackOfDalian bank2 = new BackOfDalian();
//        bank2.savedMoney = 5000;
//        bank2.year = 5.216;
//        double interest2 = bank2.computerInterest();
//        System.out.printf("两个银行利息相差%f元\n",interest1-interest2);
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
//        System.out.println("我的名字是："+name+",学号是："+number);
//    }
//
//}
//
//class UniverStendent extends Student{
//    boolean 婚否;
//    UniverStendent(int number,String name,boolean b){
//        super(number,name);
//        婚否 = b;
//        System.out.println("婚否 = "+婚否);
//    }
//}
//
//public class M{
//    public static void main(String[] args) {
//        UniverStendent zhang = new UniverStendent(9901,"何小林",false);
//    }
//}





//class A{
//    final double PI = 3.1415926;
//    public double getArea(final double r){
//        return PI*r*r;
//    }
//
//    public void speak(){
//        System.out.println("您好，How's everything here?");
//    }
//}
//
//public class M{
//    public static void main(String[] args) {
//        A a = new A();
//        System.out.println("面积是："+a.getArea(100));
//        a.speak();
//    }
//}