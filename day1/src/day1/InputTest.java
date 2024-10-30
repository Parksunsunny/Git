package day1;

public class InputTest 
{
	public static void main(String[] args) throws java.io.IOException 
	{
		// 표준출력장치(모니터) - System.out
		// 표준입력장치(키보드) - System.in
		
		while(true)
		{
			int i = System.in.read(); // 문자입력 unicode 리턴
			if(i==13)	{break;}
			System.out.println(i + ":" + (char)i);
		}
	}
}
