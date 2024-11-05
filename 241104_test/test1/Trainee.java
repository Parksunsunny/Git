package test1;

public class Trainee 
{
	String Name;	
	static String Organ = "이즈웰 풀스택 과정";
	String Course;
	double Expenses;
	
	Trainee(){}
	
	// Source - Generate Constructor using Fields ...
	public Trainee(String name, String course, double expenses, double refund) 
	{
		Name = name;
		Course = course;
		Expenses = expenses;
		Refund = refund;
	}

	final double Surcharge = 50000;
	double Refund;
	
	public void Calculate_Refund(String name, String course, String expenses)
	{
		Name = name;
		Course = course;
		
		if(Course.equals("JSP프로그래밍"))
		{
			Refund = Integer.parseInt(expenses) * 0.25 + Surcharge;
		}
		else if(Course.equals("자바프로그래밍"))
		{
			Refund = Integer.parseInt(expenses) * 0.2 + Surcharge;
		}
		else if(Course.equals("DATABASE프로그래밍"))
		{
			Refund = Integer.parseInt(expenses) * 0.15 + Surcharge;
		}
		else
		{
			Refund = 0;
		}
	}
}
