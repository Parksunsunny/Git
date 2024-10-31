package day2;

import java.util.Scanner;

public class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-12 중 1개 입력");
		
		int input = sc.nextInt();
		
		switch(input)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
				System.out.println(input + "월은 31일");
				break;
				
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
				System.out.println(input + "월은 30일");
				break;
				
			case 2:
				System.out.println(input + "월은 28일");
				break;	
				
			default:
				System.out.println("월이아님");
		}
	}

}
