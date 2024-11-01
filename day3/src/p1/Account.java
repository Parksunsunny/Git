package p1;

public class Account 
{
	int code = 100;
	private int password = 1111;
	
	public void setPassword(String msg)
	{
		password = 2222;
	}
}

class BankApp
{
	void changePassword()
	{
		Account a = new Account();
		a.setPassword("비번바꿔");
	}
}