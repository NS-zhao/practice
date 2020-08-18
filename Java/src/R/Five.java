package R;

//import java.io.*;
//public class Five {
//    public static void main (String[] args) {
//        byte []a = "国庆60周年".getBytes();
//        byte []b = "十一快乐".getBytes();
//        try{
//            FileOutputStream out = new FileOutputStream("happy.txt");
//            out.write(a);
//            out.write(b,0,b.length);
//            out.close();
//        }
//        catch(IOException e){
//            System.out.println("Error"+e);
//        }
//    }
//}



//import java.io.*;
//public class Five{
//    public static void main (String[] args) {
//        String content = "broadsword勇者无敌";
//        try{
//            File f = new File("hello.txt");
//            char []a = content.toCharArray();
//            FileWriter out = new FileWriter(f);
//            out.write(a,0,a.length);
//            out.close();
//            FileReader in = new FileReader(f);
//            StringBuffer s = new StringBuffer();
//            char tom[] = new char[10];
//            int n = -1;
//            while((n = in.read(tom,0,10))!=-1){
//                String temp = new String(tom,0,n);
//                s.append(temp);
//            }
//            in.close();
//            System.out.println(new String(s));
//        }
//        catch(IOException e){
//            System.out.println(e.toString());
//        }
//    }
//}



//import java.io.*;
//public class Five{
//    public static void main (String[] args) {
//        File file = new File("Student.txt");
//        String contend[] = {"商品列表：","电视机，2567元/台","洗衣机，3562.元/台","冰箱，6573元/台"};
//        try{
//            FileWriter outOne = new FileWriter(file);
//            BufferedWriter outTwo = new BufferedWriter(outOne);
//            for(String str:contend){
//                outTwo.write(str);
//                outTwo.newLine();
//            }
//            outTwo.close();
//            outOne.close();
//            FileReader inOne = new FileReader(file);
//            BufferedReader inTwo = new BufferedReader(inOne);
//            String s = null;
//            while((s = inTwo.readLine())!=null){
//                System.out.println(s);
//            }
//            inOne.close();
//            inTwo.close();
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }
//    }
//}



//import java.io.*;
//public class Five{
//    public static void main (String[] args) {
//        RandomAccessFile inAndOut = null;
//        int data[] = {1,2,3,4,5,6,7,8,9,10};
//        try{
//            inAndOut = new RandomAccessFile("tom.txt","rw");
//            for (int i = 0; i < data.length; i++) {
//                inAndOut.writeInt(data[i]);
//            }
//            for (long i = data.length; i >= 0; i--) {
//                inAndOut.seek(i*4);
//                System.out.printf("\t%d",inAndOut.readInt());
//            }
//            inAndOut.close();
//        }
//        catch(IOException e){
//
//        }
//    }
//}



//import java.io.*;
//public class Five{
//    public static void main (String[] args) {
//        RandomAccessFile in = null;
//        try{
//            in = new RandomAccessFile("Five.java","rw");
//            long length = in.length();
//            long position = 0;
//            in.seek(position);
//            while(position<length){
//                String str = in.readLine();
//                byte b[] = str.getBytes("iso-8859-1");
//                str = new String(b);
//                position = in.getFilePointer();
//                System.out.println(str);
//            }
//        }
//        catch (IOException e){
//
//        }
//    }
//}