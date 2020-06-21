package KFC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Order extends JFrame{
    JScrollPane jspanel3=new JScrollPane();
    JPanel jpanel1=new JPanel();
    JPanel jpanel2=new JPanel();
    JPanel jpanel3=new JPanel();
    JPanel jpanel4=new JPanel();
    JPanel jpanel5=new JPanel();

    JButton buttonhanbao=new JButton("汉堡");
    JButton buttonxiaochi=new JButton("小吃");
    JButton buttonyinpin=new JButton("饮品");

    JButton buttonjituibaof=new JButton("-");
    JButton buttonjituibaoz=new JButton("+");
    JButton buttonxueyubaof=new JButton("-");
    JButton buttonxueyubaoz=new JButton("+");
    JButton buttonaoerliangbaof=new JButton("-");
    JButton buttonaoerliangbaoz=new JButton("+");
    JButton buttonniuroubaof=new JButton("-");
    JButton buttonniuroubaoz=new JButton("+");

    JButton buttonjichif=new JButton("-");
    JButton buttonjichiz=new JButton("+");
    JButton buttondantaf=new JButton("-");
    JButton buttondantaz=new JButton("+");
    JButton buttonshutiaof=new JButton("-");
    JButton buttonshutiaoz=new JButton("+");

    JButton buttonkelef=new JButton("-");
    JButton buttonkelez=new JButton("+");
    JButton buttonqixif=new JButton("-");
    JButton buttonqixiz=new JButton("+");
    JButton buttonbaixiangguof=new JButton("-");
    JButton buttonbaixiangguoz=new JButton("+");
    JButton buttonxiadan=new JButton("下单");
    JPanel jpaneln1=new JPanel();
    JPanel jpaneln2=new JPanel();
    JPanel jpaneln3=new JPanel();
    JPanel jpaneln4=new JPanel();
    JPanel jpaneln5=new JPanel();
    JPanel jpaneln6=new JPanel();
    JLabel titlezhuti = new JLabel("欢迎光临KFC",JLabel.CENTER);
    JLabel titlexianglajituibao = new JLabel("香辣鸡腿堡",JLabel.CENTER);
    JLabel titlexueyubao = new JLabel("鳕鱼堡",JLabel.CENTER);
    JLabel titleaoerliangjituibao = new JLabel("奥尔良鸡腿堡",JLabel.CENTER);
    JLabel titleniuroubao = new JLabel("牛肉堡",JLabel.CENTER);
    JLabel titlejichi=new JLabel("鸡翅",JLabel.CENTER);
    JLabel titledanta=new JLabel("蛋挞",JLabel.CENTER);
    JLabel titleshutiao=new JLabel("薯条",JLabel.CENTER);
    JLabel titlekele=new JLabel("可乐",JLabel.CENTER);
    JLabel titleqixi=new JLabel("七喜",JLabel.CENTER);
    JLabel titlebaixiangguo=new JLabel("百香果",JLabel.CENTER);
    client client1=new client();
    public Order(String name) {
        super(name);
        buttonjituibaof.addActionListener(new Orderact());
        buttonjituibaoz.addActionListener(new Orderact());
        buttonxueyubaof.addActionListener(new Orderact());
        buttonxueyubaoz.addActionListener(new Orderact());
        buttonaoerliangbaof.addActionListener(new Orderact());
        buttonaoerliangbaoz.addActionListener(new Orderact());
        buttonniuroubaof.addActionListener(new Orderact());
        buttonniuroubaoz.addActionListener(new Orderact());

        buttonjichif.addActionListener(new Orderact());
        buttonjichiz.addActionListener(new Orderact());
        buttondantaf.addActionListener(new Orderact());
        buttondantaz.addActionListener(new Orderact());
        buttonshutiaof.addActionListener(new Orderact());
        buttonshutiaoz.addActionListener(new Orderact());

        buttonkelef.addActionListener(new Orderact());
        buttonkelez.addActionListener(new Orderact());
        buttonqixif.addActionListener(new Orderact());
        buttonqixiz.addActionListener(new Orderact());
        buttonbaixiangguof.addActionListener(new Orderact());
        buttonbaixiangguoz.addActionListener(new Orderact());
        buttonhanbao.addActionListener(new Orderact());
        buttonxiaochi.addActionListener(new Orderact());
        buttonyinpin.addActionListener(new Orderact());
        buttonxiadan.addActionListener(new Orderact());
        shuahanbao();
    }
    public void shuahanbao() {
        String string;
        titlezhuti.setFont(new Font("欢迎光临KFC",Font.BOLD,50) );
        jpanel1.add(titlezhuti);
        add(jpanel1,BorderLayout.NORTH);
        jpanel2.setLayout(new GridLayout(3,1));
        buttonhanbao.setContentAreaFilled(false);
        buttonxiaochi.setContentAreaFilled(false);
        buttonyinpin.setContentAreaFilled(false);
        jpanel2.add(buttonhanbao);
        jpanel2.add(buttonxiaochi);
        jpanel2.add(buttonyinpin);
        add(jpanel2,BorderLayout.LINE_START);
        jpanel3.setLayout(new GridLayout(4,3));
        jpaneln1.setLayout(new GridLayout(1,3));

        jpanel3.add(titlexianglajituibao);
        jpaneln2.setLayout(new GridLayout(1,3));
        jpaneln2.add(buttonjituibaof);
        string=String.valueOf(client1.jituibaon);
        JLabel title2 = new JLabel(string,JLabel.CENTER);
        jpaneln2.add(title2);
        jpaneln2.add(buttonjituibaoz);
        jpanel3.add(jpaneln2);

        jpanel3.add(titleniuroubao);
        jpaneln4.setLayout(new GridLayout(1,4));
        jpaneln4.add(buttonniuroubaof);
        string=String.valueOf(client1.niuroubaon);
        JLabel title4 = new JLabel(string,JLabel.CENTER);
        jpaneln4.add(title4);
        jpaneln4.add(buttonniuroubaoz);
        jpanel3.add(jpaneln4);

        jpanel3.add(titleaoerliangjituibao);
        jpaneln5.setLayout(new GridLayout(1,3));
        jpaneln5.add(buttonaoerliangbaof);
        string=String.valueOf(client1.aoerliangbaon);
        JLabel title5 = new JLabel(string,JLabel.CENTER);
        jpaneln5.add(title5);
        jpaneln5.add(buttonaoerliangbaoz);
        jpanel3.add(jpaneln5);

        jpanel3.add(titlexueyubao);
        jpaneln6.setLayout(new GridLayout(1,3));
        jpaneln6.add(buttonxueyubaof);
        string=String.valueOf(client1.xueyubaon);
        JLabel title6 = new JLabel(string,JLabel.CENTER);
        jpaneln6.add(title6);
        jpaneln6.add(buttonxueyubaoz);
        jpanel3.add(jpaneln6);

        jspanel3.setViewportView(jpanel3);
        add(jspanel3,BorderLayout.CENTER);
        add(jpanel4,BorderLayout.LINE_END);
        buttonxiadan.setContentAreaFilled(false);
        jpanel5.add(buttonxiadan);
        add(jpanel5,BorderLayout.SOUTH);
    }
    public void shuaxiaochi() {
        String string;
        titlezhuti.setFont(new Font("欢迎光临KFC",Font.BOLD,50) );
        jpanel1.add(titlezhuti);
        add(jpanel1,BorderLayout.NORTH);
        jpanel2.setLayout(new GridLayout(3,1));
        buttonhanbao.setBorderPainted(false);
        buttonxiaochi.setBorderPainted(false);
        buttonyinpin.setBorderPainted(false);
        jpanel2.add(buttonhanbao);
        jpanel2.add(buttonxiaochi);
        jpanel2.add(buttonyinpin);
        add(jpanel2,BorderLayout.LINE_START);
        jpanel3.setLayout(new GridLayout(3,3));

        jpanel3.add(titleshutiao);
        jpaneln1.setLayout(new GridLayout(1,3));
        jpaneln1.add(buttonshutiaof);
        string=String.valueOf(client1.shutiaon);
        JLabel title1 = new JLabel(string,JLabel.CENTER);
        jpaneln1.add(title1);
        jpaneln1.add(buttonshutiaoz);
        jpanel3.add(jpaneln1);

        jpanel3.add(titlejichi);
        jpaneln2.setLayout(new GridLayout(1,3));
        jpaneln2.add(buttonjichif);
        string=String.valueOf(client1.jichin);
        JLabel title2 = new JLabel(string,JLabel.CENTER);
        jpaneln2.add(title2);
        jpaneln2.add(buttonjichiz);
        jpanel3.add(jpaneln2);

        jpanel3.add(titledanta);
        jpaneln4.setLayout(new GridLayout(1,3));
        jpaneln4.add(buttondantaf);
        string=String.valueOf(client1.dantan);
        JLabel title4 = new JLabel(string,JLabel.CENTER);
        jpaneln4.add(title4);
        jpaneln4.add(buttondantaz);
        jpanel3.add(jpaneln4);

        jspanel3.setViewportView(jpanel3);
        add(jspanel3,BorderLayout.CENTER);
        add(jpanel4,BorderLayout.LINE_END);
        jpanel5.add(buttonxiadan);
        add(jpanel5,BorderLayout.SOUTH);
    }
    public void shuayinpin() {
        String string;
        titlezhuti.setFont(new Font("欢迎光临KFC",Font.BOLD,50) );
        jpanel1.add(titlezhuti);
        add(jpanel1,BorderLayout.NORTH);
        jpanel2.setLayout(new GridLayout(3,1));
        buttonhanbao.setBorderPainted(false);
        buttonxiaochi.setBorderPainted(false);
        buttonyinpin.setBorderPainted(false);
        jpanel2.add(buttonhanbao);
        jpanel2.add(buttonxiaochi);
        jpanel2.add(buttonyinpin);
        add(jpanel2,BorderLayout.LINE_START);
        jpanel3.setLayout(new GridLayout(3,3));

        jpanel3.add(titlekele);
        jpaneln1.setLayout(new GridLayout(1,3));
        jpaneln1.add(buttonkelef);
        string=String.valueOf(client1.kelen);
        JLabel title1 = new JLabel(string,JLabel.CENTER);
        jpaneln1.add(title1);
        jpaneln1.add(buttonkelez);
        jpanel3.add(jpaneln1);

        jpanel3.add(titleqixi);
        jpaneln2.setLayout(new GridLayout(1,3));
        jpaneln2.add(buttonqixif);
        string=String.valueOf(client1.qixin);
        JLabel title2 = new JLabel(string,JLabel.CENTER);
        jpaneln2.add(title2);
        jpaneln2.add(buttonqixiz);
        jpanel3.add(jpaneln2);

        jpanel3.add(titlebaixiangguo);
        jpaneln3.setLayout(new GridLayout(1,3));
        jpaneln3.add(buttonbaixiangguof);
        string=String.valueOf(client1.baixiangguon);
        JLabel title3 = new JLabel(string,JLabel.CENTER);
        jpaneln3.add(title3);
        jpaneln3.add(buttonbaixiangguoz);
        jpanel3.add(jpaneln3);

        jspanel3.setViewportView(jpanel3);
        add(jspanel3,BorderLayout.CENTER);
        add(jpanel4,BorderLayout.LINE_END);
        jpanel5.add(buttonxiadan);
        add(jpanel5,BorderLayout.SOUTH);
    }
    private class Orderact implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buttonaoerliangbaof){
                if(client1.aoerliangbaon>0) {
                    client1.aoerliangbaon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuahanbao();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonaoerliangbaoz) {
                client1.aoerliangbaon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuahanbao();
                getContentPane().validate();
            }
            if(e.getSource()==buttonjituibaof){
                if(client1.jituibaon>0) {
                    client1.jituibaon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuahanbao();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonjituibaoz) {
                client1.jituibaon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuahanbao();
                getContentPane().validate();
            }
            if(e.getSource()==buttonniuroubaof){
                if(client1.niuroubaon>0) {
                    client1.niuroubaon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuahanbao();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonniuroubaoz) {
                client1.niuroubaon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuahanbao();
                getContentPane().validate();
            }
            if(e.getSource()==buttonxueyubaof){
                if(client1.xueyubaon>0) {
                    client1.xueyubaon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuahanbao();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonxueyubaoz) {
                client1.xueyubaon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuahanbao();
                getContentPane().validate();
            }
            if(e.getSource()==buttonshutiaof){
                if(client1.shutiaon>0) {
                    client1.shutiaon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuaxiaochi();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonshutiaoz) {
                client1.shutiaon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuaxiaochi();
                getContentPane().validate();
            }
            if(e.getSource()==buttonjichif){
                if(client1.jichin>0) {
                    client1.jichin--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuaxiaochi();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonjichiz) {
                client1.jichin++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuaxiaochi();
                getContentPane().validate();
            }
            if(e.getSource()==buttondantaf){
                if(client1.dantan>0) {
                    client1.dantan--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuaxiaochi();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttondantaz) {
                client1.dantan++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuaxiaochi();
                getContentPane().validate();
            }
            if(e.getSource()==buttonkelef){
                if(client1.kelen>0) {
                    client1.kelen--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuayinpin();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonkelez) {
                client1.kelen++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuayinpin();
                getContentPane().validate();
            }
            if(e.getSource()==buttonqixif){
                if(client1.qixin>0) {
                    client1.qixin--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuayinpin();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonqixiz) {
                client1.qixin++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuayinpin();
                getContentPane().validate();
            }
            if(e.getSource()==buttonbaixiangguof){
                if(client1.baixiangguon>0) {
                    client1.baixiangguon--;
                    jpaneln1.removeAll();
                    jpaneln2.removeAll();
                    jpaneln3.removeAll();
                    jpaneln4.removeAll();
                    jpaneln5.removeAll();
                    jpaneln6.removeAll();
                    shuayinpin();
                    getContentPane().validate();
                }
            }
            if(e.getSource()==buttonbaixiangguoz) {
                client1.baixiangguon++;
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                shuayinpin();
                getContentPane().validate();
            }
            if(e.getSource()==buttonxiaochi) {
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                jpanel1.removeAll();
                jpanel2.removeAll();
                jpanel3.removeAll();
                jpanel4.removeAll();
                jpanel5.removeAll();
                shuaxiaochi();
                getContentPane().validate();
            }
            if(e.getSource()==buttonhanbao) {
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                jpanel1.removeAll();
                jpanel2.removeAll();
                jpanel3.removeAll();
                jpanel4.removeAll();
                jpanel5.removeAll();
                shuahanbao();
                getContentPane().validate();
            }
            if(e.getSource()==buttonyinpin) {
                jpaneln1.removeAll();
                jpaneln2.removeAll();
                jpaneln3.removeAll();
                jpaneln4.removeAll();
                jpaneln5.removeAll();
                jpaneln6.removeAll();
                jpanel1.removeAll();
                jpanel2.removeAll();
                jpanel3.removeAll();
                jpanel4.removeAll();
                jpanel5.removeAll();
                shuayinpin();
                getContentPane().validate();
            }
            if(e.getSource()==buttonxiadan) {
                if(client1.jisuan()>0) {
                    run.xiadan.s();
                    run.xiadan.setVisible(true);
                }
            }
        }
    }
}