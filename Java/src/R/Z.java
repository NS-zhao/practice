package R;

//import java.util.Scanner;

//public class Z{
//    public static void main (String[] args) {
//        String regex = "[a-zA-Z]+";
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if(str.matches(regex)){
//            System.out.println(str+"中的字符都是英文字母");
//        }
//    }
//}



//public class Z{
//    public static void main (String[] args) {
//        String str = "欢迎大家访问http://www.xiaojiang.cn了解、参观公司";
//        String regex = "(http://www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
//        System.out.println("剔除str中的网站链接信息后得到的字符串："+str);
//        str = str.replaceAll(regex,"");
//        System.out.println(str);
//    }
//}



//import java.util.Scanner;
//public class Z{
//    public static void main (String[] args) {
//        System.out.println("一行文本");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String regex = "[\\s\\d\\p{Punct}]+";
//        String words[] = str.split(regex);
//        for (int i = 0; i < words.length; i++) {
//            int m = i+1;
//            System.out.println("单词"+m+":"+words[i]);
//        }
//    }
//}



//public class Z{
//    public static void main (String[] args) {
//        StringBuffer str = new StringBuffer();
//        str.append("大家好");
//        System.out.println("str:"+str);
//        System.out.println("length:"+str.length());
//        System.out.println("capacity:"+str.capacity());
//        str.setCharAt(0,'w');
//        str.setCharAt(1,'e');
//        System.out.println(str);
//        str.insert(2," are all");
//        System.out.println(str);
//        int index = str.indexOf("好");
//        str.replace(index,str.length()," right");
//        System.out.println(str);
//    }
//}



//import java.util.*;
//public class Z{
//    public static void main (String[] args) {
//        String s = "you are welcome(thank you),nice to meet you";
//        StringTokenizer fenxi = new StringTokenizer(s,"() ,");
//        int number = fenxi.countTokens();
//        while(fenxi.hasMoreTokens()){
//            String str = fenxi.nextToken();
//            System.out.println(str+" ");
//        }
//        System.out.println("共有单词："+number+"个");
//    }
//}



//import java.util.Date;
//import java.text.SimpleDateFormat;
//public class Z{
//    public static void main (String[] args) {
//        Date nowTime = new Date();
//        System.out.println(nowTime);
//        String pattern = "yyy-MM-dd";
//        SimpleDateFormat SDF = new SimpleDateFormat(pattern);
//        String timePattern = SDF.format(nowTime);
//        System.out.println(timePattern);
//        pattern = "G yyy 年 MMMd 日 E HH 时mm分ss秒";
//        SDF = new SimpleDateFormat("G yyy 年 MMMd 日 E HH 时mm分ss秒");
//        timePattern = SDF.format(nowTime);
//        System.out.println(timePattern);
//        long time = System.currentTimeMillis();
//        System.out.println("现在是公元后："+time+"毫秒");
//    }
//}



//import java.util.*;
//import static java.util.Calendar.*;
//public class Z{
//    public static void main (String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        String 年 = String.valueOf(calendar.get(YEAR));
//        String 月 = String.valueOf(calendar.get(MONTH)+1);
//        String 日 = String.valueOf(calendar.get(DAY_OF_MONTH));
//        int hour = calendar.get(HOUR_OF_DAY);
//        int minute = calendar.get(MINUTE);
//        int second = calendar.get(SECOND);
//        System.out.println("现在的时间是：");
//        System.out.print(" "+年+"年"+月+"月"+日+"日");
//        System.out.println(" "+hour+"时"+minute+"分"+second+"秒");
//        int year = 1949;
//        int month = 9;
//        int day = 1;
//        calendar.set(year,month,day);
//        Date date = calendar.getTime();
//        System.out.println(date);
//        long time1 = calendar.getTimeInMillis();
//        year = 2009;
//        month = 9;
//        day = 1;
//        calendar.set(year,month-1,day);
//        long time2 = calendar.getTimeInMillis();
//        long 相隔天数 = (time1-time2)/(1000*60*60*24);
//        System.out.println("2009-10-1和1949-10-1相隔"+相隔天数);
//    }
//}