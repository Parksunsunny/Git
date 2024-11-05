package day4;

import java.lang.reflect.Array;
import java.util.Arrays;

class B
{
	void m0()
	{
		m1();
	}
	void m1()
	{
		System.out.println("B클래스의 m1 호출");
	}
	
	int m2()
	{
		return 10 * 10; // 마지막 문장 return 변수나 데이터. 문장
	}
	
	String m3()
	{
		return "method test";
	}
	
	double[] m4()
	{
		return new double[] {1.0, 2.2, 3.3};
	}
	
	MultiEmployee m5()
	{
		return new MultiEmployee();
	}
	
	void m6()
	{
		if(true) 
		{
			System.out.println("m6메소드 중단");
			return;
		}
		System.out.println("m6 return이후");
	}	
}

public class ReturnTypeMain 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1();
		
		int result2 = b1.m2();
		System.out.println(result2);
		
		String result3 = b1.m3();
		System.out.println(b1.m3());
		System.out.println(result3);

		System.out.println(Arrays.toString(b1.m4())); // 배열
		System.out.println(b1.m5().companyName); // 클래스객체
		
		b1.m6();
	}
}
