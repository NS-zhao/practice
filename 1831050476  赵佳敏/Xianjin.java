import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Xianjin extends JFrame{
    JPanel jpanel=new JPanel();
    JLabel jlabel=new JLabel("�ͳ���Ǯ");
    JTextField in=new JTextField(20);
    JButton buttonzhifu=new JButton("֧��");
    JButton buttonwancheng=new JButton("֧�����");
    public Xianjin(String name) {
        super(name);
        this.setLayout(new GridLayout(2,1));
        this.setSize(700, 450);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JTextArea show=new JTextArea(24,20);
        JScrollPane scrollpane=new JScrollPane(show);
        show.setEditable(false);
        show.append("����Ҫ֧��"+run.order.client1.num+"Ԫ"+'\n'+"�����·�����������Ǯ����֧���Լ�����:\n");
        this.add(scrollpane);
        jpanel.add(jlabel);
        jpanel.add(in);
        jpanel.add(buttonzhifu);
        jpanel.add(buttonwancheng);

        this.add(jpanel);
        buttonzhifu.addActionListener(e->{
            String content=in.getText();
            float jinqian=Integer.parseInt(content);
            float zhaoling=jinqian-run.order.client1.num;
            if(jinqian<run.order.client1.num)
            {
                show.append("������Ǯ����֧����������֧��\n");
            }
            else
                show.append("��֧����"+jinqian+"Ԫ������"+String.format("%.1f", zhaoling)+"Ԫ\n"+"���ζ������\n");
            in.setText("");
        });
        buttonwancheng.addActionListener(e->{
            run.sao.setVisible(false);
            run.order.setVisible(true);
            run.frames[1].setVisible(false);
            System.exit(-1);
        });
    }


}
