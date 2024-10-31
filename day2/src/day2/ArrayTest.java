package day2;

import java.util.Arrays;

public class ArrayTest 
{
	public static void main(String[] args) 
	{		
		/*
			자바 배열 초기화 이전 자동 저장값
			int : 정수 0
			double : 실수 0.0
			boolean : false
			char : \u0000 (unicode 16진수 0000 해당 문자 (공백))
			String : null
		*/
		
		String [] names = {"홍길동", "박한국", "김대한", "최강산", "김우리", "이자바"};
		int scores[] = new int[6];	// 초기화 이전
		int max = 0;
		String name = "";
		
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = (int)(Math.random() * 100) + 1;
			System.out.println(names[i] + ":" + scores[i]);
			max = max > scores[i] ? max : scores[i];
			name = max > scores[i] ? name : names[i];
		}
		
		System.out.printf("1등 : %s 학생 점수 %d점\n",name, max);
		
		System.out.println("=============================");
		
		for(String oneName : names)
		{
			System.out.println(oneName);
		}
		
		System.out.println("=============================");
		
		System.out.println(Arrays.toString(names));
	}
}
