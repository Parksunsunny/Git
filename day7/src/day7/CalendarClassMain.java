package day7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarClassMain 
{
	public static void main(String[] args) 
	{
		//TimeZone t = TimeZone.getTimeZone("America/Los_Angeles");
		//Calendar cal = Calendar.getInstance(t);
		Calendar cal = Calendar.getInstance();
		// abstract클래스 + 인터페이스 - 상속하위구현 - 라이브러리내부 지역(locale) 정보 날ㅉ라와 시간 생성하느 하위클래스 제공
		//System.out.println(cal);
		
		// 년도, 월, 일, 시, 분, 초 추출
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("현재시각 : %d 년도 %d 월 %d일 %d시 %d분 %d초 ", year, month, day, hour, minute, second);
			
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.PM)
		{
			System.out.println("오후");
		}
		else
		{
			System.out.println("오전" );			
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 E요일 HH시 mm분 ss초");
		sdf.format(new Date());
		
		// Calendar객체를 Date객체 변환
		Date now = cal.getTime();
		System.out.println(sdf.format(now));
	}
}
