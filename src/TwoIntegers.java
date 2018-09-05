
public class TwoIntegers {

	private int val;
	private int val2;
	
	public TwoIntegers()
	{
		val = 0;
		val2 = 0;
	}
	
	public TwoIntegers(int val, int val2)
	{
		this.val = val;
		this.val2 = val2;
	}
	
	public void setVal(int val)
	{
		this.val = val;
	}
	
	public void setVal2(int val2)
	{
		this.val2 = val2;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public int getVal2()
	{
		return val2;
	}
	
	public String arithmetic()
	{
		int sum = val + val2;
		int difference = val - val2;
		int product = val*val2;
		double quotient = (double)val/val2;
		
		return (val + " + " + val2 + " = " + sum + ", " +
				val + " - " + val2 + " = " + difference + ", " +
				val + " * " + val2 + " = " + product + ", " + 
				val + " / " + val2 + " = " + quotient);			
	}
	
	public int larger()
	{
		if (val >= val2)
			return val;
		else
			return val2;
	}
	
	public boolean isEven() 
	{
		int sum = val + val2;
		return sum % 2 == 0;
	}
	
	public boolean isMultiple()
	{
		int multiple = val % val2; 
		return multiple == 0;
	}
}
