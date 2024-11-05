package test_2401031;

import java.util.Scanner;

public class Ex5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < i + 1; j++)
			{
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}
