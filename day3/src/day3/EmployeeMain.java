package day3;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		// 실행 가능 클래스
		Employee e1 = new Employee();
		e1.name = "김사원";
		e1.id = 100;
		e1.dept = "총무부";
		e1.title = "사원";
		e1.salary = 10000.0;
		System.out.printf("사원1 사번 = %d 이름 = %s 직무 = %s 부서 = %s 급여 = %f\n",e1.id, e1.name, e1.title, e1.dept, e1.salary);
	
		Employee e2 = new Employee();
		e2.name = "박대리";
		e2.id = 200;
		e2.dept = "인사부";
		e2.title = "대리";
		e2.salary = 12000.0;
		System.out.printf("사원2 사번 = %d 이름 = %s 직무 = %s 부서 = %s 급여 = %f\n",e2.id, e2.name, e2.title, e2.dept, e2.salary);
	
		e1.work();
		e2.work();
	}
}
