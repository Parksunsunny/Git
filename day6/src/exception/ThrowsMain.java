package exception;

class A
{
	void ma(int i) throws ArithmeticException
	{
		System.out.println(100/ i);
	}
	
	void mb()
	{
		try 
		{
			ma(0);
		}
		catch(ArithmeticException e)
		{
			ma(100); // 재호출
		}
		
	}
	
	void mc()
	{
		try 
		{
			ma(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0을 전달못함");
		}
	}
}

public class ThrowsMain
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//a1.ma(0);
		a1.mb();
		a1.mc();
	}
}
