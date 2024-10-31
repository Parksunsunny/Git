package day2;

import java.util.Scanner;

public class SwitchTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-12 중 1개 입력(예 1월)");
		
		String input = sc.next();
		
		switch(input)
		{
			case "1월":
			case "3월":
			case "5월":
			case "7월":
			case "9월":
			case "11월":
				System.out.println(input + "월은 31일");
				break;
				
			case "4월":
			case "6월":
			case "8월":
			case "10월":
			case "12월":
				System.out.println(input + "월은 30일");
				break;
				
			case "2월":
				System.out.println(input + "월은 28일");
				break;	
				
			default:
				System.out.println("월이아님");
		}
	}

}
