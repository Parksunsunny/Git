package day4;

class Circle
{
	int radius;
	double pi = 3.14;
	
	void area()
	{
		System.out.println(radius * radius * pi);
	}
}

public class FinalVariableMain 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.radius = 5;
		c1.area();
		System.out.println("정수 int의 최대값 = " + Integer.MAX_VALUE);
		//Integer.MAX_VALUE++; 불가능		
	}
}
