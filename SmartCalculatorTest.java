package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmartCalculatorTest
{
    @Test
    public void testCalculateSimpleInterest() 
            {   System.out.println("Simple Interest");
SmartCalculator calculator = new SmartCalculator();
        
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(2);

        assertEquals(100.0, calculator.calculateSimpleInterest(), 0.001);
            }

	@Test
	  public void testCalculateCompoundInterest() 
	{     System.out.println("Compound Interest");

		        SmartCalculator calculator = new SmartCalculator();
		        calculator.setPrincipal(1000);
		        calculator.setRate(5);
		        calculator.setTime(2);
		        double result = calculator.calculateCompoundInterest();
		        assertEquals(102.50, result, 0.01);
		    }

	@Test
	  public void testCalculateMean()
	{
		SmartCalculator calculator = new SmartCalculator();
		int [] numbers = {5, 10, 15};
       // double expected = 10;
        double resu1t = calculator.calculateMean(numbers);
        assertEquals(10,resu1t,0.01);
	}
		@Test
	public void testCalculateFactorial()
	{
			SmartCalculator  calculator = new SmartCalculator();
			calculator.setNumber(5);
	        assertEquals(120L, calculator.calculateFactorial());
	}
		@Test
	  public void testCalculatePercentage() 
	{
			 SmartCalculator calculator = new SmartCalculator();
		        calculator.setTotalMarks(500);
		        calculator.setMarksObtained(450);
		        double result = calculator.calculatePercentage();
		        assertEquals(90, result, 0.01);
		    }
	
	

}
