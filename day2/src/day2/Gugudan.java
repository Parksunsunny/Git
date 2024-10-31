package day2;

public class Gugudan 
{
	public static void main(String[] args) 
	{
		outer:for(int i = 1; i < 10; i++)
		{
			for(int dan = 2; dan < 10; dan++)
			{
				if(dan == 7)	break outer;
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
			}
			System.out.println();
		}
	}

}
