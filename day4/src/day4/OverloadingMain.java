package day4;

import java.util.Arrays;

// 3개 add overloading
class Overload
{
	int add(int i, int j)
	{
		return i + j; // 덧셈
	}
	
	String add(String i, String j)
	{
		return i + j; // 문자열결합
	}
	
	double add(double i, double j)
	{
		return i + j; // 실수 덧셈
	}
}

public class OverloadingMain 
{
	public static void main(String[] args) 
	{
		Overload o = new Overload();
		System.out.println(o.add(10, 20));
		System.out.println(o.add(1.1, 2.2));
		System.out.println(o.add("java", "program"));
		System.out.println(o.add(3.14, 20));
		System.out.println(o.add(3, 20.99));
		
		// 라이브러리
		int dec = Integer.parseInt("100"); // String 10 진수 int 변환
		int bin = Integer.parseInt("100", 2); // String 2, 8, 16 진수 int 변환
		
		System.out.println(dec);
		System.out.println(bin);
		
	}
}
