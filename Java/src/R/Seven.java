package R;

//import java.io.*;
//class TV implements Serializable{
//    String name;
//    int price;
//    public void setName(String s){
//        name = s;
//    }
//    public void setPrice(int n){
//        price = n;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getPrice(){
//        return price;
//    }
//}
//
//public class Seven {
//    public static void main (String[] args) {
//        TV changhong = new TV();
//        changhong.setName("长虹电视");
//        changhong.setPrice(5678);
//        File file = new File("television.txt");
//        try{
//            FileOutputStream fileOut = new FileOutputStream(file);
//            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(changhong);
//            objectOut.close();
//            FileInputStream fileIn = new FileInputStream(file);
//            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//            TV xinfei = (TV)objectIn.readObject();
//            objectIn.close();
//            xinfei.setName("新飞电视");
//            xinfei.setPrice(6666);
//            System.out.println("changhong的名字："+changhong.getName());
//            System.out.println("changhong的价格："+changhong.getPrice());
//            System.out.println("xinfei的名字："+xinfei.getName());
//            System.out.println("xinfei的价格："+xinfei.getPrice());
//        }
//        catch (ClassNotFoundException event){
//            System.out.println("不能读出对象");
//        }
//        catch (IOException event){
//            System.out.println(event);
//        }
//    }
//}



//import java.io.*;
//import java.nio.channels.*;
//import java.util.Scanner;
//public class Seven{
//    public static void main (String[] args) {
//        File file = new File("Seven.java");
//        Scanner scanner = new Scanner(System.in);
//        try{
//            RandomAccessFile input = new RandomAccessFile(file,"rw");
//            FileChannel channel = input.getChannel();
//            FileLock lock = channel.tryLock();
//            System.out.println("输入要读取的行数：");
//            while(scanner.hasNextInt()){
//                int m = scanner.nextInt();
//                lock.release();
//                for (int i = 1; i <= m; i++) {
//                    String str = input.readLine();
//                    System.out.println(str);
//                }
//                lock = channel.tryLock();
//                System.out.println("输入要读取的行数：");
//            }
//        }
//        catch(IOException event){
//            System.out.println(event);
//        }
//    }
//}



//import java.util.*;
//import java.io.*;
//public class Seven{
//    public static void main (String[] args) {
//        File file = new File("cost.txt");
//        Scanner sc = null;
//        int sum = 0;
//        try{
//            sc = new Scanner(file);
//            while(sc.hasNext()){
//                try{
//                    int price = sc.nextInt();
//                    sum = sum+price;
//                    System.out.println(price);
//                }
//                catch (InputMismatchException exp){
//                    String t = sc.next();
//                }
//            }
//            System.out.println("Total Cost:"+sum+"dollar");
//        }
//        catch (Exception exp){
//            System.out.println(exp);
//        }
//    }
//}



//import java.io.*;
//import java.util.*;
//public class Seven{
//    public static void main (String[] args) {
//        File file = new File("student.txt");
//        Scanner sc = null;
//        int count = 0;
//        double sum = 0;
//        try{
//            double score = 0;
//            sc = new Scanner(file);
//            sc.useDelimiter("[^0123456789.]+");
//            while(sc.hasNextDouble()){
//                score = sc.nextDouble();
//                count++;
//                sum = sum+score;
//                System.out.println(score);
//            }
//            double aver = sum/count;
//            System.out.println("平均成绩："+aver);
//        }
//        catch (Exception exp){
//            System.out.println(exp);
//        }
//    }
//}