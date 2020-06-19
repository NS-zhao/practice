package zjm;

//public class U implements Runnable {
//
//    private String name;
//    private Object prev;
//    private Object self;
//
//    public U(String name, Object prev, Object self) {
//        this.name = name;
//        this.prev = prev;
//        this.self = self;
//    }
//
//    @Override
//    public void run() {
//
//        int i = 1;
//        while (i <= 100) {
//            synchronized (prev) {
//                synchronized (self) {
//                    System.out.print(name);
//
//                    self.notifyAll();
//                }
//
//                try {
//                    prev.wait();
//                } catch (InterruptedException e) {
//
//                }
//            }
//        }
//
//    }
//
//
//    public static void main(String []args) throws InterruptedException {
//
//        Object a = new Object();
//        Object b = new Object();
//        Object c = new Object();
//
//        U threadA = new U("A", c, a);
//        U threadB = new U("B", a, b);
//        U threadC = new U("C", b, c);
//
//        Thread A = new Thread(threadA);
//        A.start();
//        Thread B = new Thread(threadB);
//        B.start();
//        Thread C = new Thread(threadC);
//        C.start();
//
//        A.interrupt();
//        B.interrupt();
//        C.interrupt();
//    }
//}
//
//

//public class U implements Runnable {
//
//    private String name;
//    private Object prev;
//    private Object self;
//
//    public U(String name, Object prev, Object self) {
//        this.name = name;
//        this.prev = prev;
//        this.self = self;
//    }
//
//    @Override
//    public void run() {
//
//        int i = 1;
//        while (i <= 100) {
//            synchronized (prev) {
//                synchronized (self) {
//                    System.out.print(name);
//
//                    self.notifyAll();
//                }
//
//                try {
//                    prev.wait();
//                } catch (InterruptedException e) {
//
//                }
//            }
//        }
//
//    }
//    class ThreadTest {
//        volatile int flag=0;
//        public void runThread() throws InterruptedException{
//            Thread t1=new Thread(new Thread1());
//            Thread t2=new Thread(new Thread2());
//            t1.start();
//            t2.start();
//        }
//        public class Thread1 implements Runnable{
//
//            public void run() {
//                int i=0;
//                while(i<=99){
//                    if(flag==0)
//                    {
//                        System.out.println("t1="+i+"flag="+flag);
//                        i+=2;
//                        flag=1;
//                    }
//                }
//            }
//
//        }
//
//        public class Thread2 implements Runnable{
//
//            public void run() {
//                int i=1;
//                while(i<=99){
//                    if(flag==1)
//                    {
//                        System.out.println("t2="+i+"flag="+flag);
//                        i+=2;
//                        flag=0;
//                    }
//                }
//            }
//
//        }
//    }
//
//
//    public static void main(String []args) throws InterruptedException {
//
//        Object a = new Object();
//        Object b = new Object();
//        Object c = new Object();
//
//        U threadA = new U("A", c, a);
//        U threadB = new U("B", a, b);
//        //ThreadTest threadC = new ThreadTest();
//
//        Thread A = new Thread(threadA);
//        A.start();
//        //Thread.sleep(100);
//        Thread B = new Thread(threadB);
//        B.start();
//        //Thread.sleep(100);
////        ThreadTest C = new ThreadTest(threadC);
//
//        Thread.sleep(3000);
//
//        A.interrupt();
//        B.interrupt();
//    }
//}
//



//public class ThreadTest {
//    volatile int flag=0;
//    public void runThread() throws InterruptedException{
//        Thread t1=new Thread(new Thread1());
//        Thread t2=new Thread(new Thread2());
//        t1.start();
//        t2.start();
//    }
//    public class Thread1 implements Runnable{
//
//        public void run() {
//            int i=0;
//            while(i<=99){
//                if(flag==0)
//                {
//                    System.out.println("t1="+i+"flag="+flag);
//                    i+=2;
//                    flag=1;
//                }
//            }
//        }
//
//    }
//
//    public class Thread2 implements Runnable{
//
//        public void run() {
//            int i=1;
//            while(i<=99){
//                if(flag==1)
//                {
//                    System.out.println("t2="+i+"flag="+flag);
//                    i+=2;
//                    flag=0;
//                }
//            }
//        }
//
//    }
//}