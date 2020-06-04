package zjm;

//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//
//class Teacher {
//    int numberOne,numberTwo;
//    String operator="";
//    boolean right;
//
//    public int giveNumberOne(int n){
//        numberOne=(int)(Math.random()*n)+1;
//        return numberOne;
//    }
//
//    public int giveNumberTwo(int n){
//        numberTwo=(int)(Math.random()*n)+1;
//        return numberTwo;
//    }
//
//    public String giveOperator(){
//        double d=Math.random();
//        if(d>=0.8)
//            operator="+";
//        else if(d<0.8&&d>0.5)
//            operator="-";
//        else if(d<=0.5&&d>0.2)
//            operator="*";
//        else if(d<=0.2)
//            operator="/";
//        return operator;
//    }
//
//    public boolean getRight(int answer){
//        if(operator.equals("+")){
//            if(answer==numberOne+numberTwo)
//                right=true;
//            else
//                right=false;
//        }
//        else if(operator.equals("-")){
//            if(answer==numberOne-numberTwo)
//                right=true;
//            else
//                right=false;
//        }
//        else if(operator.equals("*")){
//            if(answer==numberOne*numberTwo)
//                right=true;
//            else
//                right=false;
//        }
//        else if(operator.equals("/")){
//            if(answer==numberOne/numberTwo)
//                right=true;
//            else
//                right=false;
//        }
//        return right;
//    }
//}
//class ComputerJFrame extends JFrame implements ActionListener{
//    TextField textOne,textTwo,textResult;
//    Button getProblem,giveAnswer;
//    Label operatorLabel,message;
//    Teacher teacher;
//
//    ComputerJFrame(String s){
//        super(s);
//        teacher = new Teacher();
//        setLayout(new FlowLayout());
//        textOne = new TextField(10);
//        textTwo = new TextField(10);
//        textResult = new TextField(10);
//        operatorLabel = new Label("+");
//        message = new Label("你还没有回答呢");
//        getProblem = new Button("获取题目");
//        giveAnswer = new Button("确认答案");
//        add(getProblem);
//        add(textOne);
//        add(operatorLabel);
//        add(textTwo);
//        add(new Label("="));
//        add(textResult);
//        add(giveAnswer);
//        add(message);
//        textResult.requestFocus();
//        textOne.setEditable(false);//该方法设置文本框的可编辑性
//        textTwo.setEditable(false);
//        getProblem.addActionListener(this);//创建监视器
//        giveAnswer.addActionListener(this);
//        textResult.addActionListener(this);
//        setBounds(100,100,450,100);//设置出现屏幕上时的初始位置
//        setLocationRelativeTo(null);//居中
//        setVisible(true);//窗口的可见性
//        validate();
//        addWindowFocusListener(new WindowAdapter(){
//                                   public void windowClosing(WindowEvent e){
//                                       System.exit(0);
//                                   }
//                               }
//        );
//    }
//
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==getProblem){
//            int number1 = teacher.giveNumberOne(100);
//            int number2 = teacher.giveNumberTwo(100);
//            String operator = teacher.giveOperator();
//            textOne.setText(""+number1);//设置文本框中为参数字符串指定的文本
//            textTwo.setText(""+number2);
//            operatorLabel.setText(operator);
//            message.setText("请回答");
//            textResult.setText(null);
//        }
//        if(e.getSource()==giveAnswer){
//            String answer = textResult.getText();
//            try{ int result = Integer.parseInt(answer);
//                if(teacher.getRight(result)==true){
//                    message.setText("你回答正确");
//                }
//                else{
//                    message.setText("你回答错误");
//                }
//            }
//            catch(NumberFormatException ex){
//                message.setText("请输入数字字符");
//            }
//        }
//        textResult.requestFocus();
//        validate();
//    }
//}
//
//public class N {
//    public static void main(String[] args) {
//        ComputerJFrame frame;
//        frame = new ComputerJFrame("算术测试");
//    }
//}


//import java.awt.*;
//import java.awt.event.*;
//public class N{
//    public static void main(String args[]) {
//    new ThreadFrame();
//    }
//}
//class ThreadFrame extends Frame implements ActionListener {
//    Label  wordLabel;
//    Button button;
//    TextField inputText,scoreText;
//    WordThread  giveWord;//用WordThread声明一个giveWord对象
//    int score=0;
//    ThreadFrame() {
//        wordLabel=new Label(" ",Label.CENTER);
//        wordLabel.setFont(new Font("",Font.BOLD,72));
//        button=new Button("开始");
//        inputText=new TextField(3);
//        scoreText=new TextField(5);
//        scoreText.setEditable(false);
//        giveWord=new WordThread(wordLabel);//创建giveWord，将wordLabel传递给WordThread构造方法的参数
//        button.addActionListener(this);
//        inputText.addActionListener(this);
//        add(button,BorderLayout.NORTH);
//        add(wordLabel,BorderLayout.CENTER);
//        Panel southP=new Panel();
//        southP.add(new Label("输入标签所显示的汉字后回车:"));
//        southP.add(inputText);
//        southP.add(scoreText);
//        add(southP,BorderLayout.SOUTH);
//        setBounds(100,100,350,180);
//        setVisible(true);
//        validate();
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        }
//        );
//    }
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button) {
//            if(!(giveWord.isAlive())) {
//                giveWord=new WordThread(wordLabel);
//            }
//            try {
//                giveWord.start();//giveWord调用方法start()
//            }
//            catch(Exception exe){}
//        }
//        else if(e.getSource()==inputText) {
//            if(inputText.getText().equals(wordLabel.getText())) {
//                score++;
//            }
//            scoreText.setText("得分:"+score);
//            inputText.setText(null);
//        }
//    }
//}
//class WordThread extends Thread {
//    char word;
//    int k=19968;
//    Label com;
//    WordThread(Label com) {
//        this.com=com;
//    }
//    public void run() {
//        k=19968;
//        while(true) {
//            word=(char)k;
//            com.setText(""+word);
//            try{
//                sleep(6000);
//            }
//            catch(InterruptedException e){}
//            k++;
//            if(k>=29968)
//                k=19968;
//        }
//    }
//}



//import java.net.ServerSocket;
//import java.net.Socket;
//import java.io.*;
//import java.text.DateFormat;
//import java.util.Date;//时间
////import java.util.Calendar;
//class Server {
//    public static void main(String args[]){
//        try{
//            ServerSocket server = new ServerSocket(11111);//创建服务器套接字
//            System.out.println("服务器启动完毕");
//
//            System.out.println("等待客户端连接...");
//            Socket socket = server.accept();//等待客户端连接
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//获得客户端的输入流
//            //OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());//获得客户端输出流
//            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);//获得客户端输出流)
//            if(socket.isConnected()){
//                System.out.println("客户端名称为"+socket.getInetAddress().getHostAddress()+"  连接成功！");
//                //out.write("连接成功/n");
//                out.println("连接成功");
//            }
//
//            while(true){
//                String str = reader.readLine();
//                if(str.equals("Time")){//客户端请求时间数据
//                    Date date = new Date();
//                    // Calendar cal = Calendar.getInstance();
//                    System.out.println("客户端请求当前时间");
//                    DateFormat format = DateFormat.getDateInstance();
//                    //out.write(format.format(date));//格式化输出时间
//                    out.println(format.format(date));
//                }
//                else if(str.equals("exit")){//退出
//                    //out.write("bye");
//                    out.println("bye");
//                    System.out.println("连接断开");
//                    break;
//                }
//                else{
//                    System.out.println("数据："+str);
//                }
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
//
//
//public class N {
//    public static void main(String args[]){
//        try{
//            Socket client = new Socket("localhost",11111);//创建客户端套接字
//
//            OutputStream out = client.getOutputStream();//获取输出流
//            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));//获取输入流 获得服务器返回的数据
//            BufferedReader localMessage = new BufferedReader(new InputStreamReader(System.in));//接受客户端从键盘输入的信息
//
//            System.out.println("从服务器"+client.getRemoteSocketAddress()+"返回的消息："+reader.readLine());
//
//            while(true){//从客户端向服务器传输数据
//                String message,str;
//                message = localMessage.readLine()+"/n";//从屏幕读取一行数据
//                //System.out.print(message);
//                out.write(message.getBytes());//传输给服务器
//
//                str = reader.readLine();
//                System.out.println("从服务器"+client.getRemoteSocketAddress()+"返回的消息："+str);
//                if(str.equals("Bye")){//服务器传回 结束 数据
//                    System.out.println("连接断开！");
//                    break;
//                }
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}

