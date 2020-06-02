package zjm;

//interface DogState{
//    public void showState();
//}
//class HostState implements DogState{
//    public void showState(){
//        System.out.println("主人，我爱你");
//    }
//}
//class MeetEnemy implements DogState{
//    public void showState(){
//        System.out.println("你走开！");
//    }
//}
//class MeetFriend implements DogState{
//    public void showState(){
//        System.out.println("很高兴见到你");
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
//public class K{
//    public static void main(String[] args) {
//        Dog smallDog = new Dog();
//        smallDog.setState(new HostState());
//        smallDog.cry();
//        smallDog.setState(new MeetEnemy());
//        smallDog.cry();
//        smallDog.setState(new MeetFriend());
//        smallDog.cry();
//    }
//}




//import java.io.*;
//import java.util.*;
//public class K {
//    public static void main(String[] args) {
//        File fRead = new File("score.txt");
//        File fWrite = new File("scoreAnalysis.txt");
//        try{
//            Writer out = new FileWriter(fWrite,true);
//            BufferedWriter bufferWriter = new BufferedWriter(out);
//            Reader in = new FileReader(fRead);
//            BufferedReader bufferReader = new BufferedReader(in);
//            String str = null;
//            while((str = bufferReader.readLine())!=null) {
//                double totalScore = Fenxi.getTotalScore(str);
//                str = str + "总分："+totalScore;
//                System.out.println(str);
//                System.out.println("平均分"+totalScore/3);
//                bufferWriter.write(str);
//                bufferWriter.newLine();
//            }
//            bufferReader.close();
//            bufferWriter.close();
//        }
//        catch (IOException e){
//            System.out.println(e.toString());
//        }
//    }
//}
//
//class Fenxi{
//    public static double getTotalScore(String s){
//        Scanner scanner = new Scanner(s);
//        scanner.useDelimiter("[^0123456789.]+");
//        double totalScore = 0;
//        while (scanner.hasNext()){
//            try{
//                double score = scanner.nextDouble();
//                totalScore = totalScore+score;
//            }
//            catch (InputMismatchException exp){
//                String t = scanner.next();
//            }
//        }
//        return totalScore;
//    }
//}