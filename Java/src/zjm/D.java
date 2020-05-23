package zjm;

//interface DogState{
//    public void showState();
//}
//class SoftlyState implements DogState{
//    public void showState(){
//        System.out.println("在主人面前，听主人的命令");
//    }
//}
//class MeetEnemyState implements DogState{
//    public void showState(){
//        System.out.println("遇到敌人狂叫，并冲向穷狠咬敌人");
//    }
//}
//class MeetFriendState implements DogState{
//    public void showState(){
//        System.out.println("遇到朋友晃动尾巴，表示欢迎");
//    }
//}
//class Dog{
//    DogState state;
//    public void cry(){
//        state.showState();
//    }
//    public void setState(DogState s){
//        state = s;
//    }
//}
//public class D{
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




//interface DogState{
//    public void showState();
//}
//class SoftlyState implements DogState{
//    public void showState(){
//        System.out.println("在主人面前，听主人的命令");
//    }
//}
//class MeetEnemyState implements DogState{
//    public void showState(){
//        System.out.println("遇到敌人狂叫，并冲向穷狠咬敌人");
//    }
//}
//class MeetFriendState implements DogState{
//    public void showState(){
//        System.out.println("遇到朋友晃动尾巴，表示欢迎");
//    }
//}
//class MeetAnotherDog implements DogState{
//    public void showState(){
//        System.out.println("嬉戏");
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
//public class D{
//    public static void main(String[] args){
//        Dog yellowDog = new Dog();
//        yellowDog.setState(new SoftlyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetEnemyState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetFriendState());
//        yellowDog.cry();
//        yellowDog.setState(new MeetAnotherDog());
//        yellowDog.cry();
//    }
//}



//class Goods{
//    boolean isDanger;
//    String name;
//    Goods(String name){
//        this.name = name;
//    }
//    public void setIsDanger(boolean boo){
//        isDanger = boo;
//    }
//    public String getName(){
//        return name;
//    }
//}
//class DangerException extends Exception{
//    String message;
//    public DangerException(){
//        message = "危险品！";
//    }
//    public void toShow(){
//        System.out.print(message+"");
//    }
//}
//class Machine{
//    public void checkBag(Goods goods) throws DangerException{
//        if(goods.isDanger){
//            DangerException danger = new DangerException();
//            throw (danger);
//        }
//    }
//}
//
//public class D{
//    public static void main(String[] args){
//        Machine machine = new Machine();
//        Goods apple = new Goods("苹果");
//        apple.setIsDanger(false);
//        Goods explosive = new Goods("炸药");
//        explosive.setIsDanger(true);
//        try{
//            machine.checkBag(explosive);
//            System.out.println(explosive.getName()+"检查通过");
//        }
//        catch(DangerException e){
//           e.toShow();
//            System.out.println(explosive.getName()+"被禁止");
//        }
//        try{
//            machine.checkBag(apple);
//            System.out.println(apple.getName()+"检查通过");
//        }
//        catch(DangerException e){
//            e.toShow();
//            System.out.println(apple.getName()+"被禁止");
//        }
//    }
//}
