import java.awt.*;
import java.io.Serializable;
import javax.swing.JFrame;
public class run implements Serializable{
    static String title = "KFC";
    static Beginning begin = new Beginning(title);
    static Order order=new Order(title);
    static JFrame[] frames= {begin,order};
    static saoma sao=new saoma("ɨ��֧��");
    static Xiadan xiadan=new Xiadan("������Ϣ");
    public static void main(String args[]) throws InterruptedException {

        for (int index = 0; index < frames.length; index++) {
            frames[index].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frames[index].setPreferredSize(new Dimension(800,700));
            screencentre(frames[index]);

            frames[index].pack();
        }
        frames[0].setVisible(true);

    }
    //ʹ�����ʾ����Ļ����
    public static void screencentre(JFrame frame) {

        Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�

        Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�

        int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�

        int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�


        frame.setLocation(screenWidth/4, screenHeight/15);// ���ô��ھ�����ʾ
    }
}

