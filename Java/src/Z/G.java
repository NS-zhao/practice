package Z;

//完数
//public class G {
//    public static void main (String[] args) {
//        int sum = 0,i,j;
//        for (i = 1; i < 1000; i++) {
//            for (j = 1,sum = 0; j < i; j++) {
//                if(i%j == 0){
//                    sum = sum+j;
//                }
//            }
//            if(sum == i) {
//                System.out.println("完数：" + i);
//            }
//        }
//    }
//}




//public class G{
//    public static void main (String[] args) {
//        int sum = 0,i,j;
//        for ( i = 1; i < 1000; i++) {
//            for ( j = 1,sum = 0; j < i; j++) {
//                if(i%j == 0){
//                    sum = sum+j;
//                }
//            }
//            if(sum == i){
//                System.out.println("完数："+i);
//            }
//        }
//    }
//}



//1+2+3+....+n<250
//public class G{
//    public static void main (String[] args) {
//        int sum = 0;
//        int n = 1;
//        for (int i = 1; i <= n; i++) {
//            sum = sum+i;
//            if(sum>250){
//                break;
//            }
//            n++;
//        }
//        System.out.println("符合条件的最大整数："+(n-1));
//    }
//}



//1!+2!+3!+...+n!<10000
//public class G{
//    public static void main (String[] args) {
//        int sum = 0;
//        int jiecheng = 1;
//        int n = 1;
//        while(true){
//            jiecheng = 1;
//            for (int i = 1; i <= n; i++) {
//                jiecheng = jiecheng*i;
//            }
//            sum = sum+jiecheng;
//            if(sum>10000){
//                break;
//            }
//            n++;
//        }
//        System.out.println("符合条件的最大整数："+(n-1));
//    }
//}



//abcd倒置输出
//import java.io.*;
//public class G{
//    public static void main (String[] args) {
//        File f = new File("mat.dat");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//                if(c<=255&&c>=0){
//                    System.out.print((char)c+" ");
//
//                }
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte cc[] = new byte[2];
//                    random.readFully(cc);
//                    System.out.print(new String(cc)+" ");
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}



//import java.io.*;
//public class G{
//    public static void main (String[] args) {
//        File f = new File("tom.dat");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//                if(c<=255&&c>=0){
//                    System.out.print((char)c+" ");
//                }
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte cc[] = new byte[2];
//                    random.readFully(cc);
//                    System.out.print(new String(cc)+" ");
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}