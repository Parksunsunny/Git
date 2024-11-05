package day4;

// 회사원 객체 생성 템플릿
public class Employee 
{
	Employee()
	{
		/*
		id = -1;
		name = "미정";
		salary = 0;
		*/
		this(-1, "미정", 0);
	}
	
	Employee(int i)
	{
		/*
		id = i;
		name = "미정";
		salary = 0;
		*/
		this(i, "미정", 0);
	}
	
	Employee(int i, String n)
	{
		//id = i;
		//name = n;
		//salary = 0;
		this(i, n, 0);
	}	
	
	Employee(int id, String name, double salary)
	{
		System.out.println("생성자호출");
		this.id = id;
		this.name = name;
		this.salary = salary;
	} // 사용자정의
	
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
	
	// 부서 이동 메소드
	public void setDept(String new_dept)
	{
		dept = new_dept;
	}	
	
	// 직급 변경 메소드
	public void setTitle(String new_title)
	{
		title = new_title;
		
		if(new_title.equals("과장"))
		{
			salary = salary + 10000;			
		}
		else if(new_title.equals("부장"))
		{
			salary = salary + 20000;			
		}
		else
		{
			salary = salary * 1.1;			
		}			
	}
	
	void localTest()
	{
		String name = "지역변수";
		System.out.println(name);
		System.out.println(this.name);		
	}
}
