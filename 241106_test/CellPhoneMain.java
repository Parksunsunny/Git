package test_241106;

class CellPhone
{
	String model;	// 핸드폰 모델명
	double battery;	// 남은 배터리 양
	
	CellPhone(String model)
	{
		
	}

	void  call(int time)
	{
		//통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다.
		//선언부에 IllegalArgumentException 전달 표현을 추가한다
		
		//감소되는 배터리 양 = 통화시간(분) * 0.5
		//배터리 양은 0보다 작아지지 않는다.
		//통화 시간(분)이 0보다 작은 경우에는 
		//배터리 양은 변화없고 
		//IllegalArgumentException("통화시간입력오류”) 발생시킨다

				
		if( 0 > time)
		{
			System.out.printf("통화시간입력오류\n");
		}
		else
		{
			System.out.printf("통화 시간 : %d분\n", time);
			
			battery -= time * 0.5;
			
			if(battery < 0)
			{
				battery = 0;
			}
		}
		
	}

	void  charge(int time)
	{
		// 충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리 양을 증가시킨다.
		//선언부에 IllegalArgumentException 전달 표현을 추가한다
		
		//충전되는 배터리 양 = 충전시간(분) * 3
		//배터리 양은 100까지만 증가한다.
		//충전 시간(분)이 100보다 큰 경우에는 
		//배터리 양은 변화없고 
		//IllegalArgumentException("충전시간입력오류”) 발생시킨다
		
		System.out.printf("충전 시간 : %d분\n", time);
				
		if(100 > time)
		{
			battery += time * 3;
			
			if(battery > 100)
			{
				battery = 100;
			}
		}		
		else		
		{
			System.out.printf("충전시간입력오류\n");
		}
	}
	
	void  printBattery()	// 남은 배터리 양을 출력한다.
	{
		System.out.printf("남은 배터리 양 : %.2f\n",battery);
	}
	
	boolean isSame(CellPhone other)
	{
		//CellPhone 타입의 객체를 입력받고, 입력받은 객체의 모델명이 같은 경우에 true를 리턴한다.
		if(other.equals("GALAXY-24"))
		{
			return true;
		}
		else
			return false;
	}
}

public class CellPhoneMain 
{
	public static void main(String[] args) 
	{
		CellPhone myPhone =  new CellPhone("GALAXY-24");
		
		//charge, call 메소드 호출 포함하여 try-catch 블록 정의
		// throws 하고 있는 예외 처리한다.
		// 각 예외 발생시 어떤 메소드에서 어떤 원인으로 발생했는지
		// 출력한다

		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
				
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
				
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
			
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
				
		myPhone.call( -20 );  //통화시간입력오류
				
		CellPhone yourPhone = new CellPhone("galaxy-24");
				
		if( myPhone.isSame(yourPhone) ) 
		{
			System.out.println("동일 모델입니다.");
		} 
		else 
		{
			System.out.println("다른 모델입니다.");
		} 

		/*<<CellPhoneMain 실행결과>>
		충전 시간 : 20분
		남은 배터리 양 : 60.0
		통화 시간 : 300분
		남은 배터리 양 : 0.0
		충전 시간 : 50분
		남은 배터리 양 : 100.0
		통화 시간 : 40분
		남은 배터리 양 : 80.0
		통화시간입력오류
		동일 모델입니다. 
		*/
	}
}
