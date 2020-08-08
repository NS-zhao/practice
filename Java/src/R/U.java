package R;

//interface CompurerAverage{
//    public double average(double a,double b);
//}
//
//class A implements CompurerAverage{
//    public double average(double a,double b){
//        double aver = (a+b)/2;
//        return aver;
//    }
//}
//
//class B implements CompurerAverage{
//    public double average(double a,double b){
//        double aver = Math.sqrt(a*b);
//        return aver;
//    }
//}
//
//public class U {
//    public static void main (String[] args) {
//        CompurerAverage computer;
//        double a = 11.23;
//        double b = 22.78;
//        computer = new A();
//        double result = computer.average(a,b);
//        System.out.println(a+"和"+b+"的算术平均值："+result);
//        computer = new B();
//        result = computer.average(a,b);
//        System.out.println(a+"和"+b+"的几何平均值："+result);
//    }
//}



//interface SpeakHello{
//    void speakHello();
//}
//
//class Chinese implements SpeakHello{
//    public void speakHello(){
//        System.out.println("中国人习惯问候语：你好，吃饭了吗？");
//    }
//}
//
//class English implements SpeakHello{
//    public void speakHello(){
//        System.out.println("英国人习惯问候语：你好，天气不错");
//    }
//}
//
//class KindHello{
//    public void lookHello(SpeakHello hello){
//        hello.speakHello();
//    }
//}
//
//public class U{
//    public static void main (String[] args) {
//        KindHello kindHello = new KindHello();
//        kindHello.lookHello(new Chinese());
//        kindHello.lookHello(new English());
//    }
//}



//interface Advertisment{
//    public void showAdverisment();
//    public String getCorpName();
//}
//
//class AdvertismentBoard{
//    public void show(Advertisment adver){
//        System.out.println(adver.getCorpName()+"的广告词如下：");
//        adver.showAdverisment();
//    }
//}
//
//class WhiteCloudCorp implements Advertisment{
//    public void showAdverisment(){
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        System.out.println("飞机中的战斗机，哎yes!");
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
//    public String getCorpName(){
//        return "白云有限公司";
//    }
//}
//
//class BlackLandCorp implements Advertisment{
//    public void showAdverisment(){
//        System.out.println("******************************");
//        System.out.printf("劳动是爹\n土地是妈\n");
//        System.out.println("******************************");
//    }
//    public String getCorpName(){
//        return "黑土集团";
//    }
//}
//
//public class U{
//    public static void main (String[] args) {
//        AdvertismentBoard board = new AdvertismentBoard();
//        board.show(new WhiteCloudCorp());
//        board.show(new BlackLandCorp());
//    }
//}



//interface DogState{
//    public void showState();
//}
//
//class SoftlyState implements DogState{
//    public void showState(){
//        System.out.println("在主人面前，听主人的命令");
//    }
//}
//
//class MeetEnemyState implements DogState{
//    public void showState(){
//        System.out.println("遇到敌人狂叫，并冲向去狠咬敌人");
//    }
//}
//
//class MeetFriendState implements DogState{
//    public void showState(){
//        System.out.println("遇到朋友晃动尾巴，表示欢迎");
//    }
//}
//
//class Dog{
//    DogState state;
//    public void cry(){
//        state.showState();
//    }
//    public void setState(DogState s){
//        state = s;
//    }
//}
//
//public class U{
//    public static void main (String[] args) {
//        Dog yellowDog = new Dog();
//        yellowDog.setState(new SoftlyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetEnemyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetFriendState());
//        yellowDog.cry();
//    }
//}