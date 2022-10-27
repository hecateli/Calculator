package U3Lab;

public class BasicFunction {
	BasicInterface obj1;
	
	BasicFunction(BasicInterface in){
		this.obj1 = in;
	}
	
   public void function1() {	
	   try {
		String Fn = obj1.fN.getText();          //get input
		String Sn = obj1.sN.getText();
		String Op = obj1.oP.getText();
		
		if(Op.length()>0) {
		   char OP = Op.charAt(0);
	       double FN = Double.parseDouble(Fn);
		   double SN = Double.parseDouble(Sn);
		   double outcome = compute1(FN,SN,OP);
		   obj1.result.setText("The result is: "+outcome);
		}
		else
			obj1.result.setText("Should enter an operator");
	   }catch(NumberFormatException n) {
			obj1.result.setText("Should enter a number");
		}catch(NullPointerException np) {
			System.out.println(np);
		}
   }
	   
	
	public double compute1(double a, double b, char c) {
		try {                //create a method to calculate
			switch(c) {
			    case '+' : return a+b;
				case '-' : return a-b;
				case '*' : return a*b;
				case '%' : return a%b;
				case '/' : return a/b;
				default: break;
				}
			 }catch(ArithmeticException ae){
			    	System.out.println(ae);
			    }
		System.out.println("Should enter an operator");
		return -1;
	}
	


}
