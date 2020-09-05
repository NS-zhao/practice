package Z;

//import javax.swing.*;
//import java.awt.*;
//public class A {
//    public static void main (String[] args) {
//        JFrame window1 = new JFrame("第一个窗口");
//        JFrame window2 = new JFrame("第二个窗口");
//        Container con = window1.getContentPane();
//        con.setBackground(Color.YELLOW);
//        window1.setBounds(60,100,188,108);
//        window2.setBounds(260,100,188,108);
//        window1.setVisible(true);
//        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        window2.setVisible(true);
//        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}



//import javax.swing.*;
//import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;
//import static javax.swing.JFrame.*;
//class WindowMenu extends JFrame{
//    JMenuBar menubar;
//    JMenu menu,subMenu;
//    JMenuItem item1,item2;
//    public WindowMenu(){
//
//    }
//    public WindowMenu(String s,int x,int y,int w,int h){
//        init(s);
//        setLocation(x,y);
//        setSize(w,h);
//        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//
//    }
//    void init(String s){
//        setTitle(s);
//        menubar = new JMenuBar();
//        menu = new JMenu("菜单");
//        subMenu = new JMenu("软件项目");
//        item1 = new JMenuItem("Java话题",new ImageIcon("a.gif"));
//        item2 = new JMenuItem("动画话题",new ImageIcon("b.gif"));
//        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
//        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
//        menu.add(item1);
//        menu.addSeparator();
//        menu.add(item2);
//        menu.add(subMenu);
//        subMenu.add(new JMenuItem("汽车销售系统",new ImageIcon("c.gif")));
//        subMenu.add(new JMenuItem("农场信息系统",new ImageIcon("d.gif")));
//        menubar.add(menu);
//        setJMenuBar(menubar);
//    }
//}
//
//public class A{
//    public static void main (String[] args) {
//        WindowMenu win = new WindowMenu("带菜单的窗口",20,30,200,190);
//    }
//}