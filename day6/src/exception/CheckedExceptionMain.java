package exception;

class B
{
	void test(int i) throws ClassNotFoundException, ArithmeticException
	{
		Class.forName("day6.InnerClassTest");	 // MyClass.class 파일의 여러 정보 제공 객체 생성
		
		if( i <= 0) throw new ArithmeticException();
	}
}

public class CheckedExceptionMain 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		try
		{
			b1.test(-1);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("해당 이름의 클래스는 존재하지 않음");
		}
		catch(ArithmeticException e)
		{
			System.out.println("음수는 소수 구하기가 불가능");
		}
	}
}
