//package zjm;
//
//import java.util.Scanner;
//
//public class O {
//    private String account;//账户 
//    private String password;//密码 
//    private String time;//开户时间 
//    private String id;//身份证号 
//    private double money;//存款金额 
//
//    public String getAccount () {
//        return account;
//    }
//
//    public void setAccount (String account) {
//        this.account = account;
//    }
//
//    public String getPassword () {
//        return password;
//    }
//
//    public void setPassword (String password) {
//        this.password = password;
//    }
//
//    public String getTime () {
//        return time;
//    }
//
//    public void setTime (String time) {
//        this.time = time;
//    }
//
//    public String getId () {
//        return id;
//    }
//
//    public void setId (String id) {
//        this.id = id;
//    }
//
//    public double getMoney () {
//        return money;
//    }
//
//    public void setMoney (double money) {
//        this.money = money;
//    }//存款方法 
//
//    public void deposit (double money) {
//        this.money = this.money + money;//存入的金额加上原有的金额 
//    }//取款方法 
//
//    public void withDrawal (double money) {
//        if (money > this.money) {//取款金额大于余额   
//            System.out.println("存款余额不足");
//        } else {
//            this.money = this.money - money;//原有的金额减去取出的金额  
//        }
//    }
//
//    public static void main (String[] args) {
//        O zhao = new O();//初始化一个账户信息  
//        zhao.setMoney(20000.0);//向zh账户添加余额  
//        zhao.setTime("2020.6.5");//向zhao账户添加开发时间  
//        zhao.setPassword("123456");//向zhao账户添加密码  
//        zhao.setId("123456789");//向zhao账户添加身份证  
//        zhao.setAccount("lisi");//向zhao账户添加账号  
//        System.out.println("欢迎中国银行");
//        Scanner scan = new Scanner(System.in);
//        int count =0;//记录输入错误的次数  
//        while (1 == 1){//循环   
//            System.out.println("请输入账号");
//            String zhm = scan.next();
//            System.out.println("请输入密码");
//            String li = scan.next();
//            if (zhm.equals(zhao.getAccount()) && li.equals(zhao.getPassword())) {
//                //输入的信息与zh账户信息的密码和账号一致    
//                while (1==1){
//                    System.out.println("当前余额为：" + zhao.getMoney() + "元。" +
//                            "请选择操作：1.存款；2.取款；3.退出（只能输入数字）");
//                    String ya=scan.next();
//                    switch (Integer.parseInt(ya)) {
//                        case 1:System.out.println("请输入存款金额（输入小数）");
//                            double ck = scan.nextDouble();
//                            zhao.deposit(ck);
//                            System.out.println("实施存款：" + ck + "元，" +
//                                    "当前余额为" + zhao.getMoney() + "元");
//                            break;
//                        case 2:
//                            System.out.println("请输入取款金额（输入小数）");
//                            double qk = scan.nextDouble();
//                            zhao.withDrawal(qk);
//                            System.out.println("实施取款：" + qk + "元，" +
//                                    "当前余额为" + zhao.getMoney() + "元");
//                            break;
//                        case 3:
//                            break;
//                        default:
//                            System.out.println("暂无此功能");//输入或者、以外的操作      
//                            break;
//                    }
//                    if ("3".equals(ya)) {
//                        break;
//                    }
//                }
//                System.out.println("退出操作");
//                break;
//            }
//            else {
//                if (count >= 3) {
//                    System.out.println("已输入错误三次，账号被锁");
//                    break;//结束循环
//                }
//                else {
//                    System.out.println("账号或密码错误，请重新输入");
//                    count++;//错误一次count++   
//                    continue;//进入下次循环 
//                }
//            }
//        }
//    }
//}


