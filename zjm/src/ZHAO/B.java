package ZHAO;

//class BankException extends Exception{
//    String message;
//    public BankException(int m,int n){
//        message = "入账资金"+m+"是负数或支出"+n+"是正数，不符合系统要求。";
//
//    }
//    public String warnMess(){
//        return message;
//    }
//}
//
//class Bank{
//    int money;
//    public void income(int in,int out){
//        if(in<=0||out>=0||in+out<=0){
//            throw new BankException(in,out);
//        }
//        int netIncome = in+out;
//        System.out.printf("本次计算出的纯收入是：%d元\n",netIncome);
//        money = money+netIncome;
//    }
//
//    public int getMoney(){
//        return money;
//    }
//}
//
//
//public class B{
//    public static void main(String[] args){
//        Bank bank = new Bank();
//        try{
//            bank.income(200,-100);
//            bank.income(300,-100);
//            bank.income(400,-100);
//            System.out.printf("银行目前有%d元\n",bank.money);
//            bank.income(200,100);
//            bank.income(9999,-100);
//        }
//        catch(BankException e){
//            System.out.println("计算收益的过程中出现如下问题：");
//            System.out.println(e.warnMess());
//        }
//        System.out.printf("银行目前有%d元\n",bank.money);
//    }
//}





//class DangerException extends Exception{
//    final String message = "超重";
//    public String warnMess(){
//        return message;
//    }
//}
//
//class CargoBoat{
//    int realContent;
//    int maxContent;
//    public void setMaxContent(int c){
//        maxContent = c;
//    }
//
//    public void loading(int m)throw DangerException{
//        realContent+=m;
//        if(realContent>maxContent){
//            throw new DangerException();
//        }
//
//        System.out.println("目前装载了"+realContent+"吨货物");
//    }
//}
//
//public class B{
//    public static void main(String[] args){
//        CargoBoat ship = new CargoBoat();
//        ship.setMaxContent(1000);
//        int m = 600;
//        try{
//            ship.loading(m);
//            m = 400;
//            ship.loading(m);
//            m = 367;
//            ship.loading(m);
//            m = 555;
//            ship.loading(m);
//        }
//        catch(DangerException e){
//            System.out.println(e.warnMess());
//            System.out.println("无法再装载质量是"+m+"吨的集装箱");
//        }
//        finally {
//            System.out.printf("货船将正点启航");
//        }
//    }
//}




//class Goods{
//    boolean isDanger;
//    String name;
//    Goods(String name){
//        this.name = name;
//    }
//
//    public void setIsDanger(boolean boo){
//        isDanger = boo;
//    }
//
//    public String getName(){
//        return name;
//    }
//}
//class DangerException extends Exception{
//    String message;
//    public DangerException(){
//        message = "危险品！";
//    }
//
//    public void toShow(){
//        System.out.print(message+"");
//    }
//}
//
//class Machine{
//    public void checkBag(Goods goods) throws DangerException{
//        if(goods.isDanger()){
//            DangerException danger = new DangerException();
//            throw new DangerException;
//        }
//    }
//}
//
//public class S{
//    public static void main(String[] args){
//        Machine machine = new Machine();
//        Goods apple = new Goods("苹果");
//        apple.setIsDanger(false);
//        Goods explosive = new Goods("炸药");
//        explosive.setIsDanger(true);
//        try{
//            machine.checkBag(explosive);
//            System.out.println(explosive.getName()+"检查通过");
//        }
//        catch(DangerException e){
//            System.out.println(e.toShow());
//            System.out.println(explosive.getName()+"被禁止");
//        }
//        try{
//            machine.checkBag(apple);
//            System.out.println(apple.getName()+"检查通过");
//        }
//        catch(DangerException e){
//            System.out.println(e.toShow());
//            System.out.println(apple.getName()+"被禁止");
//        }
//    }
//}
