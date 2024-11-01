package day3;

import java.util.Arrays;

public class StringClassTest 
{
	public static void main(String[] args) 
	{
		String str1 = "Java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		/*
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		
		System.out.println("100" + "200");
		System.out.println("100" + 200 + 3.14);
		System.out.println(200 + 3.14 + "100");
		System.out.println("100" + (200 + 3.14));
		*/
		// string 메소드
		System.out.println("javaprogram".length());
		System.out.println("javaprogram".charAt(0));
		System.out.println("javaprogram".substring(0,5));
		//System.out.println("javaprogram".replace("a","-"));
		System.out.println("javaprogram".replace("ja","-"));
		System.out.println("javaprogram".toUpperCase());
		System.out.println("javaprogram".toLowerCase());
		System.out.println("100".concat("200")); // +와 같은 결과
		
		String str5 = "서울시 강남구 역삼동 멀티캠퍼스 13층";
		String address[] = str5.split(" ");
		for(String one : address) // foreach반복문 : 배열전용
		{
			System.out.println(one);
		}
		
		String str_array[] = {"aaa", "bbb", "ccc"};
		
		// String 배열은 String 1개로 결합
		System.out.println(String.join("-", str_array));
		
		String str6 = "javaprogram";
		char c[] = str6.toCharArray();
		/*
		char c[] = new char[str6.length()];
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = str6.charAt(i);
		}
		*/
		System.out.println(Arrays.toString(c));
		
		System.out.println("java".indexOf('j'));
		//"java".charAt()
	}
}
