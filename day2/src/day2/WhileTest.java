package day2;

import java.util.Scanner;

public class WhileTest 
{
	public static void main(String[] args) 
	{
		/*
		 * 나의 게시판 프로젝트 메뉴
		1. 게시판 리스트 
		2. 게시글 작성
		3. 게시물 조회
		4. 게시물 수정
		5. 게시물 삭제
		6. 종료
		*/
		
		while(true)
		{
			System.out.println("나의 게시판 프로젝트 메뉴");
			System.out.println("1. 게시판 리스트");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시물 조회");
			System.out.println("4. 게시물 수정");
			System.out.println("5. 게시물 삭제");
			System.out.println("6. 종료");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				System.out.println("게시판리스트선택");
			}	
			else if(menu == 6)
			{
				System.out.println("종료");
				break;
			}
			else
			{
				System.out.println("---");
			}
		}
	}

}
