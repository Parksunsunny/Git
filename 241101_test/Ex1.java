package test_241101;

import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args) 
	{
		String Array [][] = {{"라면"	 	, "500"		, "7"},
							 {"음료수" 	, "2500"	, "2"},
							 {"계란"		, "8000"	, "1"},
							 {"소불고기"	, "20000"	, "1"},
							 {"사과"		, "1000"	, "5"},
							 {"","",""}};
		String BuyProduct[] = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			BuyProduct[i] = sc.next();		
						
			if(0 != i)
			{
				BuyProduct[i] = BuyProduct[i].substring(0, BuyProduct[i].length() - 1);
				
			}
			
			Array[5][i]= BuyProduct[i];				
		}
		
		int totalPrice = 0;		
		for(int i = 0; i < 6; i++)
		{
			totalPrice += Integer.parseInt(Array[i][1]) * Integer.parseInt(Array[i][2]);
		}
					
		System.out.printf("총 지불 가격은 %d 원 입니다.\n",totalPrice);
		
		if(	sc.next().equals("카드"))
		{
			System.out.println("카드 결제 완료되었습니다.");
		}
		else
		{
			System.out.printf("현금 결제 완료되었습니다. (현금영수증 처리할 전화번호는 %s 입니다.)",sc.next());
		}
	}
}
