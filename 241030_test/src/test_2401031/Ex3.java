package test_2401031;

public class Ex3 
{
	public static void main(String[] args) 
	{
		for(int i = 2; i < 101; i++)
		{
			boolean isnotsosu = false;
			
			for(int j = 2; j < i; j++)
			{
				if( 0 == i % j )
				{
					isnotsosu = true;
					break;
				}
			}
			
			if(isnotsosu == true)
			{
				System.out.printf("%d : 소수가 아니다\n", i);
			}
			else
			{
				System.out.printf("%d : 소수이다\n", i);				
			}
		}
	}
}
