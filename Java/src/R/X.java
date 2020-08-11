package R;

//class Goods{
//    boolean isDanger;
//    String name;
//    Goods(String s){
//        name = s;
//    }
//    public void setIsDanger(boolean boo){
//        isDanger = boo;
//    }
//    public boolean isDanger(){
//        return isDanger;
//    }
//    public String getName(){
//        return name;
//    }
//}
//
//class DangerException extends Exception{
//    String message;
//    public DangerException(){
//        message = "危险品！";
//    }
//    public void toShow(){
//        System.out.println(message+" ");
//    }
//}
//
//class Machine{
//    public void checkBag(Goods goods) throws DangerException{
//        if(goods.isDanger()){
//            DangerException danger = new DangerException();
//            throw new DangerException();
//        }
//    }
//}
//
//public class X{
//    public static void main (String[] args) {
//        Machine machine = new Machine();
//        Goods apple = new Goods("苹果");
//        apple.setIsDanger(false);
//        Goods explosive = new Goods("炸药");
//        explosive.setIsDanger(true);
//        try{
//            machine.checkBag(explosive);
//            System.out.println(explosive.getName()+"检查通过");
//        }
//        catch (DangerException e){
//            e.toShow();
//            System.out.println(explosive.getName()+"被禁止！");
//        }
//        try{
//            machine.checkBag(apple);
//            System.out.println(apple.getName()+"检查通过");
//        }
//        catch (DangerException e){
//            e.toShow();
//            System.out.println(apple.getName()+"被禁止！");
//        }
//    }
//}



//public class X{
//    public static void main (String[] args) {
//        String s1 = new String("天道酬勤");
//        String s2 = new String("天道酬勤");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//        String s3 = "勇者无敌";
//        String s4 = "勇者无敌";
//        System.out.println(s4.equals(s4));
//        System.out.println(s3 == s4);
//    }
//}



//import java.util.Arrays;
//import java.util.*;
//
//class SortString{
//    public static void sort (String a[]) {
//        int count = 0;
//        for (int i = 0; i < a.length-1; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                if(a[j].compareTo(a[i])<0){
//                    count++;
//                    System.out.println("交换"+a[i]+"和"+a[j]);
//                    String temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                    System.out.println("第"+count+"次排序结果：");
//                    System.out.println(Arrays.toString(a));
//                }
//            }
//        }
//    }
//}
//
//public class X{
//    public static void main (String[] args) {
//        String []a = {"melon","apple","pear","banana"};
//        String []b = Arrays.copyOf(a,a.length);
//        System.out.println("使用用户编写的SortString类，按字典序排列数组a:");
//        SortString.sort(a);
//        System.out.println("排序结果是：");
//        for(String s:b){
//            System.out.print(" "+s);
//        }
//        System.out.println("");
//        System.out.println("使用类库中的Arrays类，按字典序排列数组a:");
//        Arrays.sort(b);
//        System.out.println("排序结果是：");
//        for(String s:b){
//            System.out.print(" "+s);
//        }
//    }
//}+