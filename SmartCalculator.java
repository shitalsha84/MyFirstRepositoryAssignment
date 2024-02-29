package task1;

public class SmartCalculator 
{
	 private double principal;
	    private double rate;
	    private double time;
	    private int number;
	    private int totalMarks;
	    private int marksObtained;
	    
	    public SmartCalculator() {
	        // Non-parameterized constructor
	    }
	    public SmartCalculator(double principal, double rate, double time) {
	        this.principal = principal;
	        this.rate = rate;
	        this.time = time;
	    }
	    public void setPrincipal(double principal) {
			this.principal = principal;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		public void setTime(double time) {
			this.time = time;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		public void setMarksObtained(int marksObtained) {
			this.marksObtained = marksObtained;
		}

		// Methods to calculate Simple Interest, Compound Interest, Mean, Factorial, and Percentage
	    public   double calculateSimpleInterest() {
	        return (principal * rate * time) / 100;
	    }
	    public  double calculateCompoundInterest() {
	        return principal * Math.pow((1 + rate / 100), time) - principal;
	    }
	    public double calculateMean(int[] numbers) {
	        int sum = 0;
	        for (int i=0; i<numbers.length;i++) 
	        {
	            sum =sum+numbers[i];
	       }
	        return  sum / numbers.length;
	    }
	    public long calculateFactorial() {
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	    public double calculatePercentage() {
	        return ((double) marksObtained / totalMarks) * 100;
	    }
}

