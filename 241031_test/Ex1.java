package test_2401031;

import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = num / 100 * 100;
		System.out.println(num);
	}
}
