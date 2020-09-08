package Z;

//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//public class C {
//    public static void main (String[] args) {
//        WindowActionEvent win = new WindowActionEvent();
//        win.setBounds(100,100,310,260);
//        win.setTitle("处理ActionEvent事件");
//    }
//}
//
//class WindowActionEvent extends JFrame{
//    JTextField text;
//    ReaderListen listen;
//    public WindowActionEvent(){
//        init();
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    void init(){
//        setLayout(new FlowLayout());
//        text = new JTextField(10);
//        listen = new ReaderListen();
//        text.addActionListener(listen);
//        add(text);
//    }
//}
//
//class ReaderListen implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//        String str = e.getActionCommand();
//        System.out.println(str+"的长度："+str.length());
//    }
//}



//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//public class C{
//    public static void main (String[] args) {
//        WindowActionEvent win = new WindowActionEvent();
//        win.setBounds(100,100,460,360);
//        win.setTitle("处理ActionEvent事件");
//    }
//}
//
//class WindowActionEvent extends JFrame{
//    JTextField inputText;
//    JTextArea textShow;
//    JButton button;
//    PoliceListen listener;
//    public WindowActionEvent(){
//        init();
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    void init(){
//        setLayout(new FlowLayout());
//        inputText = new JTextField(10);
//        button = new JButton("读取");
//        textShow = new JTextArea(5,18);
//        listener = new PoliceListen();
//        listener.setJTextField(inputText);
//        listener.setJTextArea(textShow);
//        inputText.addActionListener(listener);
//        button.addActionListener(listener);
//        add(inputText);
//        add(button);
//        add(new JScrollPane(textShow));
//    }
//}
//
//class PoliceListen implements ActionListener{
//    JTextField textInput;
//    JTextArea textShow;
//    public void setJTextField(JTextField text){
//        textInput = text;
//    }
//    public void setJTextArea(JTextArea area){
//        textShow = area;
//    }
//    public void actionPerformed(ActionEvent e){
//        String str = textInput.getText();
//        textShow.append(str+"的长度："+str.length()+"\n");
//    }
//}



//完数
//public class C{
//    public static void main (String[] args) {
//        int sum = 0,i,j;
//        for (i = 1; i <= 1000; i++) {
//            for ( j = 1,sum = 0; j < i; j++) {
//                if(i%j == 0){
//                    sum = sum+j;
//                }
//            }
//            if(sum == i){
//                System.out.println("完数："+i);
//            }
//        }
//    }
//}



//1+2+3+....+n<250
//public class C{
//    public static void main (String[] args) {
//        int sum = 0;
//        int n = 1;
//        for (int i = 1; i <= n; i++) {
//            sum = sum+i;
//            if(sum>250)
//                break;
//            n++;
//        }
//        System.out.println("符合条件的最大整数："+(n-1));
//    }
//}



//1!+2!+...+n!<10000
//public class C{
//    public static void main (String[] args) {
//        int sum = 0;
//        int jiecheng = 1;
//        int n = 1;
//        while(true){
//            jiecheng = 1;
//            for (int i = 1; i <= n; i++) {
//                jiecheng = jiecheng*i;
//            }
//            sum = sum+jiecheng;
//            if(sum>10000)
//                break;
//            n++;
//        }
//        System.out.println("符合条件的最大整数："+(n-1));
//    }
//}