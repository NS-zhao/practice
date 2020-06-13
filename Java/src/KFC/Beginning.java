package KFC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Beginning extends JFrame{
    JPanel panel = new JPanel();
    JLabel title = new JLabel("欢迎光临KFC",JLabel.CENTER);
    JLabel im = new JLabel(new ImageIcon("images2.jpg"));
    JButton order=new JButton(new ImageIcon("images1.png"));
    public Beginning(String name) {
        super(name);
        setLayout(new GridLayout(3,1));
        title.setFont(new Font("KFC",Font.BOLD,50) );
        add(title);
        add(im);
        order.addActionListener(new BeginLis());
        order.setBorderPainted(false);
        JPanel jpanel2=new JPanel();
        jpanel2.setLayout(new GridLayout(1,3));
        jpanel2.add(new JPanel());
        jpanel2.add(order);
        jpanel2.add(new JPanel());
        add(jpanel2);
    }
    private class BeginLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            run.frames[1].setVisible(true);
        }
    }
}
