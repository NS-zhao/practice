import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Xiadan extends JFrame{
    JButton buttonxianjinzhifu=new JButton("�ֽ�֧��");
    JButton buttonzhifubaosaoma=new JButton("ɨ��֧��");
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
        show.append("*************��ӭ����KFC*************"+'\n');
        if(run.order.client1.kelen!=0)
            show.append("����*******************"+run.order.client1.kelen+"��\t"+"��"+run.order.client1.kelen*run.order.client1.kele+"Ԫ\n");
        if(run.order.client1.qixin!=0)
                show.append("��ϲ*****************"+run.order.client1.qixin+"��\t"+"��"+run.order.client1.qixin*run.order.client1.qixin+"Ԫ\n");
        if(run.order.client1.baixiangguon!=0)
            show.append("��ݮ�̲�*****************"+run.order.client1.baixiangguon+"��\t"+"��"+run.order.client1.baixiangguon*run.order.client1.baixiangguon+"Ԫ\n");
        if(run.order.client1.shutiaon!=0)
            show.append("����*******************"+run.order.client1.shutiaon+"��\t"+"��"+run.order.client1.shutiaon*run.order.client1.shutiao+"Ԫ\n");
        if(run.order.client1.jichin!=0)
            show.append("����*******************"+run.order.client1.jichin+"��\t"+"��"+run.order.client1.jichin*run.order.client1.jichi+"Ԫ\n");
        if(run.order.client1.dantan!=0)
            show.append("��̢*******************"+run.order.client1.dantan+"��\t"+"��"+run.order.client1.dantan*run.order.client1.danta+"Ԫ\n");
        if(run.order.client1.aoerliangbaon!=0)
            show.append("�¶������ȱ�***************"+run.order.client1.aoerliangbaon+"��\t"+"��"+run.order.client1.aoerliangbaon*run.order.client1.aoerliangbao+"Ԫ\n");
        if(run.order.client1.jituibaon!=0)
            show.append("�������ȱ�****************"+run.order.client1.jituibaon+"��\t"+"��"+run.order.client1.jituibaon*run.order.client1.jituibao+"Ԫ\n");
        if(run.order.client1.niuroubaon!=0)
            show.append("ţ�Ɽ******************"+run.order.client1.niuroubaon+"��\t"+"��"+run.order.client1.niuroubaon*run.order.client1.niuroubao+"Ԫ\n");
        if(run.order.client1.xueyubaon!=0)
            show.append("���㱤******************"+run.order.client1.xueyubaon+"��\t"+"��"+run.order.client1.xueyubaon*run.order.client1.xueyubao+"Ԫ\n");
        if(run.order.client1.num!=0)
            show.append("�ϼ�************************"+run.order.client1.num+"Ԫ");
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
                Xianjin xianjin=new Xianjin("�ֽ�֧��");
            }
            if(e.getSource()==buttonzhifubaosaoma) {
                run.sao.setVisible(true);
            }
        }
    }
}