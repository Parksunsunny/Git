package Exception2;

// 견고한 프로그램 - 미리 예외처리 해놓음
// RuntimeExeption 종류들 = unchecked exception = 예회처리 필수 아니다
class A
{
	void ma(int i) /*throws ArithmeticException*/
	{
		System.out.println(100/ i);
	}
	
	void mb()
	{
		ma(0);		
	}
	
	void mc()
	{
		ma(0);
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
