package U3Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScientificInterface extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nb; 
	JLabel nB,result;
	JButton qd,log,rp,abv,sr,fc,st,bs;
	JFrame scientific;
	
	public void display2() {
		scientific = new JFrame("Scientific Calculator");
		
		nb = new JTextField();
		nb.setBounds(40, 50, 80, 35);
		
		qd = new JButton("X²");
		qd.setBounds(160, 50, 60, 35);
		qd.addActionListener(this);
		log = new JButton("logX");
		log.setBounds(160, 110, 60, 35);
		log.addActionListener(this);
		rp = new JButton("1/X");
		rp.setBounds(230, 50, 60, 35);
		rp.addActionListener(this);
		abv = new JButton("|X|");
		abv.setBounds(230, 110, 60, 35);
		abv.addActionListener(this);
		sr = new JButton("√X");
		sr.setBounds(300, 50, 60, 35);
		sr.addActionListener(this);
		fc = new JButton("X!");
		fc.setBounds(300, 110, 60, 35);
		fc.addActionListener(this);
		st = new JButton("Statistic");
		st.setBounds(160, 210, 90, 30);
		st.addActionListener(this);
		bs = new JButton("Basic");
		bs.setBounds(270, 210, 90, 30);
		bs.addActionListener(this);
		
		result = new JLabel("");                        //create labels and set their size
		result.setBounds(40,170,250,20);
		nB = new JLabel("Number");
		nB.setBounds(50, 15, 80, 40);
		
		scientific.add(nb);
		scientific.add(nB);
		scientific.add(qd);
		scientific.add(log);
		scientific.add(rp);
		scientific.add(abv);
		scientific.add(sr);
		scientific.add(fc);
		scientific.add(st);
		scientific.add(bs);
		scientific.add(result);
		
		scientific.setSize(400,300);                           //set properties of the frame
		scientific.setLayout(null);
		scientific.setVisible(true);
		scientific.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if((e.getSource()) == bs) {
			BasicInterface obj = new BasicInterface();
			obj.display1();
		}else if((e.getSource()) == st) {
			StatisticInterface obj1 = new StatisticInterface();
			obj1.display3();
		}else {
			ScientificFunction obj2 = new ScientificFunction(this);
			obj2.function2(e.getSource());
			
		}
	
	}
	

}
