import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Xiadan extends JFrame{
    JButton buttonxianjinzhifu=new JButton("现金支付");
    JButton buttonzhifubaosaoma=new JButton("扫码支付");
    JTextArea show=new JTextArea(24,20);
    public Xiadan(String name) {
        super(name);

    }
    public void s() {
        this.setLayout(new GridLayout(2,1));
        this.setSize(700, 450);
        this.setLocation(300, 200);

        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JScrollPane scrollpane=new JScrollPane(show);
        show.setEditable(false);
        show.append("*************欢迎光临KFC*************"+'\n');
        if(run.order.client1.kelen!=0)
            show.append("可乐*******************"+run.order.client1.kelen+"份\t"+"共"+run.order.client1.kelen*run.order.client1.kele+"元\n");
        if(run.order.client1.qixin!=0)
                show.append("七喜*****************"+run.order.client1.qixin+"份\t"+"共"+run.order.client1.qixin*run.order.client1.qixin+"元\n");
        if(run.order.client1.baixiangguon!=0)
            show.append("草莓奶茶*****************"+run.order.client1.baixiangguon+"份\t"+"共"+run.order.client1.baixiangguon*run.order.client1.baixiangguon+"元\n");
        if(run.order.client1.shutiaon!=0)
            show.append("薯条*******************"+run.order.client1.shutiaon+"份\t"+"共"+run.order.client1.shutiaon*run.order.client1.shutiao+"元\n");
        if(run.order.client1.jichin!=0)
            show.append("鸡翅*******************"+run.order.client1.jichin+"份\t"+"共"+run.order.client1.jichin*run.order.client1.jichi+"元\n");
        if(run.order.client1.dantan!=0)
            show.append("蛋挞*******************"+run.order.client1.dantan+"份\t"+"共"+run.order.client1.dantan*run.order.client1.danta+"元\n");
        if(run.order.client1.aoerliangbaon!=0)
            show.append("奥尔良鸡腿堡***************"+run.order.client1.aoerliangbaon+"份\t"+"共"+run.order.client1.aoerliangbaon*run.order.client1.aoerliangbao+"元\n");
        if(run.order.client1.jituibaon!=0)
            show.append("香辣鸡腿堡****************"+run.order.client1.jituibaon+"份\t"+"共"+run.order.client1.jituibaon*run.order.client1.jituibao+"元\n");
        if(run.order.client1.niuroubaon!=0)
            show.append("牛肉堡******************"+run.order.client1.niuroubaon+"份\t"+"共"+run.order.client1.niuroubaon*run.order.client1.niuroubao+"元\n");
        if(run.order.client1.xueyubaon!=0)
            show.append("鳕鱼堡******************"+run.order.client1.xueyubaon+"份\t"+"共"+run.order.client1.xueyubaon*run.order.client1.xueyubao+"元\n");
        if(run.order.client1.num!=0)
            show.append("合计************************"+run.order.client1.num+"元");
        JPanel jpanel=new JPanel();

        jpanel.add(buttonxianjinzhifu);
        jpanel.add(buttonzhifubaosaoma);
        this.add(scrollpane);
        this.add(jpanel);
        buttonxianjinzhifu.addActionListener(new Xiadanact());
        buttonzhifubaosaoma.addActionListener(new Xiadanact());
    }
    public class Xiadanact implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buttonxianjinzhifu) {
                Xianjin xianjin=new Xianjin("现金支付");
            }
            if(e.getSource()==buttonzhifubaosaoma) {
                run.sao.setVisible(true);
            }
        }
    }
}