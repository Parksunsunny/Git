package day4;

class Data
{
	int a = 10;
}

class Target // Target.java 별도 저장 가능 또는 현재 파일에 정의 가능. public은 안됨
{
	void add(int i)
	{
		System.out.println("add 메소드내부 출력 = " + i++);
	}
	
	void addData(Data d)
	{
		System.out.println("addData 메소드내부 출력 = " + d.a++);
	}
}

public class CallByValue 
{	
	public static void main(String[] args) 
	{
		Target t = new Target();
		
		System.out.println("==========기본형변수===========");
		
		int j = 10;
		t.add(j);
		System.out.println("main 메소드 내부 출력 = " + j);

		System.out.println("==========참조형변수===========");
		
		Data d_main = new Data();
		t.addData(d_main);
		System.out.println("main 메소드 내부 출력 = " + d_main.a);
	}
}
