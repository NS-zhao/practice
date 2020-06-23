package zjm;

//import java.io.*;
//
//public class V{
//    public static void main(String args[]) {
//        try {
//            FileInputStream fis = new FileInputStream("out.dat");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            DataInputStream dis = new DataInputStream(bis);
//            int data[] = new int[100];
//            for (int i = 0; i < 100; i++) {
//                data[i] = dis.readInt();
//
//            }
//            dis.close();
//            for (int i = data.length - 1; i >= 0; i--) {
//                for (int j = 0; j < i; j++) {
//                    if (data[j] < data[j + 1]) {
//                        int temp = data[j];
//                        data[j] = data[j + 1];
//                        data[j + 1] = temp;
//                    }
//                }
//                System.out.print(data[i] + ",");
//            }
//            FileOutputStream fos = new FileOutputStream("sort.dat");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            DataOutputStream dos = new DataOutputStream(bos);
//            for (int i = 0; i < data.length; i++) {
//                dos.writeInt(data[i]);
//            }
//            dos.close();
//            bos.close();
//            fos.close();
//        }
//        catch(IOException e){
//
//        }
//    }
//}




//import java.io.*;
//class Student implements Serializable {
//    int age, code;
//    String name, speciality;
//
//    public Student (String name, int age, int code, String speciality) {
//        this.age = age;
//        this.code = code;
//        this.name = name;
//        this.speciality = speciality;
//    }
//}
//    public class V {
//        public static void main (String args[]) throws Exception {
//            writeObject();
//            readObject();
//        }
//
//        public static void writeObject () throws IOException {
//            Student student1 = new Student("赵佳敏", 19, 1831050476, "电子商务");
//            FileOutputStream fileWrite = new FileOutputStream("student.dat");
//
//            ObjectOutputStream objectWrite = new ObjectOutputStream(fileWrite);
//            objectWrite.writeObject(student1);
//            objectWrite.close();
//        }
//
//        public static void readObject () throws IOException, Exception {
//            FileInputStream fileRead = new FileInputStream("student.dat");
//            ObjectInputStream objectRead = new ObjectInputStream(fileRead);
//            Student studentRead = (Student) objectRead.readObject();
//            System.out.println("姓名: " + studentRead.name);
//            System.out.println("年龄:" + studentRead.age);
//            System.out.println("学 号:" + studentRead.code);
//            System.out.println("专业: " + studentRead.speciality);
//            objectRead.close();
//        }
//    }



//public class V {
//    public static void main (String args[]) {
//        Speakb speakb;
//        Speaknumber speaknumber;
//        speakb = new Speakb();
//        speaknumber = new Speaknumber();
//        speaknumber.start();
//        speakb.start();
//        for (int i = 1; i <= 100; i++) {
//            System.out.print("a ");
//        }
//    }
//}
//    class Speakb extends Thread {
//        public void run () {
//            for (int i = 1; i <= 100; i++) {
//                System.out.print("b ");
//            }
//        }
//    }
//    class Speaknumber extends Thread {
//        public void run () {
//            for (int i = 1; i <= 100; i++) {
//                System.out.print(i + " ");
//            }
//        }
//    }