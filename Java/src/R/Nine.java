package R;

//import java.io.*;
//public class Nine {
//    public static void main (String[] args) {
//        RandomAccessFile inAndOut = null;
//        int data[] = {1,2,3,4,5,6,7,8,9,10};
//        try{
//            inAndOut = new RandomAccessFile("tom.dat","rw");
//            for (int i = 0; i < data.length; i++) {
//                inAndOut.writeInt(data[i]);
//            }
//            for (long i = data.length-1; i >= 0; i--) {
//                inAndOut.seek(i*4);
//                System.out.printf("\t%d",inAndOut.readInt());
//            }
//            inAndOut.close();
//        }
//        catch (IOException E){
//
//        }
//    }
//}



//A a;
//a = new B();
//或
//A a;
//B b = new B();
//a = b;


//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.util.Random;
//class ComputerFrame extends JFrame{
//    JMenuBar menubar;
//    JMenu choiceGrade;
//    JMenuItem grade1,grade2;
//    JTextField textOne,textTwo,textResult;
//    JButton getProblem,giveAnwser;
//    JLabel operatorLabel,message;
//    Teacher teacherZhang;
//    ComputerFrame(){
//        teacherZhang=new Teacher();
//        teacherZhang.setMaxInteger(20);
//        setLayout(new FlowLayout());
//        menubar=new JMenuBar();
//        choiceGrade=new JMenu("选择级别");
//        grade1=new JMenuItem("幼儿级别");
//        grade2=new JMenuItem("儿童级别");
//        grade1.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                teacherZhang.setMaxInteger(10);
//            }
//        });
//        grade2.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                teacherZhang.setMaxInteger(50);
//            }
//        });
//        choiceGrade.add(grade1);
//        choiceGrade.add(grade2);
//        menubar.add(choiceGrade);
//        setJMenuBar(menubar);
//        textOne=new JTextField(5);
//        textTwo=new JTextField(5);
//        textResult=new JTextField(5);
//        operatorLabel=new JLabel("+");
//        operatorLabel.setFont(new Font("Arial",Font.BOLD,20));
//        message=new JLabel("你还没有回答呢");
//        getProblem=new JButton("获取题目");
//        giveAnwser=new JButton("确定答案");
//        add(getProblem);
//        add(textOne);
//        add(operatorLabel);
//        add(textTwo);
//        add(new JLabel("="));
//        add(textResult);
//        add(giveAnwser);
//        add(message);
//        textResult.requestFocus();
//        textOne.setEditable(false);
//        textTwo.setEditable(false);
//        getProblem.setActionCommand("getProblem");
//        textResult.setActionCommand("answer");
//        giveAnwser.setActionCommand("answer");
//        teacherZhang.setJTextField(textOne,textTwo,textResult);
//        teacherZhang.setJLabel(operatorLabel,message);
//        getProblem.addActionListener(teacherZhang);
//        giveAnwser.addActionListener(teacherZhang);
//        textResult.addActionListener(teacherZhang);
//        setVisible(true);
//        validate();
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}
//
//class Teacher implements ActionListener{
//    int numberOne,numberTwo;
//    String operator="";
//    boolean isRight;
//    Random random;
//    int maxInteger;
//    JTextField textOne,textTwo,textResult;
//    JLabel operatorLabel,message;
//    Teacher(){
//        random=new Random();
//    }
//    public void setMaxInteger(int n){
//        maxInteger=n;
//    }
//    public void actionPerformed(ActionEvent e){
//        String str=e.getActionCommand();
//        if(str.equals("getProblem")){
//            numberOne=random.nextInt(maxInteger)+1;
//            numberTwo=random.nextInt(maxInteger)+1;
//            double d=Math.random();
//            if(d>=0.5)
//                operator="+";
//            else
//                operator="-";
//            textOne.setText(""+numberOne);
//            textTwo.setText(""+numberTwo);
//            operatorLabel.setText(operator);
//            message.setText("请回答");
//            textResult.setText(null);
//        }
//        else if(str.equals("answer")){
//            String answer=textResult.getText();
//            try{
//                int result=Integer.parseInt(answer);
//                if(operator.equals("+")){
//                    if(result==numberOne+numberTwo)
//                        message.setText("你回答正确");
//                    else
//                        message.setText("你回答错误");
//                }
//                else if(operator.equals("-")){
//                    if(result==numberOne-numberTwo)
//                        message.setText("你回答正确");
//                    else
//                        message.setText("你回答错误");
//                }
//            }
//            catch(NumberFormatException ex){
//                message.setText("请输入数字字符");
//            }
//        }
//    }
//    public void setJTextField(JTextField...t){
//        textOne=t[0];
//        textTwo=t[1];
//        textResult=t[2];
//    }
//    public void setJLabel(JLabel...label){
//        operatorLabel=label[0];
//        message=label[1];
//    }
//}
//
//public class Nine{
//    public static void main (String[] args) {
//        ComputerFrame frame;
//        frame=new ComputerFrame();
//        frame.setTitle("算术测试");
//        frame.setBounds(100,100,650,180);
//    }
//}