package zjm;

//import java.io.*;
//import java.util.*;
//public class G {
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





//import java.io.*;
//import java.util.*;
//
//public class G {
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
//                double avgScore = Fenxi.getAvgScore(str);
//                str = str + "平均分："+avgScore;
//                System.out.println(str);
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
//    public static double getAvgScore(String s){
//        Scanner sc = new Scanner(s);
//        sc.useDelimiter("[^0123456789.]+");
//        double avgScore(int...p){
//            double avgScore = 0;
//            double sumScore = 0;
//            for (int i = 0; i < p.length; i++) {
//                sumScore = sumScore+score;
//                avgScore =
//            }
//            return avgScore;
//        }
//        while (sc.hasNext()){
//            try{
//                double score = sc.nextDouble();
//                avgScore = Double.parseDouble(s);
//            }
//            catch (NumberFormatException exp){
//                String t = sc.next();
//            }
//        }
//    }
//
//}