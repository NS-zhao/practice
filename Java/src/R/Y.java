package R;

//public class Y {
//    public static void main (String[] args) {
//        String tom = "I am a good cat";
//        System.out.println(tom.indexOf("a"));
//        System.out.println(tom.indexOf("good",2));
//        System.out.println(tom.indexOf("a",7));
//        System.out.println(tom.indexOf("w",2));
//    }
//}



//public class Y{
//    public static void main (String[] args) {
//        String path = "c:\\book\\javabook\\Java Programmer.doc";
//        int index = path.indexOf("\\");
//        index = path.indexOf("\\",index);
//        String sub = path.substring(index);
//        System.out.println(sub);
//        index = path.lastIndexOf("\\");
//        System.out.println(index);
//        sub = path.substring(index+1);
//        System.out.println(sub);
//        System.out.println(sub.contains("Programmer"));
//    }
//}



//public class Y{
//    public static void main (String[] args) {
//        double sum = 0;
//        double item = 0;
//        boolean compute = true;
//        for(String s:args){
//            try{
//                item = Double.parseDouble(s);
//                sum = sum+item;
//            }
//            catch(NumberFormatException e){
//                System.out.println("您键入了非数字字符："+e);
//                compute = false;
//            }
//        }
//        if(compute){
//            System.out.println("sum = "+sum);
//        }
//    }
//}



//import java.util.Date;
//
//class TV{
//    String name;
//    public TV(){
//
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
//public class Y{
//    public static void main (String[] args) {
//        Date date = new Date();
//        System.out.println(date.toString());
//        TV tv = new TV("长虹电视");
//        System.out.println(tv.toString());
//    }
//}



//public class Y{
//    public static void main (String[] args) {
//        char[] a,b,c;
//        String s = "2009年10月1日是国庆60周年";
//        a = new char[2];
//        s.getChars(11,13,a,0);
//        System.out.println(a);
//        c = "十一长假期间，学校都放假了".toCharArray();
//        for(char ch:c){
//            System.out.print(ch);
//        }
//    }
//}



//public class Y{
//    public static void main (String[] args) {
//        byte d[] = "Java你好".getBytes();
//        System.out.println("数组d的长度是："+d.length);
//        String s = new String(d,6,2);
//        System.out.println(s);
//        s = new String(d,0,6);
//        System.out.println(s);
//    }
//}




//import java.util.Scanner;
//
//class EncryptAndDecrypt{
//    String encrypt(String sourceString,String password){
//        char []p = password.toCharArray();
//        int n = p.length;
//        char []c = sourceString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]+p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//    String decrypt(String sourceString,String password){
//        char []p = password.toCharArray();
//        int n = p.length;
//        char []c = sourceString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]-p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//}
//
//public class Y{
//    public static void main (String[] args) {
//        String sourString = "今晚十点进攻";
//        EncryptAndDecrypt person = new EncryptAndDecrypt();
//        System.out.println("输入密码加密："+sourString);
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//        String secret = person.encrypt(sourString,password);
//        System.out.println("密文: "+secret);
//        System.out.println("输入解密密码：");
//        password = scanner.nextLine();
//        String source = person.decrypt(secret,password);
//        System.out.println("明文："+source);
//    }
//}