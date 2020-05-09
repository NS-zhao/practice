package ideal;

//import java.util.Scanner;
//
//public class B {
//    public static void main(String[] args) {
//        String regex = "[a-zA-Z]+";
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if(str.matches(regex)){
//            System.out.println(str+"中的字符都是英文字母");
//        }
//    }
//}



//public class B{
//    public static void main(String[] args) {
//        String str = "欢迎大家访问http://www.xiaoqiang.cn了解、参观公司";
//        String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
//        System.out.printf("剔除\n\"%s\"\n中的网站链接信息后得到的字符串:\n",str);
//        str = str.replaceAll(regex,"");
//        System.out.println(str);
//    }
//}



//import java.util.Scanner;
//
//class EncryptAndDecrypt{
//    String encrpt(String sourceString,String password){
//        char[] p = password.toCharArray();
//        int n = p.length;
//        char [] c = sourceString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]+p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//    String decrypt(String sourceString,String password){
//        char[] p = password.toCharArray();
//        int n = p.length;
//        char [] c = sourceString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]-p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//}
//
//
//
//public class B{
//    public static void main(String[] args) {
//        String sourceString = "今晚十点进攻";
//        EncryptAndDecrypt person = new EncryptAndDecrypt();
//        System.out.println("输入密码加密:"+sourceString);
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//        String secret = person.encrpt(sourceString,password);
//        System.out.println("密文："+secret);
//        System.out.println("输入解密密码");
//        password = scanner.nextLine();
//        String source = person.decrypt(secret,password);
//        System.out.println("明文："+source);
//    }
//}




import java.util.Scanner;

public class B{
    public static void main(String[] args) {
        System.out.println("一行文本：");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "[\\s\\d\\p{Punct}]+";
        String word[] = str.split(regex);
        for (int i = 0; i < word.length; i++) {
            int m = i+1;
            System.out.println("单词"+m+":"+word[i]);
        }
    }
}