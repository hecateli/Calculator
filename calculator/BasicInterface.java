
	package U3Lab;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class BasicInterface extends Frame implements ActionListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JTextField fN,sN,oP; 
		JLabel result,fn,sn,op;
		JButton cc,sc,st;
		JFrame basic;
		
		public void display1() {
			basic = new JFrame("Basic Calculator");
			
			fN = new JTextField("");              //create text fields and set their size
			fN.setBounds(50, 50, 80, 35);
			sN = new JTextField("");
			sN.setBounds(150, 50, 100, 35);
			oP = new JTextField("");
			oP.setBounds(280, 50, 80, 35);
			
			cc = new JButton("Calculate");
			cc.setBounds(155, 110, 90, 35);
			
			cc.addActionListener(this);
			sc = new JButton("Scientific");
			sc.setBounds(160, 210, 90, 30);
			sc.addActionListener(this);
			st = new JButton("Statistic");
			st.setBounds(270, 210, 90, 30);
			st.addActionListener(this);
			
			result = new JLabel("");                        //create labels and set their size
			result.setBounds(40,165,270,20);
			fn = new JLabel("First Number");
			fn.setBounds(50, 15, 80, 40);
			sn = new JLabel("Second Number");
			sn.setBounds(150, 15, 100, 40);
			op = new JLabel("Operator");
			op.setBounds(290, 15, 80, 40);
			
			basic.add(fN);
			basic.add(sN);
			basic.add(oP);
			basic.add(fn);
			basic.add(sn);
			basic.add(op);
			basic.add(cc);
			basic.add(sc);
			basic.add(st);
			basic.add(result);
			
			basic.setSize(400,300);                           //set properties of the frame
			basic.setLayout(null);
			basic.setVisible(true);
			basic.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent e) {
			if((e.getSource()) == cc) {
				BasicFunction obj = new BasicFunction(this);
				obj.function1();
			}else if((e.getSource()) == sc) {
				ScientificInterface obj2 = new ScientificInterface();
				obj2.display2();
			}else if((e.getSource()) == st) {
				StatisticInterface obj3 = new StatisticInterface();
				obj3.display3();
			}
		}
		
	}
