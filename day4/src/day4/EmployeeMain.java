package day4;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(100, "김대리", 5555);
		
		/*
		e1.id = 100;
		e1.name = "김대리";
		e1.salary = 5555;
		*/
		e1.setDept("IT개발부서");
		e1.setTitle("대리");		
		System.out.printf("사번 : %d, 이름 : %s, 부서 : %s, 직급 : %s, 급여 : %.2f \n",
									e1.id, e1.name, e1.dept, e1.title, e1.salary);
		
		Employee e2 = new Employee(200, "박과장", 6666);
			
		//e2.id = 200;
		//e2.name = "박과장";
		//e2.salary = 6666;
		e2.setDept("인재개발부서");
		e2.setTitle("부장");			
		System.out.printf("사번 : %d, 이름 : %s, 부서 : %s, 직급 : %s, 급여 : %.2f \n",
										e2.id, e2.name, e2.dept, e2.title, e2.salary);
		
		Employee e3 = new Employee(300);
		e3.setDept("인재개발부서");
		e3.setTitle("과장");		
		System.out.printf("사번 : %d, 이름 : %s, 부서 : %s, 직급 : %s, 급여 : %.2f \n",
				e3.id, e3.name, e3.dept, e3.title, e3.salary);
		
		Employee e4 = new Employee(400, "이사원");
		e4.setDept("인재개발부서");
		e4.setTitle("사원");
		System.out.printf("사번 : %d, 이름 : %s, 부서 : %s, 직급 : %s, 급여 : %.2f \n",
				e4.id, e4.name, e4.dept, e4.title, e4.salary);
		
		e1.localTest();
	}
}
