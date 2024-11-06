package day7;

import java.util.Date;

/*
   import 제외 대상
   1> java.lang 패키지 클래스들
   2> 현재 클래스와 같은 패키지 클래스들
 */

public class DateClassMain 
{
	public static void main(String[] args) 
	{
		Date now = new Date();
		System.out.println(now);
		
		Date when = new Date(1000);
		System.out.println(when);
	}
}
