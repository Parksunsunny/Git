package test_2401031;

import java.util.Scanner;

public class Ex2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int books = sc.nextInt();
		int people = sc.nextInt();

		if(books > people)
		{
			int share = 0;
			int devide = 0;
			share = books / people;
			devide = books % people;
			System.out.printf("1명의 학생당 : %d권씩 가질 수 있습니다.\n",share);
			System.out.printf("남아있는 책은 %d권 입니다.",devide);
			
		}
		else
		{
			System.out.println("나눠줄 수 없습니다.");
		}
	}
}
