package zjm;

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
//    void cutTree(int n){
//        if(treeAmount-n>0){
//            treeAmount = treeAmount-n;
//            System.out.println(name+"伐树"+n+"棵");
//        }
//        else{
//            System.out.println("无树木可伐");
//        }
//    }
//    static int lookTree(){
//        return treeAmount;
//    }
//    void addPeople(int n){
//        peopleNumber = peopleNumber+n;
//        System.out.println(name+"增加了"+n+"人");
//    }
//}
//
//public class J{
//    public static void main(String[] args) {
//        Village liZhuang,yangZhuang;
//        liZhuang = new Village("李庄");
//        yangZhuang = new Village("杨庄");
//        liZhuang.peopleNumber = 500;
//        yangZhuang.peopleNumber = 250;
//        Village.treeAmount = 500;
//        int tree = Village.treeAmount;
//        System.out.println("森林中有"+tree+"棵树");
//        liZhuang.treePlanting(100);
//        tree = yangZhuang.lookTree();
//        System.out.println("森林中有"+tree+"棵树");
//        yangZhuang.cutTree(60);
//        tree = Village.lookTree();
//        System.out.println("森林中有"+tree+"棵树");
//        System.out.println("李庄的人口："+liZhuang.peopleNumber);
//        liZhuang.addPeople(20);
//        System.out.println("李庄的人口："+liZhuang.peopleNumber);
//        System.out.println("杨庄的人口："+yangZhuang.peopleNumber);
//        yangZhuang.addPeople(30);
//        System.out.println("杨庄的人口："+yangZhuang.peopleNumber);
//    }
//}

