package zjm;

//import java.io.*;
//import java.util.*;
//public class H {
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



//import java.io.*;
//public class H {
//    public static void main(String args[]) {
//        File f=new File("E.java");;
//        try{   RandomAccessFile random=new RandomAccessFile(f,"rw");
//            random.seek(0);
//            long m=random.length();
//            while(m>=0) {
//                m=m-1;
//                random.seek(m);
//                int c=random.readByte();
//                if(c<=255&&c>=0)
//                    System.out.print((char)c);
//                else {
//                    m=m-1;
//                    random.seek(m);
//                    byte cc[]=new byte[2];
//                    random.readFully(cc);
//                    System.out.print(new String(cc));
//                }
//            }
//        }
//        catch(Exception exp){}
//    }
//}



//import java.io.*;
//public class H {
//    public static void main(String args[ ]) {
//        File file=new File("E.java");
//        File tempFile=new File("temp.txt");
//        try{ FileReader  inOne=new FileReader(file);
//            BufferedReader inTwo= new BufferedReader(inOne);
//            FileWriter  tofile=new FileWriter(tempFile);
//            BufferedWriter out= new BufferedWriter(tofile);
//            String s=null;
//            int i=0;
//            s=inTwo.readLine();
//            while(s!=null) {
//                i++;
//                out.write(i+" "+s);
//                out.newLine();
//                s=inTwo.readLine();
//            }
//            inOne.close();
//            inTwo.close();
//            out.flush();
//            out.close();
//            tofile.close();
//        }
//        catch(IOException e){}
//    }
//}
