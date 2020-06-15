//package zjm;
//
//import java.net.*;
//import java.util.Scanner;
//import java.io.*;
//import java.util.*;
//import java.util.regex.Pattern;
//public class Q{
//    public static void main(String[] args) {
//        Socket socket=null;
//        DataInputStream in=null;
//        DataOutputStream out = null;
//        Thread thread;
//        while(true) {
//            System.out.println("输入账单");
//            Scanner scanner = new Scanner(System.in);
//            String s=scanner.nextLine();
//            try {
//                socket=new Socket("127.0.0.1",4001);
//                in =new DataInputStream(socket.getInputStream());
//                out = new DataOutputStream(socket.getOutputStream());
//                out.writeUTF(s);
//                String str=in.readUTF();
//                System.out.println("你的账单：\n账单"+str);
//            }
//            catch (IOException ee) {
//                System.out.println(ee);
//                socket=new Socket();
//            }
//        }
//    }
//}
//class Server {
//    public static void main(String[] args) {
//        ServerSocket server=null;
//        ServerThread thread;
//        Socket you = null;
//        while(true) {
//            try {
//                server = new ServerSocket(4001);
//            }
//            catch(IOException e1) {
//                System.out.println("正在监听");
//            }
//            try {
//                System.out.println("等待客户呼叫");
//                you=server.accept();
//                System.out.println("客户的地址："+you.getInetAddress());
//            }
//            catch(IOException e) {
//                System.out.println("正在等待客户");
//            }
//            if(you != null) {
//                new ServerThread(you).start();
//            }
//        }
//    }
//}
//class ServerThread extends Thread{
//    Socket socket;
//    DataOutputStream out = null;
//    DataInputStream in = null;
//    String s=null;
//    ServerThread(Socket t){
//        socket = t;
//        try {
//            out = new DataOutputStream(socket.getOutputStream());
//            in = new DataInputStream(socket.getInputStream());
//        }
//        catch(IOException e) {
//
//        }
//    }
//    public void run() {
//        while(true) {
//            try {
//                String s = in.readUTF();
//                Pattern p=Pattern.compile("[^0123456789.]+");
//                String[] str=p.split(s);
//                double sum = 0;
//                double[] num = new double[str.length];
//                for(int i=1;i<str.length;i++) {
//                    num[i]=Double.parseDouble(str[i]);
//                }
//                for(int i=1;i<str.length;i++) {
//                    System.out.println(num[i]);
//                    sum+=num[i];
//                }
//                System.out.println("本次总额:"+sum);
//                String st=s+"\n总额："+sum;
//                out.writeUTF(st);
//            }
//            catch(IOException e) {
//                System.out.println("客户离开");
//                return;
//            }
//        }
//    }
//}
