import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class saoma extends JFrame{
    JPanel jpanel=new JPanel();
    JButton buttonwancheng=new JButton("Ö§¸¶Íê³É");
    public saoma(String name) {
        super(name);
        JLabel jlabel=new JLabel(new ImageIcon("images/saoma.jpg"));
        jpanel.add(jlabel);
        this.setSize(700, 700);
        this.setLocation(300, 200);
        this.add(jpanel);
        this.add(buttonwancheng,BorderLayout.SOUTH);

        buttonwancheng.addActionListener(e->{
            run.sao.setVisible(false);
            run.xiadan.setVisible(false);
            run.frames[1].setVisible(false);
            System.exit(-1);
        });
    }
}
