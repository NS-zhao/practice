package R;

//import java.io.*;
//public class Six {
//    public static void main (String[] args) {
//        try{
//            ByteArrayOutputStream outByte = new ByteArrayOutputStream();
//            byte [] byteContent = "国庆60周年".getBytes();
//            outByte.write(byteContent);
//            ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());
//            byte backByte[] = new byte[outByte.toByteArray().length];
//            inByte.read(backByte);
//            System.out.println(new String(backByte));
//            CharArrayWriter outChar = new CharArrayWriter();
//            char []charContent = "中秋快乐".toCharArray();
//            outChar.write(charContent);
//            CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
//            char backChar[] = new char[outChar.toCharArray().length];
//            inChar.read(backChar);
//            System.out.println(new String(backChar));
//        }
//        catch (IOException exp){
//
//        }
//    }
//}



//import java.io.*;
//public class Six{
//    public static void main (String[] args) {
//        File file = new File("apple.txt");
//        try{
//            FileOutputStream fos = new FileOutputStream(file);
//            DataOutputStream outData = new DataOutputStream(fos);
//            outData.writeInt(100);
//            outData.writeLong(123456);
//            outData.writeFloat(3.1415926f);
//            outData.writeDouble(987654321.123456);
//            outData.writeBoolean(true);
//            outData.writeChars("How are you doing");
//        }
//        catch(IOException e){
//
//        }
//        try{
//            FileInputStream fis = new FileInputStream(file);
//            DataInputStream inData = new DataInputStream(fis);
//            System.out.println(inData.readInt());
//            System.out.println(inData.readLong());
//            System.out.println(inData.readFloat());
//            System.out.println(inData.readDouble());
//            System.out.println(inData.readBoolean());
//            char c;
//            while((c = inData.readChar())!='\0'){
//                System.out.print(c);
//            }
//        }
//        catch (IOException e){
//
//        }
//    }
//}



//import java.io.*;
//class EncryptAndDecrypt{
//    String encrypt(String sourString,String password){
//        char []p = password.toCharArray();
//        int n = p.length;
//        char []c = sourString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]+p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//    String decrypt(String sourString,String password){
//        char []p = password.toCharArray();
//        int n = p.length;
//        char []c = sourString.toCharArray();
//        int m = c.length;
//        for (int k = 0; k < m; k++) {
//            int mima = c[k]-p[k%n];
//            c[k] = (char)mima;
//        }
//        return new String(c);
//    }
//}
//
//public class Six{
//    public static void main (String[] args) {
//        String command = "渡江总攻时间是4月22日晚10点";
//        EncryptAndDecrypt person = new EncryptAndDecrypt();
//        String password = "Tiger";
//        String secret = person.encrypt(command,password);
//        File file = new File("secret.txt");
//        try{
//            FileOutputStream fos = new FileOutputStream(file);
//            DataOutputStream outData = new DataOutputStream(fos);
//            outData.writeUTF(secret);
//            System.out.println("加密命令："+secret);
//        }
//        catch (IOException E){
//
//        }
//        try{
//            FileInputStream fis = new FileInputStream(file);
//            DataInputStream inData = new DataInputStream(fis);
//            String str = inData.readUTF();
//            String miwen = person.decrypt(str,password);
//            System.out.println("解密命令："+miwen);
//        }
//        catch (IOException e){
//
//        }
//    }
//}