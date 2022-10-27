package U3Lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatisticInterface extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nb; 
	JLabel nB,result;
	JButton avg,sum,va,sd,sc,bs;
	JFrame statistic;
	
	public void display3() {
		statistic = new JFrame("Statistic Calculator");
		
		nb = new JTextField();
		nb.setBounds(30, 50, 80, 35);

		avg = new JButton("Average");
		avg.setBounds(130, 50, 85, 35);
		avg.addActionListener(this);
		sum = new JButton("Sum");
		sum.setBounds(130, 110, 85, 35);
		sum.addActionListener(this);
		va = new JButton("Varience");
		va.setBounds(230, 50, 145, 35);
		va.addActionListener(this);
		sd = new JButton("Standard Deviation");
		sd.setBounds(230, 110, 145, 35);
		sd.addActionListener(this);
		sc = new JButton("Scientific");
		sc.setBounds(170, 210, 90, 35);
		sc.addActionListener(this);
		bs = new JButton("Basic");
		bs.setBounds(280, 210, 90, 35);
		bs.addActionListener(this);
		
		result = new JLabel("");                        //create labels and set their size
		result.setBounds(30,170,250,20);
		nB = new JLabel("Number");
		nB.setBounds(40, 15, 80, 40);
		
		statistic.add(nb);
		statistic.add(nB);
		statistic.add(result);
		statistic.add(avg);
		statistic.add(sum);
		statistic.add(va);
		statistic.add(sd);
		statistic.add(sc);
		statistic.add(bs);
		
		statistic.setVisible(true);
		statistic.setSize(400,300);                           //set properties of the frame
		statistic.setLayout(null);
		statistic.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}	
	public void actionPerformed(ActionEvent e) {
		if((e.getSource()) == bs) {
			BasicInterface obj = new BasicInterface();
			obj.display1();
		}else if((e.getSource()) == sc) {
			ScientificInterface obj1 = new ScientificInterface();
			obj1.display2();
		}else {
			StatisticFunction obj2 = new StatisticFunction(this);
			obj2.function3(e.getSource());
			
		}
	
	}
	
}
