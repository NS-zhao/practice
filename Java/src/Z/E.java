package Z;

//import java.io.*;
//public class E {
//    public static void main (String[] args) {
//        RandomAccessFile inAndOut = null;
//        //int data[] = {1,2,3,4,5,6,7,8,9,10};
//        String str = "abcd";
//        try{
//            inAndOut = new RandomAccessFile("mat.dat","rw");
//            for (int i = 0; i < str.length(); i++) {
//                inAndOut.writeChars(str);
//            }
//            for (long i = str.length()-1; i >= 0; i--) {
//                inAndOut.seek(i);
//                System.out.print(inAndOut.readChar()+" ");
//            }
//            inAndOut.close();
//        }
//        catch (IOException e){
//
//        }
//    }
//}



//import java.io.*;
//public class E{
//    public static void main (String[] args) {
//        File f = new File("E.java");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//                if(c<=255&&c>=0)
//                    System.out.println((char)c);
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte cc[] = new byte[2];
//                    random.readFully(cc);
//                    System.out.println(new String(cc));
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}



//import java.io.*;
//public class E{
//    public static void main (String[] args) {
//        File f = new File("E.java");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//                if(c<=255&&c>=0)
//                    System.out.println((char)c);
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte cc[] = new byte[2];
//                    random.readFully(cc);
//                    System.out.println(new String(cc));
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}




//import java.io.*;
//public class E{
//    public static void main (String[] args) {
//        File f = new File("E.java");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//
//                if(m<=255&&m>=0){
//                    System.out.println((char)c);
//                }
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte cc[] = new byte[2];
//                    System.out.println(new String(cc));
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}



//import java.io.*;
//public class E{
//    public static void main (String[] args) {
//        File f = new File("tom.dat");
//        try{
//            RandomAccessFile random = new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m = random.length();
//            while(m>=0){
//                m = m-1;
//                random.seek(m);
//                int c = random.readByte();
//                if(m<=255&&m>=0){
//                    System.out.println((char)c+" ");
//                }
//                else{
//                    m = m-1;
//                    random.seek(m);
//                    byte []cc = new byte[2];
//                    System.out.println(new String(cc));
//                }
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}