package day6;

public class ObjectClassTest 
{
	public static void main(String[] args) 
	{
		Object o1 = new MyObject("MyObject생성");
		Object o2 = new MyObject("MyObject생성");
		
		System.out.println(o1);
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		// 다른 자바 클래스 toString 그대로 / 출력 정보 구현 - 오버라이딩
		
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//java.lang.Object@16진수메모리주소값
		
		System.out.println(o1.getClass().getName());
		
		if (o1 == o2)
		{
			// stack 주소값 비교. 연산자 오버로딩/오버라이딩 불가능
			// stack [o1 : 100, o2 : 200]
			System.out.println("o1 == o2 true");
		}
		
		// String 클래스 - equals() - Object 메소드 오버라이딩 - 문자열 내용 비교
		// Object - equals () - 주소값 비교 - 오버라이딩
	
		//if(o1.equals(new String("MyObject생성")))
		if(o1.equals(new String("test")))
		{
			System.out.println("o1.equals(o2) true");			
		}
	}
}

class MyObject
{
	String msg;
	
	MyObject(String msg)
	{
		this.msg = msg;
	}
	
	/* 1. 전달매개변수 타입이 MyObject 객체여야한다.
	 * o1.equals("MyObject생성") 
	 * 1, 2 모두 조건 만족시 - true 
	 * 나머지 false
	 */
	
	//toString() 오버라이딩
	public String toString() 
	{
		return this.msg;
	}

	public boolean equals(Object obj) 
	{
		if(obj instanceof MyObject)
		{
			String me = this.msg;
			String other = ((MyObject)obj).msg;
			
			if(me.equals(other))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}