//package zjm;
//
//import java.util.*;
//import java.sql.*;
//public class R {
//    public static void main(String args[]) {
//    try {
//        Class.forName( "org.apache.derby.jdbc.EmbeddedDriver");
//    }
//    catch(ClassNotFoundException e) {
//        System.out.print(e);
//    }
//    Connection con=null;
//    Statement sta = null;
//    PreparedStatement sql=null;
//    try{
//        con = DriverManager.getConnection("jdbc:derby:employee;create=true");
//        sta = con.createStatement();
//        String s="create table salary(number int primary key not null, money double)";
//        sta. execute(s);
//        sql=con. prepareStatement(" INSERT INTO salary VALUES (?,?)");
//    }
//    catch(SQLException exp){
//
//    }
//    finally{
//        try {
//            sql = con.prepareStatement("INSERT INTO salary VALUES (?,?)");
//        }
//        catch(SQLException ee){}
//    }
//    int number=0;
//    double money =0;
//    Scanner scanner = new Scanner(System.in);
//    int condition=1;
//    while(condition==1) {
//        System.out. print("输入工资号(整数):");
//        number = scanner.nextInt();
//        System. out . print("輸入工资(浮点数):");
//        money = scanner.nextDouble( );
//        try {
//            sql.setInt(1, number);
//            sql.setDouble(2, money);
//            sql.execute();
//        }
//        catch(Exception ex) {
//            System.out.print("添加记录失败! " + ex);
//        }
//        System. out. print("输入1继续，非1结束");
//        condition = scanner. nextInt();
//      }
//    }
//}
//class F {
//    public static void main (String args[]) {
//        int wantRecordAmount = 10;
//        Random random = new Random();
//        try {
//            Class.forName("org . apache . derby . jdbc . EmbeddedDriver");
//        } catch (Exception e) {
//            System.out.print(e);
//        }
//        Connection con;
//        Statement sql;
//        ResultSet rs;
//        try {
//            con = DriverManager.getConnection("jdbc:derby:employee;create=false");
//            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_READ_ONLY);
//            rs = sql.executeQuery("select * from salary ");
//            rs.last();
//            int count = rs.getRow();
//            Vector<Integer> vector = new Vector<Integer>();
//            for (int i = 1; i <= count; i++) {
//                vector.add(new Integer(i));
//            }
//            int itemAmount = Math.min(wantRecordAmount, count);
//            double sum = 0;
//            int n = itemAmount;
//            while (itemAmount > 0) {
//                int randomIndex = random.nextInt(vector.size());
//                int index = (vector.elementAt(randomIndex)).intValue();
//                rs.absolute(index); //将rs的游标游标移到index
//                double price = rs.getDouble(2);
//                sum = sum + price;
//                itemAmount--;
//                vector.removeElementAt(randomIndex);
//            }
//            con.close();
//            double aver = sum/n;
//            System.out.println("随机抽取" +n+ "条记录的");
//            System.out.println("其平均工资:" + aver);
//        }
//        catch(SQLException е) {
//            System.out.println(""+e);
//        }
//    }
//}