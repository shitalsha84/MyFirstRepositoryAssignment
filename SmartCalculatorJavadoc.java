package task1;

public class SmartCalculator 
{
	/**
	 * @Sanjana
	 * @version 1.0
	 * @since 2024-02-29
	 */
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
	    	 // Implementation details
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
		/**
		 *  Calculates the simple interest based on the provided principal, rate, and time.
		 *  @return The calculated simple interest.
		 */
	    public   double calculateSimpleInterest() {
	    	 // Implementation details
	        return (principal * rate * time) / 100;
	    }
	    /**
	     *  Calculates the compound interest based on the provided principal, rate, and time.
	     *  @return The calculated compound interest.
	     * @return
	     */
	    public  double calculateCompoundInterest() {
	    	// Implementation details
	        return principal * Math.pow((1 + rate / 100), time) - principal;
	    }
	    /**
	     * Calculates the mean of the given numbers.
	     * 
	     * @return The calculated mean value.
	     */
	    public double calculateMean(int[] numbers) {
	    	// Implementation details
	        int sum = 0;
	        for (int i=0; i<numbers.length;i++) 
	        {
	            sum =sum+numbers[i];
	       }
	        return  sum / numbers.length;
	    }
	    /**
	     *  Calculates the factorial of a given number.
	     *  @param n The number for which factorial is to be calculated.
	     *  @return The factorial of the given number.
	     */
	    public long calculateFactorial() {
	    	// Implementation details
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	    /**
	     * Calculates the percentage based on total marks and marks obtained.
	     * @return The calculated percentage.
	     */
	    public double calculatePercentage() {
	    	// Implementation details
	        return ((double) marksObtained / totalMarks) * 100;
	    }
	    
	   
	    }
