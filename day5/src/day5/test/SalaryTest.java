package day5.test;

class Employee
{
 	int 	Number 	= 0	;
	String 	Name 	= "";
	int 	Salary 	= 0	;
	int 	Common 	= 0	;
	int 	Total 	= 0	;
	int 	Quali 	= 0	;
	int 	Tech 	= 0	;

	Employee(int Number, String Name, int Salary, int Common)
 	{
 		this.Number 	= Number;
 		this.Name 		= Name	;	
 		this.Salary 	= Salary;
 		this.Common 	= Common;
 	}
	
	void Total()
	{
		Total = Salary + Common;
	}
}

class Manager extends Employee
{
	int 	Cadre 	= 0	;

	Manager(int Number, String Name, int Salary, int Common, int Cadre)
 	{
		super(Number, Name, Salary, Common);
		
 		this.Cadre 	= Cadre	;
 	}
	
	void Total()
	{
		Total = Salary + Common + Cadre;
	}
}

class Engineer extends Employee
{
	Engineer(int Number, String Name, int Salary, int Common, int Quali, int Tech)
 	{
		super(Number, Name, Salary, Common);
		
 		this.Quali 	= Quali	;
 		this.Tech 	= Tech	;
 	}
	
	void Total()
	{
		Total = Salary + Common + Quali + Tech;
	}
} 

class Secretary  extends Employee
{
	int 	Secre 	= 0	;

	Secretary(int Number, String Name, int Salary, int Common, int Secre)
 	{
		super(Number, Name, Salary, Common);
		
 		this.Secre 	= Secre	;
 	}
	
	void Total()
	{
		Total = Salary + Common + Secre;
	}
}


public class SalaryTest 
{
	public static void main(String[] args) 
	{
		Employee [] allList = new Employee[4];
		allList[0] = new Employee (1000, "이사원", 10000, 5000			  );
		allList[1] = new Manager  (2000, "김경영", 20000, 10000, 10000	  );
		allList[2] = new Engineer (3000, "박기술", 15000, 7500 , 5000 ,5000 );
		allList[3] = new Secretary(4000, "최비서", 15000, 7000 , 10000	  );

		System.out.printf("사번\t이름\t본봉\t총급여\n");
		
		for(int i = 0; i < allList.length; i++)
		{
			allList[i].Total();

			System.out.printf("%d\t%s\t%d\t%d\n",
					allList[i].Number,allList[i].Name,allList[i].Salary,allList[i].Total);
						
			if(allList[i] instanceof Engineer)
			{
				System.out.printf("기술수당 : %d\t자격수당 : %d\n", allList[i].Tech, allList[i].Quali);
			}
		}
	}
}
