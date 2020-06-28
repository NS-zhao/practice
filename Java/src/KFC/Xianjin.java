package KFC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Xianjin extends JFrame{
    JPanel jpanel=new JPanel();
    JLabel jlabel=new JLabel("掏出整钱");
    JTextField in=new JTextField(20);
    JButton buttonzhifu=new JButton("支付");
    JButton buttonwancheng=new JButton("支付完成");
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
        show.append("您需要支付"+run.order.client1.num+"元"+'\n'+"请在下方输入框输入金钱进行支付以及找零:\n");
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
                show.append("您给的钱不够支付，请重新支付\n");
            }
            else
                show.append("您支付了"+jinqian+"元，找您"+String.format("%.1f", zhaoling)+"元\n"+"本次订单完成\n");
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
