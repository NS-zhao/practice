package Z;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//class ComputerFrame extends JFrame{
//    JMenuBar menuBar;
//    JMenu choiceGrade;
//    JMenuItem grade1,grade2;
//    JTextField textOne,textTwo,textResult;
//    JButton getProblem,giveAnswer;
//    JLabel operatorLabel,message;
//    ComputerFrame(){
//        setLayout(new FlowLayout());
//        menuBar = new JMenuBar();
//        choiceGrade = new JMenu("选择级别");
//        grade1 = new JMenuItem("幼儿级别");
//        grade2 = new JMenuItem("儿童级别");
//        choiceGrade.add(grade1);
//        choiceGrade.add(grade2);
//        menuBar.add(choiceGrade);
//        setJMenuBar(menuBar);
//        textOne = new JTextField(5);
//        textTwo = new JTextField(5);
//        textResult = new JTextField(5);
//        operatorLabel = new JLabel("+");
//        operatorLabel.setFont(new Font("Arial", Font.BOLD,20));
//        message = new JLabel("你还没回答呢");
//        getProblem = new JButton("获取题目");
//        giveAnswer = new JButton("确认答案");
//        add(textOne);
//        add(operatorLabel);
//        add(textTwo);
//        add(new Label("="));
//        add(textResult);
//        add(giveAnswer);
//        add(message);
//        add(getProblem);
//        getProblem.setActionCommand("getProblem");
//        textResult.setActionCommand("answer");
//        giveAnswer.setActionCommand("answer");
//        setVisible(true);
//        validate();
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}

//public class F{
//    public static void main (String[] args) {
//        ComputerFrame frame = new ComputerFrame();
//        frame.setTitle("算数测试");
//        frame.setBounds(100,100,650,180);
//    }
//}



//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//class ComputerJFrame extends JFrame{
//    JMenuBar menuBar;
//    JMenu choiceGrade;
//    JMenuItem grade1,grade2;
//    JTextField textOne,textTwo,textResult;
//    JButton getProblem,giveAnswer;
//    JLabel operator,message;
//    ComputerJFrame(){
//        setLayout(new FlowLayout());
//        menuBar = new JMenuBar();
//        choiceGrade = new JMenu("选择级别");
//        grade1 = new JMenuItem("幼儿级别");
//        grade2 = new JMenuItem("儿童级别");
//        choiceGrade.add(grade1);
//        choiceGrade.add(grade2);
//        menuBar.add(choiceGrade);
//        setJMenuBar(menuBar);
//        textOne = new JTextField(5);
//        textTwo = new JTextField(5);
//        textResult = new JTextField(5);
//        operator = new JLabel("+");
//        message = new JLabel("你还没回答呢");
//        getProblem = new JButton("获取题目");
//        giveAnswer = new JButton("确认答案");
//        add(textOne);
//        add(operator);
//        add(textTwo);
//        add(new Label("="));
//        add(textResult);
//
//        add(giveAnswer);
//        add(message);
//        add(getProblem);
//        getProblem.setActionCommand("problem");
//        textResult.setActionCommand("answer");
//        giveAnswer.setActionCommand("answer");
//        setVisible(true);
//        validate();
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}
//
//public class F{
//    public static void main (String[] args) {
//        ComputerJFrame frame = new ComputerJFrame();
//        frame.setBounds(100,100,650,100);
//        frame.setTitle("算数测试");
//    }
//}


//import java.io.*;
////倒序
//public class F{
//    public static void main (String[] args) {
//        RandomAccessFile inAndOut = null;
//        int data[] = {1,2,3,4,5,6,7,8,9,10};
//        try{
//            inAndOut = new RandomAccessFile("tom.dat","rw");
//            for (int i = 0; i < data.length; i++) {
//                inAndOut.writeInt(data[i]);
//            }
//            for (int i = data.length-1; i >= 0; i--) {
//                inAndOut.seek(i*4);
//                System.out.print(inAndOut.readInt()+" ");
//            }
//            inAndOut.close();
//        }
//        catch(Exception e){
//
//        }
//    }
//}



//倒序
//import java.io.*;
//
//public class F{
//    public static void main (String[] args) {
//        RandomAccessFile inAndOut = null;
//        int data[] = {1,2,3,4,5,6,7,8,9,10};
//        try{
//            inAndOut = new RandomAccessFile("tom.dat","rw");
//            for (int i = 0; i < data.length; i++) {
//                inAndOut.writeInt(data[i]);
//            }
//            for (int i = data.length-1; i >= 0; i--) {
//                inAndOut.seek(i*4);
//                System.out.print(inAndOut.readInt()+" ");
//            }
//            inAndOut.close();
//
//        }
//        catch (Exception e){
//
//        }
//    }
//}


