package R;

//class BankException extends Exception{
//    String message;
//    public BankException(int m,int n){
//        message = "入账资金"+m+"是负数或支出"+n+"是正数，不符合系统要求。";
//    }
//    public String WarnMess(){
//        return message;
//    }
//}
//
//class Bank{
//    int money;
//    public void income(int in,int out) throws BankException{
//        if(in<=0||out>=0||in+out<=0){
//            throw new BankException(in,out);
//        }
//        int netIncome = in+out;
//        System.out.println("本次计算出的纯收入是："+netIncome);
//        money = money+netIncome;
//    }
//    public int getMoney(){
//        return money;
//    }
//}
//
//public class W {
//    public static void main (String[] args) {
//        Bank bank = new Bank();
//        try{
//            bank.income(200,-100);
//            bank.income(300,-100);
//            bank.income(400,-100);
//            System.out.println("银行目前有"+bank.money+"元");
//            bank.income(200,100);
//            bank.income(99999,-100);
//        }
//        catch (BankException e){
//            System.out.println("计算收益的过程中出现如下问题：");
//            System.out.println(e.WarnMess());
//        }
//        System.out.println("银行目前有"+bank.money+"元");
//    }
//}



//class DangerException extends Exception{
//       final String message = "超重";
//       public String warnMess(){
//           return message;
//       }
//}
//
//class CargoBoat{
//    int realContent;
//    int maxContent;
//    public void setMaxContent(int c){
//        maxContent = c;
//    }
//    public void loading(int m) throws DangerException{
//        realContent = realContent+m;
//        if(realContent>maxContent){
//            throw new DangerException();
//        }
//        System.out.println("目前装载了"+realContent+"吨货物");
//    }
//}
//
//public class W{
//    public static void main (String[] args) {
//        CargoBoat boat = new CargoBoat();
//        boat.setMaxContent(1000);
//        int m = 600;
//        try{
//            boat.loading(m);
//            m = 400;
//            boat.loading(m);
//            m = 397;
//            boat.loading(m);
//            m = 555;
//            boat.loading(m);
//        }
//        catch(DangerException e){
//            System.out.println(e.warnMess());
//            System.out.println("无法再装载重量是"+m+"吨的集装箱");
//        }
//        finally{
//            System.out.println("货船将正点起航");
//        }
//    }
//}



//import java.util.Scanner;
//
//public class W{
//    public static void main (String[] args) {
//        int[] score = {-120,98,89,120,99};
//        int sum = 0;
//        for(int number:score){
//            assert number>0:"负数不能是成绩";
//            sum = sum+number;
//        }
//        System.out.println("总成绩："+sum);
//    }
//}



//class Cry{
//    public void cry(){
//        System.out.println("大家好");
//    }
//}
//
//public class W{
//    public static void main (String[] args) {
//        Cry hello = new Cry(){
//            public void cry(){
//                System.out.println("大家好，祝工作顺利");
//            }
//        };
//        hello.cry();
//    }
//}