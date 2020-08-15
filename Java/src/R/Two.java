package R;

//import java.util.regex.*;
//public class Two {
//    public static void main (String[] args) {
//        Pattern p;
//        Matcher m;
//        String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
//        p = Pattern.compile(regex);
//        String s = "清华大学网址：www.tsinghua.edu.cn,邮电出版社的网址：http://www.ptpress.com";
//        m = p.matcher(s);
//        while (m.find()){
//            String str = m.group();
//            System.out.println(str);
//        }
//        System.out.println("剔除字符串中的网站地址后得到的字符串：");
//        String result = m.replaceAll("");
//        System.out.println(result);
//    }
//}



//import java.util.*;
//public class Two{
//    public static void main (String[] args) {
//        String cost = "TV cost 876 dollar,Computer cost 2398 dollar,telephone cost 1278 dollar";
//        Scanner scanner = new Scanner(cost);
//        double sum = 0;
//        while(scanner.hasNext()){
//            try{
//                double price = scanner.nextDouble();
//                sum  = sum+price;
//                System.out.println(price);
//            }
//            catch(InputMismatchException exp){
//                String t = scanner.next();
//            }
//        }
//        System.out.println("总消费："+sum+"元");
//    }
//}



//import java.util.*;
//public class Two{
//    public static void main (String[] args) {
//        String cost = "话费清单：市话费76.89元，长途话费167.38元短信费12.68元";
//        Scanner scanner = new Scanner(cost);
//        scanner.useDelimiter("[^0123456789.]+");
//        double sum = 0;
//        while(scanner.hasNext()){
//            try{
//                double price = scanner.nextDouble();
//                sum = sum+price;
//                System.out.println(price);
//            }
//            catch(InputMismatchException exp){
//                String t = scanner.next();
//            }
//        }
//        System.out.println("总通信费用："+sum+"元");
//    }
//}



//import java.util.*;
//public class Two{
//    public static void main (String[] args) {
//        String s1 = "苹果：56.7圆，香蕉：12圆，芒果：19.8圆";
//        String s2 = "酱油：6.7圆，精盐：0.8圆，榨菜：9.8圆";
//        ComputePice jisuan = new ComputePice();
//        String regex = "[^0123456789.]+";
//        String s1_number = s1.replaceAll(regex,"*");
//        double priceSum = jisuan.compute(s1_number,"*");
//        System.out.println(s1+"   价格总和："+priceSum);
//        String s2_number = s2.replaceAll(regex,"#");
//        priceSum = jisuan.compute(s2_number,"#");
//        System.out.println(s2+"   价格总和："+priceSum);
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



//import java.util.*;
//public class Two{
//    public static void main (String[] args) {
//        String s = "酱油：6.7圆，精盐：0.8圆，榨菜：9.8圆";
//        ComputePice jisuan = new ComputePice();
//        String regex = "[0123456789.]+圆";
//        String s_number = s.replaceAll(regex,"");
//
//        System.out.println(s_number);
//        s_number = s_number.replaceAll("："," ");
//        s_number = s_number.replaceAll("，"," ");
//        System.out.println(s_number);
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