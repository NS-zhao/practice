package Z;

//import java.awt.*;
//import javax.swing.*;
//class ComponentInWindow extends JFrame{
//    JTextField text;
//    JButton button;
//    JCheckBox checkBox1,checkBox2,checkBox3;
//    JRadioButton radio1,radio2;
//    ButtonGroup group;
//    JComboBox comBox;
//    JTextArea area;
//    public ComponentInWindow(){
//        init();
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    void init(){
//        setLayout(new FlowLayout());
//        add(new JLabel("文本框："));
//        text = new JTextField(10);
//        add(text);
//        add(new JLabel("按钮"));
//        button = new JButton("确定");
//        add(button);
//        add(new JLabel("选择框"));
//        checkBox1 = new JCheckBox("喜欢音乐");
//        checkBox2 = new JCheckBox("喜欢旅游");
//        checkBox3 = new JCheckBox("喜欢篮球");
//        add(checkBox1);
//        add(checkBox2);
//        add(checkBox3);
//        add(new JLabel("单选按钮："));
//        group = new ButtonGroup();
//        radio1 = new JRadioButton("男");
//        radio2 = new JRadioButton("女");
//        group.add(radio1);
//        add(radio1);
//        add(radio2);
//        group.add(radio2);
//        add(new JLabel("下拉列表"));
//        comBox = new JComboBox();
//        comBox.addItem("音乐天地");
//        comBox.addItem("武术天地");
//        comBox.addItem("象棋乐园");
//        add(comBox);
//        add(new JLabel("文本区："));
//        area = new JTextArea(6,12);
//        add(new JScrollPane(area));
//    }
//}
//
//public class B {
//    public static void main (String[] args) {
//        ComponentInWindow win = new ComponentInWindow();
//        win.setBounds(100,100,310,260);
//        win.setTitle("常用组件");
//    }
//}



//import java.awt.*;
//import javax.swing.*;
//public class B extends JFrame{
//    JTabbedPane p;
//    public B(){
//        setBounds(100,100,500,300);
//        setVisible(true);
//        p = new JTabbedPane(JTabbedPane.LEFT);
//        p.add("观看FlowLayout",new FlowLayoutJPanel());
//        p.add("观看FlowLayout",new GridLayoutJPanel());
//        p.add("观看BorderLayout",new BorderLayoutJPenal());
//        p.validate();
//        add(p,BorderLayout.CENTER);
//        validate();setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    }
//
//    public static void main (String[] args) {
//        new B();
//    }
//}
//
//class FlowLayoutJPanel extends JPanel{
//    FlowLayoutJPanel(){
//        add(new JLabel("FlowLayout布局的面板"));
//        add(new JButton(new ImageIcon("dog.jpg")));
//        add(new JScrollPane(new JTextArea(12,15)));
//    }
//}
//
//class GridLayoutJPanel extends JPanel{
//    GridLayoutJPanel(){
//        GridLayout grid = new GridLayout(12,12);
//        setLayout(grid);
//        Label label[][] = new Label[12][12];
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 12; j++) {
//                label[i][j] = new Label();
//                if((i+j)%2 == 0)
//                    label[i][j].setBackground(Color.black);
//                else
//                    label[i][j].setBackground(Color.white);
//                add(label[i][j]);
//            }
//
//        }
//    }
//}
//
//class BorderLayoutJPenal extends JPanel{
//    JButton bSouth,bNorth,bEast,bWest;
//    JTextArea bCenter;
//    BorderLayoutJPenal(){
//        setLayout(new BorderLayout());
//        bSouth = new JButton("南");
//        bNorth = new JButton("北");
//        bEast = new JButton("东");
//        bWest = new JButton("西");
//        bCenter = new JTextArea("中心");
//        add(bNorth,BorderLayout.NORTH);
//        add(bSouth,BorderLayout.SOUTH);
//        add(bEast,BorderLayout.EAST);
//        add(bWest,BorderLayout.WEST);
//        add(bCenter,BorderLayout.CENTER);
//        validate();
//    }
//}