package ideal;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//
//class Village {
//    static int terrAmount;     //模拟森林中树木的数量
//    int peopleNumber;          //村庄的人数
//    String name;               //村庄的名字
//    Village(String s){
//        name = s;
//    }
//    void treePlanting(int n){
//        terrAmount=terrAmount+n;
//        System.out.println(name+"植树"+n+"棵");
//    }
//    void fellTree(int n){
//        if(terrAmount-n>=0){
//            terrAmount = terrAmount-n;
//            System.out.println(name+"伐树"+n+"棵");
//        }else{
//            System.out.println("无树木可伐");
//        }
//    }
//    static int lookTreeAmount(){
//        return terrAmount;
//    }
//    void addPeopleNumber(int n){
//        peopleNumber = peopleNumber+n;
//        System.out.println(name+"增加了"+n+"人");
//    }
//}
//
//public class MainClass{
//    public static void main(String[] args) {
//        Village zhaoZhuang,maJiaHeZhi;
//        zhaoZhuang = new Village("赵庄");
//        maJiaHeZhi = new Village("马家河子");
//        zhaoZhuang.peopleNumber = 100;
//        maJiaHeZhi.peopleNumber = 150;
//        Village.terrAmount = 200;
//        int leftTree = Village.terrAmount;
//        System.out.println("森林中有"+leftTree+"棵树");
//        zhaoZhuang.treePlanting(50);
//        leftTree = maJiaHeZhi.lookTreeAmount();
//        System.out.println("森林中有"+leftTree+" 棵树");
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        zhaoZhuang.addPeopleNumber(12);
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//        maJiaHeZhi.addPeopleNumber(10);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//    }
//}



//class B{
//    int n;
//    static int sum = 0;
//    void setN(int n){
//        this.n = n;
//    }
//    int getSum(){
//        for (int i = 1; i <= n; i++)
//            sum = sum+i;
//        return sum;
//    }
//
//}
//public class MainClass{
//    public static void main(String[] args) {
//        B b1 = new B(),b2 = new B();
//        b1.setN(3);
//        b2.setN(5);
//        int s1 = b1.getSum();
//        int s2 = b2.getSum();
//        System.out.println(s1+s2);
//    }
//}



