package ideal;

//import java.util.*;
//
//public class B {
//    public static void main(String[] args) {
//        String s1 = "苹果：56.7圆，香蕉：12圆，芒果：19.8圆";
//        String s2 = "酱油：6.7圆，精盐：0.8圆，榨菜：9.8圆";
//        ComputePice jisuan = new ComputePice();
//        String regex = "[^0123456789.]+";
//        String s1_number = s1.replaceAll(regex,"*");
//        double priceSum = jisuan.compute(s1_number,"*");
//        System.out.printf("\"%s\"价格总和：\n%f圆\n",s1,priceSum);
//        String s2_number = s2.replaceAll(regex,"#");
//        priceSum = jisuan.compute(s2_number,"#");
//        System.out.printf("\"%s\"价格总和：\n%f圆\n",s2,priceSum);
//
//    }
//}
//
//class ComputePice{
//    double compute(String s,String fenge){
//        StringTokenizer fenxiOne = new StringTokenizer(s,fenge);
//        double sum = 0;
//        double digitItem = 0;
//        while(fenxiOne.hasMoreTokens()){
//            String str = fenxiOne.nextToken();
//            digitItem = Double.parseDouble(str);
//            sum = sum+digitItem;
//        }
//        return sum;
//    }
//}




//public class B{
//    public static void main(String[] args) {
//        String s = "酱油:6.7圆,精盐:0.8圆,榨菜:9.8圆";
//        String regex = "[0123456789.]+圆";
//        String temp = s.replaceAll(regex," ");
//        temp = temp.replaceAll(":"," ");
//        temp = temp.replaceAll(","," ");
//        System.out.println(temp);
//    }
//}



//public class B{
//    public static void main(String[] args) {
//        System.out.println("abc" == "abc");
//    }
//}



//public class B {
//    public static void main (String args[ ]) {
//        String a = "abcdefg";
//        String b = "ABCDEFG";
//        String s1=a.toUpperCase();
//        String s2=b.toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        String s3=s1.concat(s2);
//        System.out.println(s3);
//    }
//}



//public class B {
//    public static void main (String args[ ]) {
//        String s="你是猪";
//        char cStart=s.charAt(0);
//        char cEnd = s.charAt(s.length()-1);
//        System.out.println(cStart);
//        System.out.println(cEnd);
//    }
//}



//import java.util.*;
//public class B {
//    public static void main(String args[]) {
//        Scanner read=new Scanner(System.in);
//        CalendarBean cb=new CalendarBean();
//        int year=2000,month=1;
//        System.out.println("输入年:");
//        year=read.nextInt();
//        System.out.println("输入月:");
//        month=read.nextInt();
//        cb.setYear(year);
//        cb.setMonth(month);
//        String [] a= cb.getCalendar();
//        char [] str="日一二三四五六".toCharArray();
//        for(char c:str) {
//            System.out.printf("%3c",c);
//        }
//        for(int i=0;i<a.length;i++) {
//            if(i%7==0)
//                System.out.println("");
//            System.out.printf("%4s",a[i]);
//        }
//    }
//}
//class CalendarBean {
//    String [] day;
//    int year=0,month=0;
//    public void setYear(int year) {
//        this.year=year;
//    }
//    public void setMonth(int month) {
//        this.month=month;
//    }
//    public String [] getCalendar() {
//        String [] a=new String[42];
//        Calendar rili=Calendar.getInstance();
//        rili.set(year,month-1,1);
//        int weekDay=rili.get(Calendar.DAY_OF_WEEK)-1;
//        int day=0;
//        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
//            day=31;
//        if(month==4||month==6||month==9||month==11)
//            day=30;
//        if(month==2) {
//            if(((year%4==0)&&(year%100!=0))||(year%400==0))
//                day=29;
//            else
//                day=28;
//        }
//        for(int i=0;i<weekDay;i++)
//            a[i]=" ";
//        for(int i=weekDay,n=1;i<weekDay+day;i++) {
//            a[i]=String.valueOf(n) ;
//            n++;
//        }
//        for(int i=weekDay+day;i<a.length;i++)
//            a[i]=" ";
//        return a;
//    }
//}
//




//import java.util.*;
//public class B {
//    public static void main (String args[ ]) {
//        Scanner read=new Scanner(System.in);
//        int year1,month1,day1,year2,month2,day2;
//        System.out.println("输入第一个日期的年、月、日:");
//        year1=read.nextInt();
//        month1=read.nextInt();
//        day1=read.nextInt();
//        System.out.println("输入第二个日期的年月日:");
//        year2=read.nextInt();
//        month2=read.nextInt();
//        day2=read.nextInt();
//        Calendar calendar=Calendar.getInstance();
//        calendar.set(year1,month1-1,day1);
//        long timeYear1=calendar.getTimeInMillis();
//        calendar.set(year2,month2-1,day2);
//        long timeYear2=calendar.getTimeInMillis();
//        long 相隔天数=Math.abs((timeYear1-timeYear2)/(1000*60*60*24));
//        System.out.println(""+year1+"年"+month1+"月"+day1+"日和"+
//                year2+"年"+month2+"月"+day2+"日相隔"+相隔天数+"天");
//    }
//}
