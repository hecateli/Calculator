package U3Lab;

public class ScientificFunction {
	ScientificInterface obj2;
	
	ScientificFunction(ScientificInterface in){
		this.obj2 = in;
	}
	
	public void function2(Object a) {
		try {
			String Nb = obj2.nb.getText();
			double NB = Double.parseDouble(Nb);
			double outcome = compute2(NB,a);
			obj2.result.setText("The result is: "+outcome);
		}catch(NumberFormatException nf) {
			obj2.result.setText("Should enter a number");
		}
	}
	public double compute2(double a, Object b) {
		try {
		if(b==obj2.qd)
			return (double)a*a;
		else if(b==obj2.log)
			return Math.log10(a);
		else if(b==obj2.rp)
			return (double)1/a;
		else if(b==obj2.abv)
			return Math.abs(a);
		else if(b==obj2.sr)
			return Math.sqrt(a);
		else if(b==obj2.fc) {
			double r = factorial(a);
			if(r==-1)
				System.out.println("Should enter a positive integer");
			else
				return r;
		}
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		return 0;
	}
	
	public double factorial(double a) {
		if(a>1 && a%1 == 0) {
			double c=a;
			for(double i=a;i>1;i--) {
				c = c*(i-1);
			}
			return c;
			}else if(a==1) 
				return a;
		return -1;
	}


}
