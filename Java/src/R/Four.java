package R;

//public class Four {
//    public static void main (String[] args) {
//        String s = "ab123you";
//        String regex = "[^0123456789]+";
//        s = s.replaceAll(regex,"");
//        System.out.println(s);
//    }
//}



//import java.util.*;
//public class Four{
//    public static void main (String[] args) {
//        String s = "数学87分，物理76分，英语96分";
//        Scanner sc = new Scanner(s);
//        sc.useDelimiter("[^0123456789.]+");
//        double sum = 0;
//        int count = 0;
//        while(sc.hasNext()){
//            try{
//                double score = sc.nextDouble();
//                sum = sum+score;
//                count++;
//                System.out.println(score);
//            }
//            catch(InputMismatchException exp){
//                String t = sc.next();
//            }
//        }
//        System.out.println("总成绩："+sum);
//        System.out.println("平均成绩："+sum/count);
//    }
//}



//import java.io.*;
//public class Four{
//    public static void main (String[] args) {
//        File f = new File("E:\\practice","Four.java");
//        System.out.println(f.getName()+"是可读的吗："+f.canRead());
//        System.out.println(f.getName()+"的长度："+f.length());
//        System.out.println(f.getName()+"的绝对路径："+f.getAbsolutePath());
//        File file = new File("new.txt");
//        System.out.println("在当前目录下创建新文件"+file.getName());
//        if(!file.exists()){
//            try{
//                file.createNewFile();
//                System.out.println("创建成功");
//            }
//            catch(IOException exp){
//
//            }
//        }
//    }
//}



//import java.io.*;
//class FileAccept implements FilenameFilter{
//    private String extendName;
//    public void setExtendName(String s){
//        extendName = "."+s;
//    }
//    public boolean accept(File dir,String name){
//        return name.endsWith(extendName);
//    }
//}
//
//public class Four{
//    public static void main (String[] args) {
//        File dir = new File(".");
//        FileAccept fileAccept = new FileAccept();
//        fileAccept.setExtendName("java");
//        String fileName[] = dir.list(fileAccept);
//        for(String name:fileName){
//            System.out.println(name);
//        }
//    }
//}



//import java.io.*;
//public class Four{
//    public static void main (String[] args) {
//        try{
//            Runtime ce = Runtime.getRuntime();
//            File file = new File("D:/","QQPCTray");
//            ce.exec(file.getAbsolutePath());
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}



//import java.io.*;
//public class Four{
//    public static void main (String[] args) {
//        int n = -1;
//        byte []a = new byte[100];
//        try{
//            File file = new File("Four.java");
//            FileInputStream in = new FileInputStream(file);
//            while((n = in.read(a,0,100))!=-1){
//                String s = new String(a,0,n);
//                System.out.println(s);
//            }
//        }
//        catch(IOException e){
//            System.out.println("File read Error"+e);
//        }
//    }
//}



