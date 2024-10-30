package day1;

public class LocalVariableTest 
{
	public static void main(String[] args) 
	{
		// run as - java application 클래스  main 메소드 실행
		// 자바어플리케이션 main 엔트리 포인트
		String local="main로컬변수";
		System.out.println(local);
		test();
	}
	
	// 사용자 추가 메소드
	public static void test()
	{
		String local = "test로컬변수";
		System.out.println(local);
		
		if(true)
		{
			String iflocal = "if로컬변수";
			System.out.println(local + iflocal);
		}
		
		int i =0;
		for(i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		System.out.println("for 종료 후 i = " + i);
	}
}
