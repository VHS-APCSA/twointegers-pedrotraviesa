public class TwoIntegers 
{
	private int number1;
	private int number2;
	
	public TwoIntegers()
	{
		number1 = 0;
		number2 = 0;
	}
	public TwoIntegers(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1()
	{
		return number1;
	}
	public int getNumber2()
	{
		return number2;
	}
	public void setNumber1(int number1)
	{
		this.number1 = number1;
	}
	public void setNumber2(int number2)
	{
		this.number2 = number2;
	}
	public String arithmetic()
	{
		int sum = number1 + number2;
		int product = number1 * number2;
		int difference = number1 - number2;
		double qoutient = (double)number1 / number2;
		int mod = number1 % number2;
		
		return (number1 + " + " + number2 + " = " + sum)
	}
}
