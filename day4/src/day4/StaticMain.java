package day4;

class MultiEmployee
{
	final static String companyName = "멀티캠퍼스";
	String name;
}

public class StaticMain 
{
	public static void main(String[] args) 
	{
		System.out.println("모든 회사원의 회사명 = " + MultiEmployee.companyName); // static 선언 변수 가능. 객체 생성 이전 사용 가능
		//System.out.println("모든 회사원의 이름 = " + MultiEmployee.name); // non-static 변수. 객체생성이전 사용 불가능
		
		MultiEmployee e1 = new MultiEmployee();
		e1.name = "이자바";
		//e1.companyName = "멀티캠퍼스2";
		
		System.out.println("회사원 " + e1.name + "님은 " + e1.companyName + "에 재직중");
		
		MultiEmployee e2 = new MultiEmployee();
		e2.name = "박한국";
		
		System.out.println("회사원 " + e2.name + "님은 " + e2.companyName + "에 재직중");
	}
}
