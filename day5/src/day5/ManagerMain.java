package day5;

class Employee
{
	/*private*/int id;
	String name;
	double salary;
	/*static*/ String sameVar = "Employee";
	
	void printInform()
	{
		System.out.println("사번 = " + id + ", 이름 = " + name);
	}
}

class Manager extends Employee
{
	String name;
	String jobOfManage;
	String title;
	/*static*/ String sameVar = "Manager"; // 우선순위 높고 상속받은 변수 우선순위 낮다
	
	void test()
	{
		String sameVar = "test의 지역변수";
		System.out.println(sameVar);
		System.out.println(this.sameVar);
		System.out.println(super.sameVar);
	}
	
	// private < no modifier < protected < public
	void printInform() // override
	{
		super.printInform();
		System.out.println("사번 = " + id + ", 이름 = " + name);
		System.out.println("업무내용 = " + jobOfManage + ", 직급 = " + title);
	}
}

public class ManagerMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.id = 100;
		e1.name = "이사원";
		e1.salary = 10000;
		
		Manager m1 = new Manager();
		m1.id = 1000;
		m1.name = "홍길동";
		m1.salary = 20000;
		m1.jobOfManage = "관리업무";
		m1.title = "it관리자";
		
		System.out.printf("관리자이름 = %s, 사번 = %d, 업무내용 = %s\n",m1.name, m1.id, m1.jobOfManage);
		System.out.println(m1.sameVar);
		
		m1.test();
	}
}
