package day7;

import java.util.regex.Pattern;

public class PatternClassMain 
{
	public static void main(String[] args) 
	{
		String pattern = "010[0-9]{8}";
		String tel1 = "01012345678";
		String tel2 = "010-12345678";
		String tel3 = "010a2345678";
		String tel4 = "0102345678";
		
		//System.out.println(Pattern.matches("[abc]{2}","ab"));
		System.out.println(tel1 + ":" + Pattern.matches(pattern, tel1));
		System.out.println(tel2 + ":" + Pattern.matches(pattern, tel2));
		System.out.println(tel3 + ":" + Pattern.matches(pattern, tel3));
		System.out.println(tel4 + ":" + Pattern.matches(pattern, tel4));

		System.out.println("010.1234.5678" + ":" + Pattern.matches("010\\.\\d{4}\\.\\d{4}", "010.1234.5678"));
		
		// 전화번호양식. 02-, 010- 시작. 숫자들 3-4자리. '-'. 숫자 4자리
		String tels[] = {"02-123-4567","010-1234-5678", "011-일이삼사-5678"};
		String telPattern = "(02|010)-\\d{3,4}-[0-9]{4}";
		
		for(String s : tels)
		{
			System.out.println(s + " : " + Pattern.matches(telPattern, s));
		}
		
		// 이메일체크. 숫자+영문대소문자1글자이상. @. 이메일도메인명은 숫자+영문자대소문자구성. 마지막은 숫자+영문자
		String emails[] = {"angel@daum.net","java@www.naver.com", "javaangel@google.com"};
		String emailPattern = "[a-zA-Z0-9]{1,}@\\w+\\.\\w+(\\.\\w+)?";
		
		for(String s : emails)
		{
			System.out.println(s + " : " + Pattern.matches(emailPattern, s));
		}
		
		//ulr 체크
		/* 1. http / https 시작
		 * 2. :// 후속등장
		 * 3. 도메인 구성 숫자+대소문자+한글 2글자이상
		 * 4. .후속 등장
		 * 5. com 또는 or.kr종료
		 * */
		String urls[] = {"http://www.multicampus.com","https://www.multicampus.com", "http://www.멀티.co.kr","http://www.MULTI1235.com"};
		String urlPattern = "https?://www\\.([a-zA-Z0-9가-힣]{2,}\\.)+(com|co.kr)";
		
		for(String s : urls)
		{
			System.out.println(s + " : " + Pattern.matches(urlPattern, s));
		}
	}
}
