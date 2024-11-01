package test_241030;

import java.util.Scanner;

public class Ex2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name = (String)sc.next();
		int java = sc.nextInt();
		int db = sc.nextInt();
		int spring = sc.nextInt();
		int sum = java + db + spring;
		double avg = sum / 3;
		boolean a = false, b= false, c= false;
		
		System.out.println(name);
		if(0 <= java && java <= 100)
		{
			System.out.println(java);
			a = true;
		}
		
		if(0 <= db && db <= 100)
		{
			System.out.println(db);
			b = true;
		}
		
		if(0 <= spring && spring <= 100)
		{
			System.out.println(spring);
			c = true;
		}
		
		if(a == true && b == true && c == true)
		{
			System.out.println(sum);
			System.out.println(avg);		
		}
	}
}
