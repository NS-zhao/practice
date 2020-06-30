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
	JButton buttonhanbao=new JButton("ºº±¤");
	JButton buttonxiaochi=new JButton("Ğ¡³Ô");
	JButton buttonyinpin=new JButton("ÒûÆ·");
	JButton buttontaocan=new JButton("Ì×²Í");
	JButton buttonpeigenjituiyanmaibaof=new JButton("-");
	JButton buttonpeigenjituiyanmaibaoz=new JButton("+");
	JButton buttonjituibaof=new JButton("-");
	JButton buttonjituibaoz=new JButton("+");
	JButton buttonxianxiabaof=new JButton("-");
	JButton buttonxianxiabaoz=new JButton("+");
	JButton buttonniuroubaof=new JButton("-");
	JButton buttonniuroubaoz=new JButton("+");
	JButton buttonaoerliangjituibaof=new JButton("-");
	JButton buttonaoerliangjituibaoz=new JButton("+");
	JButton buttonxueyubaof=new JButton("-");
	JButton buttonxueyubaoz=new JButton("+");
	JButton buttonshutiaof=new JButton("-");
	JButton buttonshutiaoz=new JButton("+");
	JButton buttonjiroujuanf=new JButton("-");
	JButton buttonjiroujuanz=new JButton("+");
	JButton buttonjichif=new JButton("-");
	JButton buttonjichiz=new JButton("+");
	JButton buttondantaf=new JButton("-");
	JButton buttondantaz=new JButton("+");
	JButton buttonkelef=new JButton("-");
	JButton buttonkelez=new JButton("+");
	JButton buttonlanmeinaichaf=new JButton("-");
	JButton buttonlanmeinaichaz=new JButton("+");
	JButton buttonmeizisuanchaf=new JButton("-");
	JButton buttonmeizisuanchaz=new JButton("+");
	JButton buttoncaomeinaichaf=new JButton("-");
	JButton buttoncaomeinaichaz=new JButton("+");
	JButton buttonxianglajituibaotaocanf=new JButton("-");
	JButton buttonxianglajituibaotaocanz=new JButton("+");
	JButton buttonniuroubaotaocanf=new JButton("-");
	JButton buttonniuroubaotaocanz=new JButton("+");
	JButton buttonxueyubaotaocanf=new JButton("-");
	JButton buttonxueyubaotaocanz=new JButton("+");
	JButton buttonxianxiabaotaocanf=new JButton("-");
	JButton buttonxianxiabaotaocanz=new JButton("+");
	JPanel jpaneln1=new JPanel();
	JPanel jpaneln2=new JPanel();
	JPanel jpaneln3=new JPanel();
	JPanel jpaneln4=new JPanel();
	JPanel jpaneln5=new JPanel();
	JPanel jpaneln6=new JPanel();
	JButton buttonxiadan=new JButton(new ImageIcon("images/xiadan3.png"));
	JLabel im1 = new JLabel(new ImageIcon("images/niuroubao.png"));
	JLabel im2 = new JLabel(new ImageIcon("images/xianxiabao.png"));
	JLabel im3 = new JLabel(new ImageIcon("images/xueyubao.png"));
	JLabel im4 = new JLabel(new ImageIcon("images/peigenjituiyanmaibao.png"));
	JLabel im5 = new JLabel(new ImageIcon("images/xianglajituibao.png"));
	JLabel im6 = new JLabel(new ImageIcon("images/aoerliangjituibao.png"));
	JLabel imkele=new JLabel(new ImageIcon("images/kele.png"));
	JLabel imjichi=new JLabel(new ImageIcon("images/jichi.png"));
	JLabel imdanta=new JLabel(new ImageIcon("images/danta.png"));
	JLabel imlanmeinaicha=new JLabel(new ImageIcon("images/lanmeinaicha.png"));
	JLabel imcaomeinaicha=new JLabel(new ImageIcon("images/caomeinaicha.png"));
	JLabel immeizisuancha=new JLabel(new ImageIcon("images/meizisuancha.png"));
	JLabel imjiroujuan=new JLabel(new ImageIcon("images/jiroujuan.png"));
	JLabel imshutiao=new JLabel(new ImageIcon("images/shutiao2.png"));
	JLabel imniuroubaotaocan=new JLabel(new ImageIcon("images/niuroubaotaocan.png"));
	JLabel imxianxiabaotaocan=new JLabel(new ImageIcon("images/xianxiabaotaocan.png"));
	JLabel imxianglajituibaotaocan=new JLabel(new ImageIcon("images/xianglajituibaotaocan.png"));
	JLabel imxueyubaotaocan=new JLabel(new ImageIcon("images/xueyubaotaocan.png"));
	JLabel titlezhuti = new JLabel("»¶Ó­¹âÁÙKFC",JLabel.CENTER);
	JLabel titlepeigenjituiyanmaibao = new JLabel("Åà¸ù¼¦ÍÈÑàÂó±¤",JLabel.CENTER);
	JLabel titlexianglajituibao = new JLabel("ÏãÀ±¼¦ÍÈ±¤",JLabel.CENTER);
	JLabel titlexianxiabao = new JLabel("ÏÊÏº±¤",JLabel.CENTER);
	JLabel titleniuroubao = new JLabel("Å£Èâ±¤",JLabel.CENTER);
	JLabel titleaoerliangjituibao = new JLabel("°Â¶ûÁ¼¼¦ÍÈ±¤",JLabel.CENTER);
	JLabel titlexueyubao = new JLabel("÷¨Óã±¤",JLabel.CENTER);
	JLabel titlekele=new JLabel("¿ÉÀÖ",JLabel.CENTER);
	JLabel titlejichi=new JLabel("¼¦³á",JLabel.CENTER);
	JLabel titledanta=new JLabel("µ°Ì¢",JLabel.CENTER);
	JLabel titlelanmeinaicha=new JLabel("À¶İ®ÄÌ²è",JLabel.CENTER);
	JLabel titlecaomeinaicha=new JLabel("²İİ®ÄÌ²è",JLabel.CENTER);
	JLabel titlemeizisuancha=new JLabel("Ã·×ÓËá²è",JLabel.CENTER);
	JLabel titlejiroujuan=new JLabel("¼¦Èâ¾í",JLabel.CENTER);
	JLabel titleshutiao=new JLabel("ÊíÌõ",JLabel.CENTER);
	JLabel titleniuroubaotaocan=new JLabel("Å£Èâ±¤Ì×²Í",JLabel.CENTER);
	JLabel titlexianxiabaotaocan=new JLabel("ÏÊÏº±¤Ì×²Í",JLabel.CENTER);
	JLabel titlexianglajituibaotaocan=new JLabel("ÏãÀ±¼¦ÍÈ±¤Ì×²Í",JLabel.CENTER);
	JLabel titlexueyubaotaocan=new JLabel("÷¨Óã±¤Ì×²Í",JLabel.CENTER);
	client client1=new client();
	public Order(String name)
	{
		super(name);
		buttonaoerliangjituibaof.addActionListener(new Orderact());
		buttonaoerliangjituibaoz.addActionListener(new Orderact());
		buttonpeigenjituiyanmaibaof.addActionListener(new Orderact());
		buttonpeigenjituiyanmaibaoz.addActionListener(new Orderact());
		buttonjituibaof.addActionListener(new Orderact());
		buttonjituibaoz.addActionListener(new Orderact());
		buttonxianxiabaof.addActionListener(new Orderact());
		buttonxianxiabaoz.addActionListener(new Orderact());
		buttonniuroubaof.addActionListener(new Orderact());
		buttonniuroubaoz.addActionListener(new Orderact());
		buttonxueyubaof.addActionListener(new Orderact());
		buttonxueyubaoz.addActionListener(new Orderact());
		buttonshutiaof.addActionListener(new Orderact());
		buttonshutiaoz.addActionListener(new Orderact());
		buttonjichif.addActionListener(new Orderact());
		buttonjichiz.addActionListener(new Orderact());
		buttonjiroujuanf.addActionListener(new Orderact());
		buttonjiroujuanz.addActionListener(new Orderact());
		buttondantaf.addActionListener(new Orderact());
		buttondantaz.addActionListener(new Orderact());
		buttonlanmeinaichaf.addActionListener(new Orderact());
		buttonlanmeinaichaz.addActionListener(new Orderact());
		buttonkelef.addActionListener(new Orderact());
		buttonkelez.addActionListener(new Orderact());
		buttoncaomeinaichaf.addActionListener(new Orderact());
		buttoncaomeinaichaz.addActionListener(new Orderact());
		buttonmeizisuanchaf.addActionListener(new Orderact());
		buttonmeizisuanchaz.addActionListener(new Orderact());
		buttonxianglajituibaotaocanf.addActionListener(new Orderact());
		buttonxianglajituibaotaocanz.addActionListener(new Orderact());
		buttonxianxiabaotaocanf.addActionListener(new Orderact());
		buttonxianxiabaotaocanz.addActionListener(new Orderact());
		buttonniuroubaotaocanf.addActionListener(new Orderact());
		buttonniuroubaotaocanz.addActionListener(new Orderact());
		buttonxueyubaotaocanf.addActionListener(new Orderact());
		buttonxueyubaotaocanz.addActionListener(new Orderact());
		buttonhanbao.addActionListener(new Orderact());
		buttonxiaochi.addActionListener(new Orderact());
		buttonyinpin.addActionListener(new Orderact());
		buttontaocan.addActionListener(new Orderact());
		buttonxiadan.addActionListener(new Orderact());
		shuahanbao();
	}
	public void shuahanbao() {
		String string;
		titlezhuti.setFont(new Font("»¶Ó­¹âÁÙKFC",Font.BOLD,50) );
		jpanel1.add(titlezhuti);
		add(jpanel1,BorderLayout.NORTH);
		jpanel2.setLayout(new GridLayout(4,1));
		buttonhanbao.setContentAreaFilled(false);
		buttonxiaochi.setContentAreaFilled(false);
		buttonyinpin.setContentAreaFilled(false);
		buttontaocan.setContentAreaFilled(false);
		jpanel2.add(buttonhanbao);
		jpanel2.add(buttonxiaochi);
		jpanel2.add(buttonyinpin);
		jpanel2.add(buttontaocan);
		add(jpanel2,BorderLayout.LINE_START);
		jpanel3.setLayout(new GridLayout(6,3));
		jpanel3.add(titlepeigenjituiyanmaibao);
		jpanel3.add(im4);
		
		jpaneln1.setLayout(new GridLayout(1,3));
		jpaneln1.add(buttonpeigenjituiyanmaibaof);
		string=String.valueOf(client1.peigenjituiyanmaibaon);
		JLabel title1 = new JLabel(string,JLabel.CENTER);
		jpaneln1.add(title1);
		jpaneln1.add(buttonpeigenjituiyanmaibaoz);
		jpanel3.add(jpaneln1);
		jpanel3.add(titlexianglajituibao);
		jpanel3.add(im5);
		
		jpaneln2.setLayout(new GridLayout(1,3));
		jpaneln2.add(buttonjituibaof);
		string=String.valueOf(client1.jituibaon);
		JLabel title2 = new JLabel(string,JLabel.CENTER);
		jpaneln2.add(title2);
		jpaneln2.add(buttonjituibaoz);
		jpanel3.add(jpaneln2);
		jpanel3.add(titlexianxiabao);
		jpanel3.add(im2);
		
		jpaneln3.setLayout(new GridLayout(1,3));
		jpaneln3.add(buttonxianxiabaof);
		string=String.valueOf(client1.xianxiabaon);
		JLabel title3 = new JLabel(string,JLabel.CENTER);
		jpaneln3.add(title3);
		jpaneln3.add(buttonxianxiabaoz);
		jpanel3.add(jpaneln3);
		jpanel3.add(titleniuroubao);
		jpanel3.add(im1);
		
		jpaneln4.setLayout(new GridLayout(1,3));
		jpaneln4.add(buttonniuroubaof);
		string=String.valueOf(client1.niuroubaon);
		JLabel title4 = new JLabel(string,JLabel.CENTER);
		jpaneln4.add(title4);
		jpaneln4.add(buttonniuroubaoz);
		jpanel3.add(jpaneln4);
		jpanel3.add(titleaoerliangjituibao);
		jpanel3.add(im6);
		
		jpaneln5.setLayout(new GridLayout(1,3));
		jpaneln5.add(buttonaoerliangjituibaof);
		string=String.valueOf(client1.aoerliangbaon);
		JLabel title5 = new JLabel(string,JLabel.CENTER);
		jpaneln5.add(title5);
		jpaneln5.add(buttonaoerliangjituibaoz);
		jpanel3.add(jpaneln5);
		jpanel3.add(titlexueyubao);
		jpanel3.add(im3);
		
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
	public void shuaxiaochi()
	{
		String string;
		titlezhuti.setFont(new Font("»¶Ó­¹âÁÙKFC",Font.BOLD,50) );
		jpanel1.add(titlezhuti);
		add(jpanel1,BorderLayout.NORTH);
		jpanel2.setLayout(new GridLayout(4,1));
		buttonhanbao.setBorderPainted(false);
		buttonxiaochi.setBorderPainted(false);
		buttonyinpin.setBorderPainted(false);
		buttontaocan.setBorderPainted(false);
		jpanel2.add(buttonhanbao);
		jpanel2.add(buttonxiaochi);
		jpanel2.add(buttonyinpin);
		jpanel2.add(buttontaocan);
		add(jpanel2,BorderLayout.LINE_START);
		jpanel3.setLayout(new GridLayout(4,3));
		jpanel3.add(titleshutiao);
		jpanel3.add(imshutiao);
		
		jpaneln1.setLayout(new GridLayout(1,3));
		jpaneln1.add(buttonshutiaof);
		string=String.valueOf(client1.shutiaon);
		JLabel title1 = new JLabel(string,JLabel.CENTER);
		jpaneln1.add(title1);
		jpaneln1.add(buttonshutiaoz);
		jpanel3.add(jpaneln1);

		jpanel3.add(titlejichi);
		jpanel3.add(imjichi);
		
		jpaneln2.setLayout(new GridLayout(1,3));
		jpaneln2.add(buttonjichif);
		string=String.valueOf(client1.jichin);
		JLabel title2 = new JLabel(string,JLabel.CENTER);
		jpaneln2.add(title2);
		jpaneln2.add(buttonjichiz);
		jpanel3.add(jpaneln2);

		jpanel3.add(titlejiroujuan);
		jpanel3.add(imjiroujuan);
		
		jpaneln3.setLayout(new GridLayout(1,3));
		jpaneln3.add(buttonjiroujuanf);
		string=String.valueOf(client1.jiroujuann);
		JLabel title3 = new JLabel(string,JLabel.CENTER);
		jpaneln3.add(title3);
		jpaneln3.add(buttonjiroujuanz);
		jpanel3.add(jpaneln3);

		jpanel3.add(titledanta);
		jpanel3.add(imdanta);
		
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
	public void shuayinpin()
	{
		String string;
		titlezhuti.setFont(new Font("»¶Ó­¹âÁÙKFC",Font.BOLD,50) );
		jpanel1.add(titlezhuti);
		add(jpanel1,BorderLayout.NORTH);
		jpanel2.setLayout(new GridLayout(4,1));
		buttonhanbao.setBorderPainted(false);
		buttonxiaochi.setBorderPainted(false);
		buttonyinpin.setBorderPainted(false);
		buttontaocan.setBorderPainted(false);
		jpanel2.add(buttonhanbao);
		jpanel2.add(buttonxiaochi);
		jpanel2.add(buttonyinpin);
		jpanel2.add(buttontaocan);
		add(jpanel2,BorderLayout.LINE_START);
		jpanel3.setLayout(new GridLayout(4,3));
		jpanel3.add(titlekele);
		jpanel3.add(imkele);
		
		jpaneln1.setLayout(new GridLayout(1,3));
		jpaneln1.add(buttonkelef);
		string=String.valueOf(client1.kelen);
		JLabel title1 = new JLabel(string,JLabel.CENTER);
		jpaneln1.add(title1);
		jpaneln1.add(buttonkelez);
		jpanel3.add(jpaneln1);

		jpanel3.add(titlemeizisuancha);
		jpanel3.add(immeizisuancha);
		
		jpaneln2.setLayout(new GridLayout(1,3));
		jpaneln2.add(buttonmeizisuanchaf);
		string=String.valueOf(client1.meizisuanchan);
		JLabel title2 = new JLabel(string,JLabel.CENTER);
		jpaneln2.add(title2);
		jpaneln2.add(buttonmeizisuanchaz);
		jpanel3.add(jpaneln2);

		jpanel3.add(titlelanmeinaicha);
		jpanel3.add(imlanmeinaicha);
		
		jpaneln3.setLayout(new GridLayout(1,3));
		jpaneln3.add(buttonlanmeinaichaf);
		string=String.valueOf(client1.lanmeinaichan);
		JLabel title3 = new JLabel(string,JLabel.CENTER);
		jpaneln3.add(title3);
		jpaneln3.add(buttonlanmeinaichaz);
		jpanel3.add(jpaneln3);

		jpanel3.add(titlecaomeinaicha);
		jpanel3.add(imcaomeinaicha);
		
		jpaneln4.setLayout(new GridLayout(1,3));
		jpaneln4.add(buttoncaomeinaichaf);
		string=String.valueOf(client1.caomeinaichan);
		JLabel title4 = new JLabel(string,JLabel.CENTER);
		jpaneln4.add(title4);
		jpaneln4.add(buttoncaomeinaichaz);
		jpanel3.add(jpaneln4);

		jspanel3.setViewportView(jpanel3);
		add(jspanel3,BorderLayout.CENTER);
		add(jpanel4,BorderLayout.LINE_END);
		jpanel5.add(buttonxiadan);
		add(jpanel5,BorderLayout.SOUTH);
	}
	public void shuataocan()
	{
		String string;
		titlezhuti.setFont(new Font("»¶Ó­¹âÁÙKFC",Font.BOLD,50) );
		jpanel1.add(titlezhuti);
		add(jpanel1,BorderLayout.NORTH);
		jpanel2.setLayout(new GridLayout(4,1));
		buttonhanbao.setBorderPainted(false);
		buttonxiaochi.setBorderPainted(false);
		buttonyinpin.setBorderPainted(false);
		buttontaocan.setBorderPainted(false);
		jpanel2.add(buttonhanbao);
		jpanel2.add(buttonxiaochi);
		jpanel2.add(buttonyinpin);
		jpanel2.add(buttontaocan);
		add(jpanel2,BorderLayout.LINE_START);
		jpanel3.setLayout(new GridLayout(4,3));
		jpanel3.add(titlexianglajituibaotaocan);
		jpanel3.add(imxianglajituibaotaocan);
		
		jpaneln1.setLayout(new GridLayout(1,3));
		jpaneln1.add(buttonxianglajituibaotaocanf);
		string=String.valueOf(client1.xianglajituibaotaocann);
		JLabel title1 = new JLabel(string,JLabel.CENTER);
		jpaneln1.add(title1);
		jpaneln1.add(buttonxianglajituibaotaocanz);
		jpanel3.add(jpaneln1);

		jpanel3.add(titlexianxiabaotaocan);
		jpanel3.add(imxianxiabaotaocan);
		
		jpaneln2.setLayout(new GridLayout(1,3));
		jpaneln2.add(buttonxianxiabaotaocanf);
		string=String.valueOf(client1.xianxiabaotaocann);
		JLabel title2 = new JLabel(string,JLabel.CENTER);
		jpaneln2.add(title2);
		jpaneln2.add(buttonxianxiabaotaocanz);
		jpanel3.add(jpaneln2);

		jpanel3.add(titleniuroubaotaocan);
		jpanel3.add(imniuroubaotaocan);
		
		jpaneln3.setLayout(new GridLayout(1,3));
		jpaneln3.add(buttonniuroubaotaocanf);
		string=String.valueOf(client1.niuroubaotaocann);
		JLabel title3 = new JLabel(string,JLabel.CENTER);
		jpaneln3.add(title3);
		jpaneln3.add(buttonniuroubaotaocanz);
		jpanel3.add(jpaneln3);

		jpanel3.add(titlexueyubaotaocan);
		jpanel3.add(imxueyubaotaocan);
		
		jpaneln4.setLayout(new GridLayout(1,3));
		jpaneln4.add(buttonxueyubaotaocanf);
		string=String.valueOf(client1.xueyubaotaocann);
		JLabel title4 = new JLabel(string,JLabel.CENTER);
		jpaneln4.add(title4);
		jpaneln4.add(buttonxueyubaotaocanz);
		jpanel3.add(jpaneln4);

		jspanel3.setViewportView(jpanel3);
		add(jspanel3,BorderLayout.CENTER);
		add(jpanel4,BorderLayout.LINE_END);
		buttonxiadan.setContentAreaFilled(false);
		jpanel5.add(buttonxiadan);
		add(jpanel5,BorderLayout.SOUTH);
	}
	private class Orderact implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==buttonaoerliangjituibaof){
				if(client1.aoerliangbaon>0) {
					client1.aoerliangbaon--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.aoerliangbaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonaoerliangjituibaoz) {
				client1.aoerliangbaon++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.aoerliangbaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonpeigenjituiyanmaibaof){
				if(client1.peigenjituiyanmaibaon>0) {
					client1.peigenjituiyanmaibaon--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.peigenjituiyanmaibaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonpeigenjituiyanmaibaoz) {
				client1.peigenjituiyanmaibaon++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.peigenjituiyanmaibaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.jituibaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.jituibaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonxianxiabaof){
				if(client1.xianxiabaon>0) {
					client1.xianxiabaon--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xianxiabaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonxianxiabaoz) {
				client1.xianxiabaon++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xianxiabaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.niuroubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.niuroubaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuahanbao();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuahanbao();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuaxiaochi();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuaxiaochi();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuaxiaochi();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuaxiaochi();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonjiroujuanf){
				if(client1.jiroujuann>0) {
					client1.jiroujuann--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuaxiaochi();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonjiroujuanz) {
				client1.jiroujuann++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuaxiaochi();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuaxiaochi();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuaxiaochi();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuayinpin();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
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
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuayinpin();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonlanmeinaichaf){
				if(client1.lanmeinaichan>0) {
					client1.lanmeinaichan--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuayinpin();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonlanmeinaichaz) {
				client1.lanmeinaichan++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuayinpin();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttoncaomeinaichaf){
				if(client1.caomeinaichan>0) {
					client1.caomeinaichan--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuayinpin();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttoncaomeinaichaz) {
				client1.caomeinaichan++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuayinpin();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonmeizisuanchaf){
				if(client1.meizisuanchan>0) {
					client1.meizisuanchan--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuayinpin();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonmeizisuanchaz) {
				client1.meizisuanchan++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuayinpin();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonxianglajituibaotaocanf){
				if(client1.xianglajituibaotaocann>0) {
					client1.xianglajituibaotaocann--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuataocan();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonxianglajituibaotaocanz) {
				client1.xianglajituibaotaocann++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuataocan();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}		
			if(e.getSource()==buttonxueyubaotaocanf){
				if(client1.xueyubaotaocann>0) {
					client1.xueyubaotaocann--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuataocan();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonxueyubaotaocanz) {
				client1.xueyubaotaocann++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuataocan();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonniuroubaotaocanf){
				if(client1.niuroubaotaocann>0) {
					client1.niuroubaotaocann--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuataocan();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonniuroubaotaocanz) {
				client1.niuroubaotaocann++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuataocan();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttonxianxiabaotaocanf){
				if(client1.xianxiabaotaocann>0) {
					client1.xianxiabaotaocann--;
					jpaneln1.removeAll();
					jpaneln2.removeAll();
					jpaneln3.removeAll();
					jpaneln4.removeAll();
					jpaneln5.removeAll();
					jpaneln6.removeAll();
					//remove(jpanel1);
					//remove(jpanel2);
					//remove(jspanel3);
					//remove(jpanel4);
					//remove(jpanel5);
					shuataocan();
					//run.order.repaint();
					getContentPane().validate();
					//System.out.println(client1.xueyubaon);
					//run.frames[1].setVisible(true);
				}
			}
			if(e.getSource()==buttonxianxiabaotaocanz) {
				client1.xianxiabaotaocann++;
				jpaneln1.removeAll();
				jpaneln2.removeAll();
				jpaneln3.removeAll();
				jpaneln4.removeAll();
				jpaneln5.removeAll();
				jpaneln6.removeAll();
				//remove(jpanel1);
				//remove(jpanel2);
				//remove(jspanel3);
				//remove(jpanel4);
				//remove(jpanel5);
				shuataocan();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
			}
			if(e.getSource()==buttontaocan) {
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
				shuataocan();
				//run.order.repaint();
				getContentPane().validate();
				//System.out.println(client1.xueyubaon);
				//run.frames[1].setVisible(true);
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