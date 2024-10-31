package day2;

public class TimeConversion
{
	public static void main(String[] args) 
	{
		int time = 10000;
		
		int hour = time / 3600;		
		time = time % 3600;
		int min = time / 60;
		int sec = min % 60;
	}
}
