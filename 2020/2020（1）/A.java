package ideal;

//public class A {
//    public static void main(String[] args) {
//        String s1,s2;
//        s1 = new String("天道酬勤");
//        s2 = new String("天道酬勤");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//        String s3,s4;
//        s3 = new String("勇者无敌");
//        s4 = new String("勇者无敌");
//        System.out.println(s3.equals(s4));
//        System.out.println(s3 == s4);
//    }
//}




//import java.util.Arrays;
//import java.util.*;
//
//class SortString{
//    public static void sort(String a[]){
//        int count = 0;
//        for (int i = 0; i < a.length-1; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if(a[j].compareTo(a[i])<0){
//                    count++;
//                    System.out.printf("交换%s和%s",a[i],a[j]);
//                    String temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                    System.out.println("第"+count+"次排序结果:");
//                    System.out.println(Arrays.toString(a));
//                }
//            }
//
//        }
//    }
//}
//
//
//
//public class A{
//    public static void main(String[] args) {
//        String []a = {"melon","apple","pear","banana"};
//        String []b = Arrays.copyOf(a,a.length);
//        System.out.println("使用用户编写的SortString类，按字典排列数组a：");
//        SortString.sort(a);
//        System.out.println("排序结果是:");
//        for(String s:b){
//            System.out.print(" "+s);
//
//        }
//        System.out.println("");
//        System.out.println("使用类库中的Arrays类，按字典序排列数组b：");
//        Arrays.sort(b);
//        System.out.println("排序结果是：");
//        for(String s:b){
//            System.out.println(" "+s);
//        }
//    }
//}



//import java.util.Date;
//
//class TV{
//    String name;
//    public TV(){
//    }
//    public TV(String s){
//        name = s;
//    }
//    public String toString(){
//        String oldStr = super.toString();
//        return oldStr+"\n这是电视机，品牌是："+name;
//    }
//}
//
//public class A{
//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.toString());
//        TV tv = new TV("长虹电视");
//        System.out.println(tv.toString());
//    }
//}


//public class A{
//    public static void main(String[] args) {
//        char [] a,b,c;
//        String s = "2009年10月1日是国庆60周年";
//        a = new char[2];
//        s.getChars(11,13,a,0);
//        System.out.println(a);
//        c = "十一长假期间，学校都放假了".toCharArray();
//        for(char ch:c){
//            System.out.println(ch);
//        }
//    }
//}


//public class A{
//    public static void main(String[] args) {
//        String path = "c:\\book\\javabook\\Java Programmer.doc";
//        int index = path.indexOf("\\");
//        index = path.indexOf("\\",index);
//        String sub = path.substring(index);
//        System.out.println(sub);
//        index = path.lastIndexOf("\\");
//        sub = path.substring(index+1);
//        System.out.println(sub);
//        System.out.println(sub.contains("Programmer"));
//    }
//}



//public class A{
//    public static void main(String[] args) {
//        double aver = 0,sum = 0,item = 0;
//        boolean computable = true;
//        for(String s:args){
//            try{
//                item = Double.parseDouble(s);
//                sum = sum+item;
//            }
//            catch(NumberFormatException e){
//                System.out.println("您输入了非数字字符:"+e);
//                computable = false;
//            }
//        }
//        if(computable)
//            System.out.println("sum="+sum);
//    }
//}


//public class A{
//    public static void main(String[] args) {
//        byte d[] = "Java你好".getBytes();
//        System.out.println("数组d的长度是："+d.length);
//        String s = new String(d,6,2);
//        System.out.println(s);
//        s = new String(d,0,6);
//        System.out.println(s);
//    }
//}