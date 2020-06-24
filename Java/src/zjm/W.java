package zjm;

//import java.io.*;
//
//public class W {
//    public static void main (String args[]) {
//        try {
//            FileOutputStream fos = new FileOutputStream("out.dat");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            DataOutputStream dos = new DataOutputStream(bos);
//            for (int i = 0; i < 100; i++) {
//                int num = (int) (Math.random() * 1001) + 1000;
//                System.out.print(num + ",");
//                dos.writeInt(num);
//            }
//            dos.close();
//            bos.close();
//            fos.close();
//        } catch (IOException e) {
//
//        }
//    }
//}




//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class W {
//    public static void main (String[] args) {
//        Printer printer = new Printer();
//        new Thread(() -> {
//            for (int i = 1; i < 53; i++) {
//                try {
//                    printer.printlnt(i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "num").start();
//        new Thread(() -> {
//            for (char ch = 'A'; ch < 'Z' + 1; ch++) {
//                try {
//                    printer.printChar(ch);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "char").start();
//    }
//}
//class Printer{
//    int index = 1;
//    Lock lock;
//
//    Condition charCondition = lock.newCondition();
//    Condition intCondition = lock.newCondition();
//    public void printlnt(int i) throws InterruptedException {
//        lock.lock();
//        try {
//            while (index % 3 == 0) {
//                intCondition.await();
//            }
//            System.out.print(i);
//            index++;
//            charCondition.signal();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }
//    public void printChar(char ch) throws InterruptedException {
//        lock.lock();
//        try {
//            while (index % 3 != 0) {
//                charCondition.await();
//            }
//                System.out.print(ch);
//                index++;
//                intCondition.signal();
//            } catch(Exception e){
//                e.printStackTrace();
//            } finally{
//                lock.unlock();
//            }
//        }
//    }



//public class W {
//    public static void main (String[] args) {
//        Object ob = new Object();
//        new Thread(new W().new ThreadA(ob)).start();
//        new Thread(new W().new ThreadB(ob)).start();
//    }
//
//    class ThreadA implements Runnable {
//        private Object object = null;
//
//        public ThreadA (Object o) {
//            this.object = o;
//        }
//
//        public void run () {
//            synchronized (this.object) {
//                for (int i = 1; i <= 27; i++) {
//                    System.out.print(i);
//                    object.notify();
//                    try {
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
//
//    class ThreadB implements Runnable {
//        private Object object = null;
//
//        public ThreadB (Object о) {
//            this.object = о;
//        }
//
//        public void run () {
//            synchronized (object) {
//                for (int i = 0; i < 27; i++) {
//                    System.out.print((char) +(65 + i));
//                    object.notify();
//                    try {
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
//}
