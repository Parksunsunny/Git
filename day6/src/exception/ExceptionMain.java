package exception;

public class ExceptionMain 
{
	public static void main(String[] args) 
	{
		
		/*
		 run program arguments
		 입력x 실행 - 1번문장 오류/중단
		 100 실행 - 2번문장 오류/중단
		 백 이백 삼백 - 1번문장 오류/중단
		 10 0 실행 - 3번문장 오류/중단
		 100 50 실행 - 오류발생x - 메인 끝까지 실행
		 */
		int first = 0, second = 0;
		
		try 
		{
			first = Integer.parseInt(args[0]);
			second = Integer.parseInt(args[1]);
			
			System.out.println(first / second);
		}
		catch(ArithmeticException e)
		{
			//second = first;
			
			System.out.println("0이 아닌 값으로 입력하세요");
		}
		finally
		{
			System.out.println("항상 출력합니다");
		}
		/*
		catch(Exception e)
		{
			System.out.println("모든 종류 예외 동일 처리" + e.toString());
		}		
		catch(ArrayIndexOutOfBoundsException e)
		{
			// 입력x or 1개입력
			System.out.println("2개의 값을 입력하세요");
		}
		catch(NumberFormatException e)
		{
			System.out.println("정수로만 입력하세요");			
		}
		*/
		System.out.println("main 완료");
	}
}
