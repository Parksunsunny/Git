package day2;

public class ScoreSwitchTest 
{
	public static void main(String[] args) 
	{
		int kor = (int) (Math.random() * 100) + 1;
		int eng = (int) (Math.random() * 100) + 1;
		int mat = (int) (Math.random() * 100) + 1;
		int sum = kor + eng + mat;
		int avg = sum / 3;
		String grade;
	
		switch(avg/10)
		{
			case 10:
			case 9:
			case 8:
				grade = "A";
				break;

			case 7:
			case 6:
				grade = "B";
				break;
				
			case 5:
			case 4:
				grade = "C";
				break;
			
			default:
				grade = "D";
				break;
		}
		if(avg >= 90)
		{
			grade = "A등급";
		}
		else if(avg >= 80)
		{
			grade = "B등급";
		}
		else if(avg >= 70)
		{
			grade = "C등급";
		}
		else
		{
			grade = "D등급";
		}
		
		System.out.printf("국어 %d 영어 %d 수학 %d 총점 %d 평균%d 등급%s\n",kor, eng, mat,sum,avg, grade);
	}

}
