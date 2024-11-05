package test1;

public class TraineeTest
{
	public static void main(String[] args) 
	{
		Trainee Train = new Trainee();
		
		Train.Calculate_Refund(args[0], args[1], args[2]);
		
		if( 0 != Train.Refund )
		{
			System.out.printf("%s %s %.2f", Train.Name, Train.Course, Train.Refund);
		}
		else
		{
			System.out.println("잘못된 과정명입니다.");
		}
	}
}
