package day1;

public class VariableTest 
{
	public static void main(String[] args) 
	{
		/* 불가능
		var a;
		let b;
		const c;
		a;
		
		int a = 100;
		
		// 재사용
		System.out.println(a);
		System.out.println(a);
		
		// 다른 연산 값 변경
		a = a * 2;	
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 == 10;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		// %c 단일문자표현포맷, %d 정수포맷
		char c1 = 'a';
		char c2 = '가';
		char c3 = '\n';
		char c4 = '0';
		int i = 000;
		
		System.out.printf("%c %c %c %c %d",c1, c2, c3, c4, i);
		
		Character.isAlphabetic(c1);
			
		*/
		byte 	by1 = 100;
		short 	sh1 = 200;
		int 	in1 = 200;
		long 	lo1 = 200;
		
		System.out.printf("%d %d %d %d %n", by1, sh1, in1, lo1);
		System.out.println("byte 최대값 = " + Byte.MAX_VALUE);
		System.out.println("byte 최솟값 = " + Byte.MIN_VALUE);
		System.out.println("short 최대값 = " + Short.MAX_VALUE);
		System.out.println("short 최솟값 = " + Short.MIN_VALUE);
		System.out.println("int 최대값 = " + Integer.MAX_VALUE);
		System.out.println("int 최솟값 = " + Integer.MIN_VALUE);
		System.out.println("long 최대값 = " + Long.MAX_VALUE);
		System.out.println("long 최솟값 = " + Long.MIN_VALUE);
		System.out.println(200000); // 메모리저장(4byte int 간주), 저장영역 이름 없다
		
		float f1 = 3.4567f; // 실수데이터 float 4byte 간주
		double do1 = 3.45678; // 실수데이터 double 간주
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println("a");
		System.out.println((int)'a');
		
		char ca = 'b';
		int  ia = (int)ca;		
		System.out.println(ca);
		System.out.println(ia);
		
		int ib = 100;
		double db = (double)ib;
		System.out.println(db);
		
		// 명시적형변환
		double avg = (double)245/3;
		System.out.println(avg); // 실수평균
		System.out.println((int)avg); // 정수평균
		
		// boolean 제외
		// boolean bc  = (boolean)0;
		// int ic = (int)true;
		
		byte by11 = 100;
		byte by12 = 100;
		byte by13 = (byte)(by11 + by12);
		System.out.println(by13);
		
	}

}
