package ideal;

//class Computer {
//    public int getSum(int...x){
//        int sum = 0;
//        for (int i = 0; i < x.length; i++) {
//            sum = sum+x[i];
//        }
//        return sum;
//    }
//}
//
//public class J{
//    public static void main(String[] args) {
//        Computer computer = new Computer();
//        int result = computer.getSum(203,178,56,2098);
//        System.out.println("203,178,56,2098的和："+result);
//        result = computer.getSum(66,12,5,89,2,51);
//        System.out.println("66,12,5,89,2,51的和"+result);
//    }
//}




//class Village{
//    static int treeAmount;
//    int peopleNumber;
//    String name;
//    Village(String s){
//        name = s;
//    }
//
//    void treePlanting(int n){
//        treeAmount = treeAmount+n;
//        System.out.println(name+"植树"+n+"棵");
//    }
//
//    void fellTree(int n){
//        if(treeAmount-n>=0){
//            treeAmount = treeAmount-n;
//            System.out.println(name+"伐树"+n+"棵");
//        }
//        else{
//            System.out.println("无树木可伐");
//        }
//    }
//
//    static int lookTreeAmount(){
//        return treeAmount;
//    }
//
//    void addPeopleNumber(int n){
//        peopleNumber = peopleNumber+n;
//        System.out.println(name+"增加了"+n+"人");
//    }
//}
//
//public class J{
//    public static void main(String[] args) {
//        Village zhaoZhuang,maiJiaHeZhi;
//        zhaoZhuang = new Village("赵庄");
//        maiJiaHeZhi = new Village("马家河子");
//        zhaoZhuang.peopleNumber = 100;
//        maiJiaHeZhi.peopleNumber = 150;
//        Village.treeAmount = 200;
//        int leftTree = Village.treeAmount;
//        System.out.println("森林中有"+leftTree+"棵树");
//        zhaoZhuang.treePlanting(50);
//        leftTree = maiJiaHeZhi.lookTreeAmount();
//        System.out.println("森林中有"+leftTree+"棵树");
//        maiJiaHeZhi.fellTree(70);
//        leftTree = maiJiaHeZhi.lookTreeAmount();
//        System.out.println("森林中有"+leftTree+"棵树");
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        zhaoZhuang.addPeopleNumber(12);
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        System.out.println("马家河子的人口："+maiJiaHeZhi.peopleNumber);
//        maiJiaHeZhi.addPeopleNumber(10);
//        System.out.println("马家河子的人口："+maiJiaHeZhi.peopleNumber);
//    }
//}




//class B{
//    int x = 100;
//    int y = 200;
//    public void setX(int x){
//        x = x;
//    }
//    public void setY(int y){
//        this.y = y;
//    }
//    public int getXYSum(){
//        return x+y;
//    }
//}
//
//public class J{
//    public static void main(String[] args) {
//        B b = new B();
//        b.setX(-100);
//        b.setY(-200);
//        System.out.println();
//        System.out.println("sum = "+b.getXYSum());
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
//}
//
//public class J{
//    public static void main(String[] args) {
//        B b1 = new B();
//        B b2 = new B();
//        b1.setN(3);
//        b2.setN(5);
//        int s1 = b1.getSum();
//        int s2 = b2.getSum();
//        System.out.println(s1+s2);
//    }
//}


