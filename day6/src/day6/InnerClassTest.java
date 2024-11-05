package day6;

interface Anony1
{
	void test1();
}

interface Anony2
{
	void test2();
}

class TwoInterfaceInner
{
	// 익명 내부 클래스 = anonymous inner class. 객체생성
	Anony1 an1 = new Anony1()
	{
		public void test1() 
		{
			System.out.println("anony1의 test1 overriding");
		}
	};
	
	Anony2 an2 = new Anony2()
	{
		public void test2() 
		{
			System.out.println("anony2의 test2 overriding");			
		}
	};
}

public class InnerClassTest 
{
	public static void main(String[] args) 
	{
		TwoInterfaceInner inner = new TwoInterfaceInner();
		inner.an1.test1();
		inner.an2.test2();
	}
}
