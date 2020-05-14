package ideal;

//import java.util.*;
//import java.util.Calendar;
//
//public class A {
//    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        String 年 = String.valueOf(calendar.get(Calendar.YEAR));
//        String 月 = String.valueOf(calendar.get(calendar.MONTH)+1);
//        String 日 = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//        int second = calendar.get(Calendar.SECOND);
//        System.out.print("现在的时间是：");
//        System.out.println(" "+年+"年"+月+"月"+日+"日");
//        System.out.println(" "+hour+"时"+minute+"分"+second+"秒");
//        int year = 1949,month = 9,day = 1;
//        calendar.set(year,month-1,day);
//
//        long time1 = calendar.getTimeInMillis();
//        year = 2009;
//        month = 9;
//        day = 1;
//        calendar.set(year,month-1,day);
//        long time2 = calendar.getTimeInMillis();
//        long 相隔天数 = (time2-time1)/(1000*60*60*24);
//        System.out.println("2009-10-1和1949-10-1相隔"+相隔天数+"天");
//    }
//}





//import java.util.Calendar;
//
//public class A{
//    public static void main(String[] args) {
//        CalendarBean cb = new CalendarBean();
//        cb.setYear(2011);
//        cb.setMonth(7);
//        String [] a = cb.getCalendar();
//        char []str = "日一二三四五六".toCharArray();
//        for(char c:str){
//            System.out.printf("%3c",c);
//        }
//        for (int i = 0; i < a.length; i++) {
//            if(i%7 == 0)
//                System.out.println("");
//            System.out.printf("%4s",a[i]);
//        }
//    }
//}
//
//class CalendarBean{
//    String[] day;
//    int year = 0,month = 0;
//    public void setYear(int year){
//        this.year = year;
//    }
//    public void setMonth(int month){
//        this.month = month;
//    }
//    public String[] getCalendar(){
//        String[]a = new String[42];
//        Calendar rill = Calendar.getInstance();
//        rill.set(year,month-1,1);
//        int weekday = rill.get(Calendar.DAY_OF_WEEK)-1;
//        int day = 0;
//        if(month == 1||month == 5||month == 7||month == 8||month == 10||month == 12)
//            day = 31;
//        if(month == 4||month == 6||month == 9||month == 11)
//            day = 30;
//        if(month == 2){
//            if(((year%4 == 0)&&(year%100!=0))||(year%400 == 0))
//                day = 29;
//            else
//                day = 28;
//        }
//        for (int i = 0; i < weekday; i++)
//            a[i] = " ";
//        for (int i = weekday,n = 1; i < weekday+day; i++){
//            a[i] = String.valueOf(n);
//            n++;
//        }
//        for (int i = weekday+day; i < a.length; i++)
//            a[i] = " ";
//        return a;
//    }
//}



//import java.math.*;
//
//public class A{
//    public static void main(String[] args) {
//        double a = 5.0;
//        double st = Math.sqrt(a);
//        System.out.println(a+"的平方根："+st);
//        BigInteger result = new BigInteger("0");
//        BigInteger one = new BigInteger("123456789");
//        BigInteger two = new BigInteger("987654321");
//        result = one.add(two);
//        System.out.println("和："+result);
//        result = one.multiply(two);
//        System.out.println("积："+result);
//    }
//}





//import java.text.*;
//
//public class A{
//    public static void main(String[] args) {
//        double number = 98765.123456;
//        System.out.println(number+"格式化为整数最少6位，小数最多三位：");
//        DecimalFormat df = new DecimalFormat("000000.000");
//        String result = df.format(number);
//        System.out.println(result);
//        number = 12345678.987654;
//        System.out.printf("%f格式化为整数最少2位，小数最多4位（整数部分按千分组）：%n",number);
//        df.applyPattern("#,##,#00.0000$");
//        result = df.format(number);
//        System.out.println(result);
//        number = 0.986796;
//        System.out.println(number+"格式化为百分数和千分位：");
//        df.applyPattern("0.0000\u2030");
//        result = df.format(number);
//        System.out.println(result);
//        String money = "9,576,769.345$";
//        System.out.println(money+"转化成数字：");
//        df.applyPattern("#,##,##0.000");
//        try{
//            Number num = df.parse(money);
//            System.out.println(num.doubleValue());
//        }
//        catch (Exception exp){}
//    }
//}