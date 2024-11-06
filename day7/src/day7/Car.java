package day7;

class CarName 
{
	String name;
	String detail = "차량의 상세정보 표현";
	
	public CarName(String name)
	{
		super();
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name + ":" + detail;
	}
}

class CarPosition
{
	int position;

	public CarPosition(int position) 
	{
		super();
		this.position = position;
	}

	@Override
	public String toString() 
	{
		return "CarPosition [position=" + position + "]";
	}
	
}

public class Car 
{
	public final CarName carName;
	public final CarPosition carPosition;
	
	public Car(CarName car, CarPosition position)
	{
		carName = car;
		carPosition = position;
	}
	
	private Car(String name, int position)
	{
		this(new CarName(name), new CarPosition(position));
	}
	
	public Car()
	{
		this("mycar", 100);
		System.out.println("Car기본 생성자 호출");
	}

	public CarName getCarName() {
		return carName;
	}

	public CarPosition getCarPosition() {
		return carPosition;
	}
	
	public static void aaa()
	{
		System.out.println("Aaa메소드호출");
	}
	
	private static void bbb()
	{
		System.out.println("bbb메소드호출");
	}
	
	public int ccc(int i, int j)
	{
		System.out.println("ccc메소드호출");	
		return i + j;			
	}
	
	private int ddd()
	{
		return 1000;		
	}
}
