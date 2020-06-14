//package zjm;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//
//public class P {
//    //正常购买的食物和价格
//    String hambuger="汉堡";
//    int h1;//汉堡的数量
//    String chips="薯条";
//    int c1;//薯条的数量
//    String tart="蛋挞";
//    int t1;//蛋挞的数量
//    String chickenrolls="鸡肉卷";
//    int CH1;//鸡肉卷的数量
//    String sundae="圣代";
//    int s1;//圣代的数量
//    String cola="可乐";
//    int c2;//可乐的数量
//    String jucie="果汁";
//    int j1;//果汁的数量
//    String chicken="鸡块";
//    int CH2;//鸡块的数量
//    //各种食品的价格
//    int priceh1=15;//汉堡的价格
//    int pricec1=10;//薯条的价格
//    int pricet1=8;//蛋挞的价格
//    int priceCH1=16;//鸡肉卷的价格
//    int prices1=7;//圣代的价格
//    int pricec2=6;//可乐的价格
//    int pricej1=6;//果汁的价格
//    int priceCH2=8;//鸡块的价格
//
//    //套餐购买
//    String SectionA="套餐A";//"汉堡+可乐+薯条";
//    String SectionB="套餐B";//"鸡肉卷+可乐+薯条";
//    String SectionC="套餐C";//"汉堡+鸡肉卷+蛋挞";
//    String SectionD="套餐D";//"鸡肉卷+薯条+果汁";
//    int priceA=25;
//    int priceB=27;
//    int priceC=39;
//    int priceD=27;
//
//    //定义一个菜单
//    public void show() {
//        System.out.println("汉堡 15元");
//        System.out.println("薯条 10元");
//        System.out.println("蛋挞 8元");
//        System.out.println("鸡肉卷 16元");
//        System.out.println("圣代 7元");
//        System.out.println("可乐 6元");
//        System.out.println("果汁 7元");
//        System.out.println("鸡块 8元");
//    }
//}
//interface Buyways{
//    public void normal();//正常购买
//    public void set();//套餐购买
//}
//class Main extends P implements Buyways{
//    public static void main(String[] args) {
//        Main kfc=new Main();
//        kfc.menu();
//    }
//
//    @Override//实现正常购买函数
//    public void normal() {
//        try {
//            // TODO Auto-generated method stub
//            System.out.println("请输入点餐信息:");
//            while(true) {
//                Scanner sc=new Scanner(System.in);
//                String emmm=sc.nextLine();
//                switch(emmm) {
//                    case"汉堡":
//                        System.out.println("请输入汉堡的数量:");
//                        h1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"薯条":
//                        System.out.println("请输入薯条的数量:");
//                        c1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"蛋挞":
//                        System.out.println("请输入鸡肉卷的数量:");
//                        t1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"鸡肉卷":
//                        System.out.println("请输入鸡肉卷的数量:");
//                        CH1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"圣代":
//                        System.out.println("请输入圣代的数量:");
//                        s1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"可乐":
//                        System.out.println("请输入可乐的数量:");
//                        c2=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"果汁":
//                        System.out.println("请输入果汁的数量:");
//                        j1=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"鸡块":
//                        System.out.println("请输入鸡块的数量:");
//                        CH2=sc.nextInt();
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        continue;
//                    case"finish":
//                        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
//                        Date nowTime =null;
//                        Date beginTime = null;
//                        Date endTime = null;
//                        try {
//                            nowTime = df.parse(df.format(new Date()));
//                            beginTime = df.parse("12:00");
//                            endTime = df.parse("14:00");
//                        }catch(Exception e) {
//                            e.printStackTrace();
//                        }
//                        boolean flag = belongCalendar(nowTime, beginTime, endTime);
//                        if(flag) {
//                            System.out.println("午间用餐 八折优惠");
//                            double sumprice=(h1*priceh1+c1*pricec1+t1*pricet1+CH1*priceCH1+s1*prices1+c2*pricec2+j1*pricej1+CH2*priceCH2)*0.8;
//                            System.out.println("应收:"+sumprice);
//                            int deserveprice=sc.nextInt();
//                            System.out.println("收款:"+deserveprice);
//                            System.out.println("找零:"+(deserveprice-sumprice));
//                            break;
//                        }else {
//                            int sumprice=h1*priceh1+c1*pricec1+t1*pricet1+CH1*priceCH1+s1*prices1+c2*pricec2+j1*pricej1+CH2*priceCH2;
//                            System.out.println("应收:"+sumprice);
//                            int deserveprice=sc.nextInt();
//                            System.out.println("收款:"+deserveprice);
//                            System.out.println("找零:"+(deserveprice-sumprice));
//                            break;
//                        }
//                }
//                //sc.close();
//                System.out.println("----------------------------------------------");
//                menu();	//点餐结束 返回菜单
//            }
//
//        }catch(InputMismatchException e) {
//            System.out.println("输入异常，请正确输入");
//        }
//
//    }
//    //用于判断是否在当前时间段内的函数
//    private boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
//        // TODO Auto-generated method stub
//        Calendar date = Calendar.getInstance();//设置当前时间
//        date.setTime(nowTime);
//
//        Calendar begin = Calendar.getInstance();//设置开始时间
//        begin.setTime(beginTime);
//
//        Calendar end = Calendar.getInstance();//设置结束时间
//        end.setTime(endTime);
//
//        if (date.after(begin) && date.before(end)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override//实现套餐购买函数
//    public void set(){
//        try {
//            // TODO Auto-generated method stub
//            System.out.println("欢迎光临,请选择你想要的套餐");
//            System.out.println("套餐A:汉堡+可乐+薯条");
//            System.out.println("套餐B:鸡肉卷+可乐+薯条");
//            System.out.println("套餐C:汉堡+鸡肉卷+蛋挞");
//            System.out.println("套餐D:鸡肉卷+薯条+果汁");
//
//            while(true) {
//                Scanner sc1=new Scanner(System.in);
//                String emmm1=sc1.nextLine();
//                switch(emmm1) {
//                    case"套餐A":
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        System.out.println("应收:"+priceA);
//                        int deserveprice=sc1.nextInt();
//                        System.out.println("收款:"+deserveprice);
//                        System.out.println("找零:"+(deserveprice-priceA));
//                        continue;
//                    case"套餐B":
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        System.out.println("应收:"+priceB);
//                        int deserveprice1=sc1.nextInt();
//                        System.out.println("收款:"+deserveprice1);
//                        System.out.println("找零:"+(deserveprice1-priceB));
//                        continue;
//                    case"套餐C":
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        System.out.println("应收:"+priceC);
//                        int deserveprice2=sc1.nextInt();
//                        System.out.println("收款:"+deserveprice2);
//                        System.out.println("找零:"+(deserveprice2-priceC));
//                        continue;
//                    case"套餐D":
//                        System.out.println("请继续点餐，若结束请输入finish完成点餐^_^~");
//                        System.out.println("应收:"+priceD);
//                        int deserveprice3=sc1.nextInt();
//                        System.out.println("收款:"+deserveprice3);
//                        System.out.println("找零:"+(deserveprice3-priceD));
//                        continue;
//                    case"finish":
//                        System.out.println("点餐结束");
//                        break;
//                }
//                //sc1.close();
//                System.out.println("----------------------------------------------");
//                menu();//点餐结束 返回菜单
//            }
//        }catch(InputMismatchException e) {
//            System.out.println("输入异常，请正确输入");
//        }
//
//    }
//    //菜单函数 用于展示菜单信息和选择购买方式
//    public void menu() {
//        try {
//            System.out.print("欢迎使用KFC点餐系统~    ");
//
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//
//            System.out.println("Good news: 12:00~14:00就餐8折优惠");
//
//            show();//调用定义在Food类中的显示函数用于显示出菜单信息
//            System.out.println("1.正常购买\n2.套餐购买");
//            Scanner sc2= new Scanner(System.in);
//            int order=sc2.nextInt();
//            if(order==1) {
//                normal();
//            }
//            if(order==2) {
//                set();
//            }
//            //sc2.close();
//        }catch(InputMismatchException e) {
//            System.out.println("输入异常，请正确输入");
//        }
//    }
//
//}
