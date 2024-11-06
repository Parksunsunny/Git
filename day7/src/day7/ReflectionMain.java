package day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain 
{
	public static void main(String[] args) throws Exception
	{
		// Object.class, String.class IllegalArgumentException.class
		//try
		{
			//Class obj = Class.forName("java.lang.Object"); // forName메소드 static
			//Class obj = ReflectionMain.class;
			Car ref = new Car();
			Class cls = ref.getClass();
			System.out.println("클래스이름 : " + cls.getName());
			
			/* java.lang.Class
			 * java.lang.reflect.Constructor 클래스이름
			 * */
			// test1 : private 제외한 생성자들
			/*Constructor[] constructors = cls.getConstructors();
			
			for(Constructor oneconst : constructors)
			{
				System.out.println(oneconst);	
			}
			
			// test2 : private 포함한 생성자들
			Constructor[] constructors = cls.getDeclaredConstructors();
						
			for(Constructor oneconst : constructors)
			{
				System.out.println(oneconst);	
			}
			
			// test3 : 원하는 public 생성자 1개
			Constructor constructor = cls.getConstructor(CarName.class, CarPosition.class);
			
			System.out.println(constructor);	
			
			// test4 : 원하는 private 생성자 1개
			Constructor constructor = cls.getDeclaredConstructor(String.class, int.class);
			
			System.out.println(constructor);	
			
			// test5 : 생성자 통해 객체 생성
			Constructor constructor = cls.getConstructor();
			constructor.newInstance();
			
			// test6 : 기본 / 매개변수 생성자 통해 객체 생성
			Constructor constructor = cls.getDeclaredConstructor(String.class, int.class);
			constructor.setAccessible(true); // private 생성자 호출 위해 사전 설정
			constructor.newInstance("myfullstackcar", 500);
						
			// 메소드
			// test7 : 모든/특정 private/public 메소드
			Method[] methods = cls.getDeclaredMethods();
			for(Method m : methods)
			{
				System.out.println(m);
			}
			//cls.getDeclaredMethod("a",int.class);
			
			// test8 : 매개변수 없고 리턴타입 void 메소드 실행
			cls.getDeclaredMethod("aaa").invoke(cls);
			
			Method bbb = cls.getDeclaredMethod("bbb");
			bbb.setAccessible(true);
			bbb.invoke(cls);

			// 매개변수 없고 리턴타입 int, private (non-static) 메소드 ddd 실행
			Method ddd = cls.getDeclaredMethod("ddd");
			ddd.setAccessible(true);
			Integer obj = (Integer)ddd.invoke(ref);
			System.out.println(obj);
			
			// 매개변수 int 2개, 리턴타입 int public (non-static) 메소드 ccc 실행
			Method ccc = cls.getDeclaredMethod("ccc", int.class, int.class);
			Integer obj2 = (Integer)ccc.invoke(ref, 10, 20);
			System.out.println(obj2);
			*/
			
			// 멤버변수
			// test9 : 멤버변수-field변수
			Field fields[] = cls.getDeclaredFields();
			for(Field f : fields)
			{
				System.out.println(f);
			}
			
			
			// annotation 정보 추출
			
		}
		//catch(ClassNotFoundException e)
		{
		//	System.out.println("잘못된 클래스이름입니다.");
		}
	}
}
