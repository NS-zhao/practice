//package Z;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
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
//        getProblem = new JButton("获取问题");
//        giveAnswer = new JButton("确认答案");
//        operator = new JLabel("+");
//        message = new JLabel("你还没回答问题呢");
//        add(textOne);
//        add(operator);
//        add(textTwo);
//        add(new JLabel("="));
//        add(textResult);
//        add(getProblem);
//        add(message);
//        add(giveAnswer);
//        setVisible(true);
//        validate();
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}
//
//public class H {
//    public static void main (String[] args) {
//        ComputerJFrame frame = new ComputerJFrame();
//        frame.setTitle("算数测试");
//        frame.setBounds(100,100,650,100);
//    }
//}



//public class H{
//    public static void main (String[] args) {
//        int sum = 0,i,j;
//        for (i = 1; i < 1000; i++) {
//            for ( j = 1,sum = 0; j < i; j++) {
//                if(i%j == 0){
//                    sum = sum+j;
//                }
//
//            }
//            if(sum == i){
//                System.out.print(i+" ");
//            }
//        }
//    }
//}



