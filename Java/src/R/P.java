package R;

//class Village{
//    static int treeAmount;
//    int peopleNumber;
//    String name;
//    Village(String s){
//        name = s;
//    }
//    void treePlating(int n){
//        treeAmount = treeAmount+n;
//        System.out.println(name+"植树"+n+"棵");
//    }
//    void fellTree(int n){
//        if(treeAmount-n>=0){
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
//
//public class P {
//    public static void main (String[] args) {
//        Village zhaozhuang = new Village("赵庄");
//        Village majiahezhi = new Village("马家河子");
//        zhaozhuang.peopleNumber = 100;
//        majiahezhi.peopleNumber = 150;
//        Village.treeAmount = 200;
//        int tree = Village.treeAmount;
//        System.out.println("森林中有"+tree+"棵树");
//        zhaozhuang.treePlating(50);
//        tree = Village.lookTreeAmount();
//        System.out.println("森林中有"+tree+"棵树");
//        majiahezhi.fellTree(70);
//        tree = Village.lookTreeAmount();
//        System.out.println("森林中有"+tree+"棵树");
//        System.out.println("赵庄的人口："+zhaozhuang.peopleNumber);
//        zhaozhuang.addPeopleNumber(12);
//        System.out.println("赵庄的人口："+zhaozhuang.peopleNumber);
//        System.out.println("马家河子的人口："+majiahezhi.peopleNumber);
//        majiahezhi.addPeopleNumber(10);
//        System.out.println("马家河子的人口："+majiahezhi.peopleNumber);
//    }
//}




//class People{
//    float weight,height;
//    String name;
//    void speak(String s){
//        System.out.println(s);
//    }
//}
//
//class Student extends People{
//    int number;
//    double add(double a,double b){
//        return a+b;
//    }
//}
//
//public class P{
//    public static void main(String[] args){
//        Student zhao = new Student();
//        zhao.weight = 50.0f;
//        zhao.height = 170f;
//        zhao.name = "赵佳敏";
//        zhao.number = 201011;
//        zhao.speak("我是"+zhao.name+",我的学号"+zhao.number);
//        System.out.println("我的身高："+zhao.height+"cm,我的体重："+zhao.weight+"kg");
//        System.out.println("我会做加法");
//        double sum = zhao.add(15,89);
//        System.out.println(sum);
//    }
//}




//class University{
//    void enterRule(double math,double english,double chinese){
//        double total = math+english+chinese;
//        if(total>=200){
//            System.out.println(total+"分达到大学录取线");
//        }
//        else{
//            System.out.println(total+"分未达到大学录取线");
//        }
//    }
//}
//
//class ImportantUniversity extends University{
//    void enterRule(double math,double english,double chinese){
//        double total = math+english+chinese;
//        if(total>=245){
//            System.out.println(total+"分达到重点大学录取线");
//        }
//        else{
//            System.out.println(total+"分未达到重点大学录取线");
//        }
//    }
//}
//
//public class P{
//    public static void main (String[] args) {
//        double math = 64;
//        double english = 76.5;
//        double chinese = 66;
//        University university = new University();
//        university.enterRule(math,english,chinese);
//        ImportantUniversity univer = new ImportantUniversity();
//        univer.enterRule(math,english,chinese);
//        math = 89;
//        english = 80;
//        chinese = 86;
//        univer = new ImportantUniversity();
//        univer.enterRule(math,english,chinese);
//    }
//}