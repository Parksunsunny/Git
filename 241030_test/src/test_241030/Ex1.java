package test_241030;

public class Ex1 
{
	public static void main(String[] args) 
	{		
		String name = "이자바";
		byte java = 100;
		byte db = 77;
		byte spring = 89;
		//short sum = (short)(java + db + spring);
		int sum = java + db + spring;
		double avg = sum / 3;
		
		System.out.println(name);
		System.out.println(java);
		System.out.println(db);
		System.out.println(spring);
		System.out.println(sum);
		System.out.println(avg);				
	}

}
