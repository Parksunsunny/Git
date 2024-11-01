package day3;

// 회사원 객체 생성 템플릿
public class Employee 
{
	// 변수 : 정적 요소. 데이터
	int id;
	String name;
	String dept;
	String title;
	double salary;
	
	// 메소드 : 동적
	public void work()
	{
		 System.out.printf("%d %s %s %s %.0f\n",id, name, dept, title, salary);
	}
}
