package R;

//public class Three {
//    public static void main (String[] args) {
//        String s1,s2,t = "ABCDabcd";
//        s1 = t.toUpperCase();
//        System.out.println(s1);
//        s2 = t.toLowerCase();
//        System.out.println(s2);
//        String s3 = s1.concat(s2);
//        System.out.println(s3);
//    }
//}



//public class Three{
//    public static void main (String[] args) {
//        String s = "ABCDabcd";
//        char cStart = s.charAt(0);
//        char cEnd = s.charAt(s.length()-1);
//        System.out.println(cStart);
//        System.out.println(cEnd);
//    }
//}



//import java.util.*;
//class CalendarBean{
//    int year = 0;
//    int month = 0;
//    String []day;
//    public void setYear(int year){
//        this.year = year;
//    }
//    public void setMonth(int month){
//        this.month = month;
//    }
//    public String[] getCalendar(){
//        String []a = new String[42];
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year,month-1,1);
//        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
//        int day = 0;
//        if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
//            day = 31;
//        }
//        if(month == 4||month == 6||month == 9||month == 11){
//            day = 30;
//        }
//        if(month == 2){
//            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//                day = 29;
//            }
//            else{
//                day = 28;
//            }
//        }
//        for (int i = 0; i < weekDay; i++) {
//            a[i] = " ";
//        }
//        for (int i = weekDay,n = 1; i < weekDay+day; i++) {
//            a[i] = String.valueOf(n);
//            n++;
//        }
//        for (int i = weekDay+day; i < a.length; i++) {
//            a[i] = " ";
//        }
//        return a;
//    }
//}
//
//public class Three{
//    public static void main (String[] args) {
//        Scanner reader = new Scanner(System.in);
//        CalendarBean cb = new CalendarBean();
//        int year = 2000;
//        int month = 1;
//        System.out.println("输入年：");
//        year = reader.nextInt();
//        System.out.println("输入月：");
//        month = reader.nextInt();
//        cb.setYear(year);
//        cb.setMonth(month);
//        String []a = cb.getCalendar();
//        char []str = "日一二三四五六".toCharArray();
//        for(char c:str){
//            System.out.printf("%3c",c);
//        }
//        for (int i = 0; i < a.length; i++) {
//            if(i%7 == 0){
//                System.out.println();
//            }
//            System.out.printf("%4s",a[i]);
//        }
//    }
//}



//import java.util.*;
//public class Three{
//    public static void main (String[] args) {
//        int year1;
//        int year2;
//        int month1;
//        int month2;
//        int day1;
//        int day2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入第一个日期的年、月、日");
//        year1 = sc.nextInt();
//        month1 = sc.nextInt();
//        day1 = sc.nextInt();
//        System.out.println("输入第二个日期的年、月、日");
//        year2 = sc.nextInt();
//        month2 = sc.nextInt();
//        day2 = sc.nextInt();
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year1,month1-1,day1);
//        long time1 = calendar.getTimeInMillis();
//        calendar.set(year2,month2-1,day2);
//        long time2 = calendar.getTimeInMillis();
//        long 相隔天数 = Math.abs(time1-time2)/(1000*60*60*24);
//        System.out.println(相隔天数);
//    }
//}



//import java.util.*;
//public class Three {
//    public static void main (String args[ ]) {
//        double a=0,b=0,c=0;
//        a=12;
//        b=24;
//        c=Math.asin(0.56);
//        System.out.println(c);
//        c=Math.cos(3.14);
//        System.out.println(c);
//        c=Math.exp(1);
//        System.out.println(c);
//        c=Math.log(8);
//        System.out.println(c);
//    }
//}
