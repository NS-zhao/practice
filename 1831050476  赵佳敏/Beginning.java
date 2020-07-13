import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Beginning extends JFrame{
    JPanel panel = new JPanel();
    JLabel title = new JLabel("欢迎光临KFC",JLabel.CENTER);

    JLabel im = new JLabel(new ImageIcon("images/1.jpg"));
    JButton order=new JButton("点击进入点餐");

    public Beginning(String name) {
        super(name);
        setLayout(null);
        title.setFont(new Font("KFC",Font.BOLD,50));
        order.setFont(new Font("KFC",Font.BOLD,50));
        add(title);
        add(im);
        add(order);
        im.setBounds(200,130,399,262);
        title.setBounds(80,-20,600,200);
        order.setBounds(200,400,400,200);

        order.addActionListener(new BeginLis());
        order.setBorderPainted(false);
        order.setContentAreaFilled(false);

    }
    private class BeginLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            run.frames[1].setVisible(true);
        }
    }
}
