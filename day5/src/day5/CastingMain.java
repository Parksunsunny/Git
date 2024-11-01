package day5;

class Parent
{
	int su = 10;
	
	void pr()
	{
		System.out.println(su);
	}
	
	// 하위클래스 추가정의 non-overriding 메소드
	void parentMethod()
	{
		System.out.println("Parent메소드");
	}
}

class Child1 extends Parent
{
	int su = 20;
	
	void pr()
	{
		System.out.println(su);
	}
	
	void child1Method()
	{
		System.out.println("child1메소드");
	}
}

public class CastingMain 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.pr();
		p1.parentMethod();
		//p1.child1Method();
		
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		c1.pr();
		c1.parentMethod();
		c1.child1Method();
		
		Parent p2 = new Child1();
		System.out.println(p2.su);
		p2.pr();
		p2.parentMethod();
		
		Child1 c2 = (Child1)p2;
		c2.child1Method();
		
		// 위와같음
		((Child1)p2).child1Method();
	}
}
