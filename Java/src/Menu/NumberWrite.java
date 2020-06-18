//package Menu;
//
//import java.io.*;
//
//public class  NumberWrite {
//    public static void main (String args[]) {
//        try {
//            FileOutputStream fos = new FileOutputStream("out.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            PrintStream ps = new PrintStream(bos);
//            for (int i = 0; i < 100; i++) {
//                int num = (int) (Math.random() * 1001) + 1000;
//                ps.println(num);
//            }
//            ps.close();
//            bos.close();
//            fos.close();
//        } catch (IOException e) {
//        }
//    }
//}
//    class NumberRead {
//        public static void main (String args[]) {
//            try {
//                FileReader fis = new FileReader("out.txt");
//                BufferedReader br = new BufferedReader(fis);
//                int data[] = new int[100];
//                String s = null;
//                for (int i = 0; i < 100; i++) {
//                    s = br.readLine();
//                    int n = Integer.parseInt(s);
//                    data[i] = n;
//                }
//                br.close();
//                for (int i = data.length - 1; i >= 0; i--) {
//                    for (int j = 0; j < i; j++) {
//                        if (data[j] > data[j + 1]) {
//                            int temp = data[j];
//                            data[j] = data[j + 1];
//                            data[j + 1] = temp;
//                        }
//                    }
//                }
//                FileOutputStream fos = new FileOutputStream("out.txt");
//                BufferedOutputStream bos = new BufferedOutputStream(fos);
//                PrintStream ps = new PrintStream(bos);
//                for (int i = 0; i < data.length; i++) {
//                    ps.println(data[i]);
//                }
//                br.close();
//                fis.close();
//                ps.close();
//            } catch (IOException e) {
//            }
//        }
//    }
//
