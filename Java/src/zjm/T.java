//package zjm;
//
//import java.io.BufferedWriter;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Random;
//public class T {
//    private static final int count = 100;
//    public static void main(String[] args) throws Exception {
//        Random r = new Random();
//        File dataFile = new File("E:/out.dat");
//        DataOutputStream dos = null;
//        dos = new DataOutputStream(new FileOutputStream(dataFile));
//        DataInputStream ios = null;
//        ios = new DataInputStream(new FileInputStream(dataFile));
//        for(int i = 0;i < count; i++) {
//// 1000<=randomNum<= 2000;
//            int randomNum = r.nextInt(1000) + 1001;
//            try {
//                dos.writeInt(randomNum);
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
////打印出前十个
//            if(i < 10)
//                System.out.println(randomNum);
//        }
//        for(int j = 0 ; j < 10; j ++) {
////然后读进来
////打印出 前十个,对比一下 发现一样的
//            System.out.println(ios.readInt());
//        }
//    }
//}




//public class T {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new thread("A"));
//        Thread t2 = new Thread(new thread("B"));
//        Thread t3 = new Thread(new thread("C"));
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
//class thread implements Runnable {
//    private String name;
//    static int n = 1;
//    public thread(String name) {
//        this.name = name;
//    }
//    public void run() {
//        while (true) {
//            synchronized (this) {
//                if (n > 100) {
//                    break;
//                }
//                if (name.equals("A")) {
//                    if (n % 3 == 1) {
//                        System.out.println(name + "输出：" + n);
//                        n++;
//                    }
//                }
//                if (name.equals("B")) {
//                    if (n % 3 == 2) {
//                        System.out.println(name + "输出：" + n);
//                        n++;
//                    }
//                }
//                if (name.equals("C")) {
//                    if (n % 3 == 0) {
//                        System.out.println(name + "输出：" + n);
//                        n++;
//                    }
//                }
//            }
//        }
//    }
//}