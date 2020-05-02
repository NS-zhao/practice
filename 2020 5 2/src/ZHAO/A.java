package ZHAO;

//interface Advertisement{
//    public void showAdvertisement();
//    public String getCorpName();
//}
//
//class AdvertisementBoard{
//    public void show(Advertisement adver){
//        System.out.println(adver.getCorpName()+"的广告词如下：");
//        adver.showAdvertisement();
//
//    }
//}
//
//class WhiteCloudCorp implements Advertisement{
//    public void showAdvertisement(){
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        System.out.printf("飞机中的战斗机，哎yes!\n");
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
//    public String getCorpName(){
//        return "白云有限公司";
//    }
//}
//
//class BlackLandCorp implements Advertisement{
//    public void showAdvertisement(){
//        System.out.println("*******************************");
//        System.out.printf("劳动是爹\n土地是妈\n");
//        System.out.println("*******************************");
//    }
//    public String getCorpName(){
//        return "黑土集团";
//    }
//}
//
//
//public class A{
//    public static void main(String[] args){
//        AdvertisementBoard board = new AdvertisementBoard();
//        board.show(new BlackLandCorp());
//        board.show(new WhiteCloudCorp());
//    }
//}





//interface DogState{
//    public void showState();
//
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
//        System.out.println("遇到敌人狂叫，并冲向穷狠咬敌人");
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
//
//public class A{
//    public static void main(String[] args){
//        Dog yellowDog = new Dog();
//        yellowDog.setState(new SoftlyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetEnemyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetFriendState());
//        yellowDog.cry();
//    }
//}




import java.util.Scanner;

//public class A{
//    public static void main(String[] args){
//        int[] score = {-120,98,89,120,99};
//        int sum = 0;
//        for(int number:score){
//            assert number>0:"负数不能是成绩";
//            sum = sum+number;
//        }
//
//        System.out.println("总成绩:"+sum);
//    }
//}