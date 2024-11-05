package day6;

@FunctionalInterface
interface Calculable
{
	int calc(int a, int b);
}

interface MyFunction
{
	String func(String s);
}

public class LambdaMain 
{
	public static void main(String[] args) 
	{
		Calculable c = null;
		
		// 람다식 작성
		c = (a, b)->{System.out.println(a+b); return a+b;};
		
		//System.out.println(c.calc(10, 20));
		
		int result1 = c.calc(10, 20);
		System.out.println(result1);
		
		MyFunction f = (s) -> {return s.toUpperCase();};
		String result2 = f.func("JAVa programing");
		System.out.println(result2);
	}
}
