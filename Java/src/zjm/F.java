package zjm;

//import java.io.*;
//
//public class F {
//    public static void main(String[] args) {
//        File f = new File("E:\\ch10","Example10_1.java");
//        System.out.println(f.getName()+"是可读的吗："+f.canRead());
//        System.out.println(f.getName()+"的长度"+f.length());
//        System.out.println(f.getName()+"的绝对路径"+f.getAbsolutePath());
//        File file = new File("new.txt");
//        System.out.println("在当前目录下创建新文件"+file.getName());
//        if(!file.exists()){
//            try{
//                file.createNewFile();
//                System.out.println("创建成功");
//            }
//            catch (IOException exp){}
//        }
//    }
//}




//import java.io.*;
//
//public class F{
//    public static void main(String[] args) {
//        File dir = new File(".");
//        FileAccept fileAccept = new FileAccept();
//        fileAccept.setExtendName("java");
//        String fileName[] = dir.list(fileAccept);
//        for(String name:fileName){
//            System.out.println(name);
//        }
//    }
//}
//
//class FileAccept implements FilenameFilter{
//    private String extendName;
//    public void setExtendName(String s){
//        extendName = "."+s;
//    }
//    public boolean accept(File dir,String name){
//        return name.endsWith(extendName);
//    }
//}




//import java.io.*;
//
//public class F{
//    public static void main(String[] args) {
//        try{
//            Runtime ce = Runtime.getRuntime();
//            File file = new File("c:/windows","NotePad.exe");
//            ce.exec(file.getAbsolutePath());
//            file = new File("C:\\Program Files\\Internet Explore","IEXPLORE www.sohu.com");
//            ce.exec(file.getAbsolutePath());
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}




//import java.io.*;
//
//public class F{
//    public static void main(String[] args) {
//        int n = -1;
//        byte []a = new byte[100];
//        try{
//            File f = new File("10_1.java");
//            FileInputStream in = new FileInputStream(f);
//            while((n = in.read(a,0,100))!=-1){
//                String s = new String(a,0,n);
//                System.out.println(s);
//            }
//            in.close();
//        }
//        catch (IOException e){
//            System.out.println("File read Error"+e);
//        }
//    }
//}



//import java.io.*;
//
//public class F{
//    public static void main(String[] args) {
//        byte [] a = "国庆60周年".getBytes();
//        byte [] b = "十一快乐".getBytes();
//        try{
//            FileInputStream out = new FileInputStream("happy.txt");
//            out.write(a);
//            out.write(b,0,b.length);
//            out.close();
//        }
//        catch (IOException e){
//            System.out.println("Error"+e);
//        }
//    }
//}