package test;

import java.util.Scanner;

public class Ex3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		/*
		String name = (String)sc.next();
		int java = sc.nextInt();
		int db = sc.nextInt();
		int spring = sc.nextInt();
		int sum = java + db + spring;
		double avg = (java + db + spring) / 3;
		 */
		String word = sc.next();

		for(int i = 0; i <word.length(); i++)
		{
			if(65 <= (int)word.charAt(i)&& (int)word.charAt(i) <= 122)
			{
				System.out.println(word.charAt(i) + " : 알파벳");
			}
			else if(48 <= (int)word.charAt(i)&& (int)word.charAt(i) <= 57)
			{
				System.out.println(word.charAt(i) + " : 숫자");
			}
			else
			{
				System.out.println(word.charAt(i) + " : 해당없음");				
			}			
		}
		
		/*
		System.out.println(name);
		if(0 <= java && java <= 100)
		{
			System.out.println(java);
		}
		
		if(0 <= db && db <= 100)
		{
			System.out.println(db);
		}
		
		if(0 <= spring && spring <= 100)
		{
			System.out.println(spring);
		}
		
		System.out.println(sum);
		System.out.println(avg);
		*/
				
	}

}
