package zjm;

//public class E {
//    public static void main(String[] args) {
//        System.out.println("你好，很高兴学习Java!");
//    }
//}

//编写程序模拟两个村庄共同拥有一片森林；编写一个Village类，该类有一个静态的int型成员变量
// treeAmount用于模拟森林中树木的数量；在主类MainClass的main方法中创建了两个村庄，
// 一个村庄改变了treeAmount值，另一个村庄查看treeAmount值。

//class Village{
//    static int treeAmount;
//    int peopleNumber;
//    String name;
//    Village(String s){
//        name = s;
//    }
//    void treePlanting(int n){
//        treeAmount = treeAmount+n;
//        System.out.println(name+"植树"+n+"棵");
//    }
//    void fellTree(int n){
//        if(treeAmount-n>0){
//            treeAmount = treeAmount-n;
//            System.out.println(name+"伐树"+n+"棵");
//        }
//        else{
//            System.out.println("无树木可伐");
//        }
//    }
//    static int lookTreeAmount(){
//        return treeAmount;
//    }
//    void addPeopleNumber(int n){
//        peopleNumber = peopleNumber+n;
//        System.out.println(name+"增加了"+n+"人");
//    }
//}
//
//public class E{
//    public static void main(String[] args) {
//        Village zhaoZhuang,maJiaHeZhi;
//        zhaoZhuang = new Village("赵庄");
//        maJiaHeZhi = new Village("马家河子");
//        zhaoZhuang.peopleNumber = 100;
//        maJiaHeZhi.peopleNumber = 150;
//        Village.treeAmount = 200;
//        int tree = Village.treeAmount;
//        System.out.println("森林中有"+tree+"棵树");
//        zhaoZhuang.treePlanting(50);
//        tree = maJiaHeZhi.lookTreeAmount();
//        System.out.println("森林中有"+tree+"棵树");
//        maJiaHeZhi.fellTree(70);
//        tree = Village.lookTreeAmount();
//        System.out.println("森林中有"+tree+"棵树");
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        zhaoZhuang.addPeopleNumber(50);
//        System.out.println("赵庄的人口："+zhaoZhuang.peopleNumber);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//        maJiaHeZhi.addPeopleNumber(30);
//        System.out.println("马家河子的人口："+maJiaHeZhi.peopleNumber);
//    }
//}





