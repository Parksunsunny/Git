package day1;

import java.util.Scanner;

public class ScannerTest 
{
	public static void main(String[] args) 
	{		
		System.out.println("정수 2개를 입력하면 덧셈해줌");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println(first + second);
		
		System.out.println("계속하려면 true입력");
		boolean b = sc.nextBoolean();
		sc.nextLine();
		if(true == b)
		{
			//String word = sc.next();
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		
		/*
		String word = sc.next();
		System.out.println(word);
		*/
	}

}
