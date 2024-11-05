package day6;

class StudentWorker implements Worker, Student
{
	// 상속 포함 /*public static final*/String title = "교직원";
	// 상속 포함 String title = "학생";
	
	String title = "조교";
	
	public void tellTitle()
	{
		System.out.println(title);
		System.out.println(Worker.title);
		System.out.println(Student.title);
	}
	
	public void lunch()
	{
		System.out.println("조교가 점심을 먹다");		
	}
	public void work()
	{
		System.out.println("조교가 오후에 일한다");
	}
	public void study()
	{
		System.out.println("조교가 오전에 공부한다");		
	}
}

class MiddleStudent implements Student
{
	public void study() 
	{
		System.out.println("중학생이 공부하다");
	}

	public void lunch() 
	{
		System.out.println("중학생이 점심먹다");		
	}	
	
	public void tell()
	{
		System.out.println("나는 중학생이다");
	}
}

public class InterfaceTest 
{
	public static void main(String[] args) 
	{
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();		
		sw.tellTitle();
		
		// 상위클래스명 변수명 = 하위객체; 자동형변환가능
		// 상위인터페이스명 변수명 = 하위객체; 자동형변환가능
		Worker w = new StudentWorker();
		
		// 변수명.멤버변수 --> Worker인터페이스
		System.out.println(w.title);
		
		// 변수명.메소드 --> Worker인터페이스 - 추상메소드만 있음. 구현 x. 해당 형식은 없음.
		// 변수명.overriding --> StudentWorker 메소드 호출
		// overrideing : Worker 인터페이스 상속을 받아 StudentWorker에서 재정의
		// w.study(); // Worker 인터페이스 없다
		((StudentWorker)w).study();
		w.lunch();
		w.work();
		// w.tellTitle(); // StudentWorker 추가 메소드
		((StudentWorker)w).tellTitle();
		
		System.out.println("=========================");
		
		// 상위인터페이스명 변수명 = 하위객체; 자동형변환가능
		Student array[] = new Student[2];
		array[0] = new StudentWorker();
		System.out.println(array[0].title);
		array[0].study();
		array[0].lunch();
		//s.work();
		//s.tellTitle();
		((StudentWorker)array[0]).work();
		((StudentWorker)array[0]).tellTitle();
		
		array[1] = new MiddleStudent();
		array[1].lunch();
		array[1].study();
		((MiddleStudent)array[1]).tell();
		
		// array[1]는 StudentWorker클래스의 객체입니까?
		if(array[1] instanceof StudentWorker)
		{
			StudentWorker ss = ((StudentWorker)array[1]);
			System.out.println("실행되나요1?");
		}
		
		if(array[1] instanceof MiddleStudent)
		{
			MiddleStudent ss = ((MiddleStudent)array[1]);
			System.out.println("실행되나요2?");
		}
	}
}
