package zjm;

//import java. util .Scanner;
//public class S {
//    public static void main (String[] args) {
//        int[] arr = new int[10];
//        set(arr);
//        get(arr);
//        int max = max(arr);
//        System.out.println("该数组的最大值为: " + max);
//        int min = min(arr);
//        System.out.println("该数组的最小值为: " + min);
//        int sum = sum(arr);
//        System.out.println("该数组的和为: " + sum);
//        double avg = Avg(arr);
//        System.out.print("该数组的平均值为: " + avg);
//    }
//
//    public static void set (int[] arry) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("该数组有的长度为: " + arry.length);
//        for (int i = 0; i < arry.length; i++) {
//            System.out.print("请输入第" + (i + 1) + "个数:");
//            arry[i] = sc.nextInt();
//        }
//    }
//
//    public static void get (int[] arry) {
//        System.out.print("该数组为: [");
//        for (int i = 0; i < arry.length; i++) {
//            if (i < arry.length - 1) {
//                System.out.println(arry[i] + ",");
//            } else {
//                System.out.println(arry[i]);
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static int max (int[] arry) {
//        int Max = arry[0];
//        for (int i = 0; i < arry.length; i++) {
//            if (Max < arry[i]) {
//                Max = arry[i];
//            } else {
//
//            }
//
//        }
//        return Max;
//    }
//
//    public static int min (int[] arry) {
//        int Min = arry[0];
//        for (int i = 0; i < arry.length; i++) {
//            if (Min > arry[i]) {
//                Min = arry[i];
//            } else {
//            }
//        }
//        return Min;
//    }
//
//    public static int sum (int[] arry) {
//        int Sum = 0;
//        for (int i = 1; i < arry.length; i++) {
//            Sum = Sum + arry[i];
//        }
//        return Sum;
//    }
//
//    public static double Avg (int[] arry) {
//        int Sum = 0;
//        double Avg = 0;
//        for (int i = 1; i < arry.length; i++) {
//            Sum = Sum + arry[i];
//        }
//        Avg = Sum / arry.length;
//        return Sum;
//    }
//}



//public class S {
//    public static void main (String[] args) {
//        Student[] students = new Student[5];
//        students[0] = new Student("赵佳敏", 1831050395, 3);
//        students[1] = new Student("赵佳敏", 1831050395, 2);
//        students[2] = new Student("杨扬", 1831050397, 1);
//        students[3] = new Student("张雨蒙", 1831050398, 2);
//        students[4] = new Student("白珂瑶", 1831050399, 1);
//        System.out.println("----全部学生为----");
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("名字: " + students[i].getName() + "   学号:" + students[i].getId() + "  年级: " + students[i].getGrade());
//        }
//        System.out.print("-----现在开始输出三年级的学生----");
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getGrade() == 3) {
//                System.out.println("名字: " + students[i].getName() + "   学号:" + students[i].getId() );
//            }
//            else {
//            }
//        }
//    }
//}
//class Student {
//    private String name;
//    private int id;
//    private int grade;
//    public Student (String name, int id, int grade) {
//        this.name = name;
//        this.id = id;
//        this.grade = grade;
//    }
//    public String getName () {
//        return name;
//    }
//    public void setName (String name) {
//        this.name = name;
//    }
//    public int getId () {
//        return id;
//    }
//    public void setId (int id) {
//        this.id = id;
//    }
//    public int getGrade () {
//        return grade;
//    }
//    public void setGrade (int grade) {
//        this.grade = grade;
//    }
//}

