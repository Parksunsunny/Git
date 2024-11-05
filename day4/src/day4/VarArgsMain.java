package day4;

class VarArgs
{
	int add(int ...a)
	{
		System.out.println("전달매개변수의 개수 = " + a.length);
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		
		return sum;
	}
}

public class VarArgsMain 
{
	public static void main(String[] args) 
	{
		VarArgs 			v		 	= 	new VarArgs();
		// 클래스명(변수타입)	객체참조변수명		heap영역 클래스복사본(변수+메소드)
		
		System.out.println("합계 = " + v.add(1,2,3,4,5,6,7,8,9));
		System.out.println("합계 = " + v.add(1,2,3,4,5));
		System.out.println("합계 = " + v.add(1,2,3));
	}
}
