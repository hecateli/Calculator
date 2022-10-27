package U3Lab;
import java.util.Scanner;

public class StatisticFunction {
    StatisticInterface obj3;

	StatisticFunction(StatisticInterface in){
		this.obj3 = in;
	}
	
	public void function3(Object a) {    //as main function on this session
		
		if(a == obj3.avg) {		//compute average value
			ComputeAvg();
		}
		else if(a== obj3.sum) {		//compute sum
			ComputeSum();
		}
		else if(a == obj3.va) {		//compute Variance
			double ncount = ComputeSum();
			double avg = ComputeAvg();
			ComputeVariance(avg, ncount);
		}
		else if(a == obj3.sd) {		//compute standard deviation
			double ncount = ComputeSum();
			double avg = ComputeAvg();
			ComputeStandardDev(avg, ncount);
		}
	}
	
	public boolean CheckValidInput(String string) {
		if(!string.matches("^[0-9£¬ ,.]*$")) {
			return false;		//false when the input String contains other than num/space/dot
		}
		else {
			return true;		//other case
		}
	}
	
	public double ComputeAvg() {
		double avg = 0.0;		//initialize output each time the function called
		try {
			if (CheckValidInput(obj3.nb.getText()) == false) {		//check if input is valid
				throw new Exception();
			}
			
			Scanner inputstr = new Scanner(obj3.nb.getText());
			for (int i = 1; ; i++) {
				if (! inputstr.hasNextDouble()) {		//break at the end of Double list
					break;
				}
				double next = inputstr.nextDouble();
				avg = (avg * (i - 1) + next) / i;		//compute by iteration
			}
			obj3.result.setText("The result is: " + avg);		//print out the result -> setText
		}catch(Exception e) {
			obj3.result.setText("Should enter a number");		//handle invalid input exception 
		}
		return avg;		//return average value for later use
	}
	
	public double ComputeSum() {
		double ncount = 0;   //counting total number of n
		try {
			if(CheckValidInput(obj3.nb.getText()) == false) {
				throw new Exception();
			}
			Scanner inputstr = new Scanner(obj3.nb.getText());
			double sum = 0.0; //initialize output each time the function called
			for (int i = 1; ; i++) {
				if (! inputstr.hasNextDouble()) {		//break at the end of Double list
					break;
				}
				double next = inputstr.nextDouble();
				ncount += 1;
				sum = sum +next;  //compute by iteration
			}
			obj3.result.setText("The result is: " + sum);
		}catch(Exception e) {
			obj3.result.setText("Should enter a number");
		}
		return ncount;
	}
	
	public void ComputeStandardDev(double avg, double count) {
		try{
			if (CheckValidInput(obj3.nb.getText()) == false){ //check if input is valid
				throw new Exception(); 
			}
			Scanner inputstr = new Scanner(obj3.nb.getText());
			double Varience = 0.0;  //initialize output each time the function called
			for (int i = 1; ;i++){
				if (!inputstr.hasNextDouble()){   //break at the end of Double list
					break;
				}
				double next = inputstr.nextDouble();
				Varience = Varience + (1 / (count - 1)) * Math.pow((next-avg),2); //compute by iteration

			}
			double StandardDeviation = Math.sqrt(Varience);
			obj3.result.setText("The result is: " + StandardDeviation);     //print out the result -> setText
		}catch(Exception e){
			obj3.result.setText("Should enter a number");  //handle invalid input exception 
		}
	}

	public void ComputeVariance(double avg, double count) {
		try{
			if (CheckValidInput(obj3.nb.getText()) == false){ //check if input is valid
				throw new Exception(); 
			}
			Scanner inputstr = new Scanner(obj3.nb.getText());
			double Varience = 0.0;  //initialize output each time the function called
			for (int i = 1; ;i++){
				if (!inputstr.hasNextDouble()){   //break at the end of Double list
					break;
				}
				double next = inputstr.nextDouble();
				Varience = Varience + (1 / (count - 1)) * Math.pow((next-avg),2); //compute by iteration

			}
			obj3.result.setText("The result is: " + Varience);     //print out the result -> setText
		}catch(Exception e){
			obj3.result.setText("Should enter a number");  //handle invalid input exception 
		}
	}

		
}
