package KFC;
import java.awt.*;
import java.io.Serializable;
import javax.swing.JFrame;
public class run implements Serializable{
    static String title = "KFC";
    static Beginning begin = new Beginning(title);
    static Order order=new Order(title);
    static JFrame[] frames= {begin,order};
    static saoma sao=new saoma("扫码支付");
    static Xiadan xiadan=new Xiadan("订单信息");
    public static void main(String args[]) throws InterruptedException {

        for (int index = 0; index < frames.length; index++) {
            frames[index].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frames[index].setPreferredSize(new Dimension(800,700));
            screencentre(frames[index]);

            frames[index].pack();
        }
        frames[0].setVisible(true);

    }
    //使框架显示在屏幕中央
    public static void screencentre(JFrame frame) {

        Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包

        Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸

        int screenWidth = screenSize.width; // 获取屏幕的宽

        int screenHeight = screenSize.height; // 获取屏幕的高


        frame.setLocation(screenWidth/4, screenHeight/15);// 设置窗口居中显示
    }
}

