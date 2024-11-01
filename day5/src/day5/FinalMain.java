package day5;

//final 추가시 상속 불가능
final class MyMath
{
	// 절대값
	// final 추가시 overriding 불가능
	int abs(int i)
	{
		if(i < 0)	return i * -1;
		return i;
	}
}

class MySub /* extends MyMath */
{
	//절대값 overriding
	int abs(int i)
	{
		MyMath m = new MyMath();
		return m.abs(-100);
	}
}

public class FinalMain 
{
	public static void main(String[] args) 
	{
		MySub s = new MySub();
		System.out.println(s.abs(-100));
	}
}
