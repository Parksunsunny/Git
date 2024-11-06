package day7;

import java.util.Properties;
import java.util.Set;

public class SystemClassMain 
{
	public static void main(String[] args) 
	{
		// os, 사용자정보 출력
		/*
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");		
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		*/
		
		long start = System.currentTimeMillis();
		
		// 모든 property 설정 정보 출력
		Properties p = System.getProperties(); // "os.name" = "windows 11", ...
		Set keys = p.keySet();
		
		for(Object k : keys)
		{
			String key = (String)k;
			String value = System.getProperty(key);
			System.out.println(key + " = " + value);
		}
		
		// 실행시간 측정
		for(int i= 1; i < 100000; i++)
		{
			int j = i*i;
		}
		// 반복문 10000번 수행
		long end = System.currentTimeMillis(); // 시작기준 ~ 현재시간을 1/1000초 단위 표현
		System.out.println("반복문 수행 시간 " + (end - start));
		
	}
}
