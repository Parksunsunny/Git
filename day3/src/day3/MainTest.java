package day3;

public class MainTest
{
	public static void main(String[] args)
	{
		System.out.println("명령행 매개변수 개수 = " + args.length);
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		System.out.println(args[0] + args[1]);
		
		// (int)기본형변수
		// 정수 100flxjs <- Integer.parseInt("100")
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		
		// string -> 실수 변환
		double testnum = Double.parseDouble("3.12");
	}

}
