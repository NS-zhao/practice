package ideal;

//import java.util.*;
//public class C {
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



//import java.lang.Math;
//public class C {
//    public static void main (String args[ ]) {
//        double a=Math.max(50,10);
//        System.out.println(a);
//        a=Math.abs(-100);
//        System.out.println(a);
//        a=Math.min(10,50);
//        System.out.println(a);
//        a=Math.sqrt(16);
//        System.out.println(a);
//        a=Math.log(8);
//        System.out.println(a);
//        a=Math.pow(2,5);
//        System.out.println(a);
//        a=Math.sin(1);
//        System.out.println(a);
//        a=Math.asin(1);
//        System.out.println(a);
//    }
//}
//





//import java.util.*;
//public class C {
//    public static void main(String args[]) {
//        String cost = "数学87分，物理76分，英语96分";
//        Scanner scanner = new Scanner(cost);
//        scanner.useDelimiter("[^0123456789.]+");
//        double sum=0;
//        int count =0;
//        while(scanner.hasNext()){
//            try{  double score = scanner.nextDouble();
//                count++;
//                sum = sum+score;
//                System.out.println(score);
//            }
//            catch(InputMismatchException exp){
//                String t = scanner.next();
//            }
//        }
//        System.out.println("总分:"+sum+"分");
//        System.out.println("平均分:"+sum/count+"分");
//    }
//}
