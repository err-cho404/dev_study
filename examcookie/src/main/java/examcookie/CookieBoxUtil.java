package examcookie;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

public class CookieBoxUtil {
	
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>(); /*Map<타입, 실제자료>*/
	
	public CookieBoxUtil(HttpServletRequest request) { //생성자 반드시 request객체를 넘겨받는다.
		Cookie[] cookies = request.getCookies(); /*쿠키를 만들어서 다 가져와라*/
		if(cookies !=null) {
			for(int i = 0 ; i < cookies.length ; i = i + 1) { /*쿠키의 개수 만큼(얼마나있는지 모르지만 반복으로 다 찾아서*/
				cookieMap.put(cookies[i].getName(),cookies[i]); /*쿠키의 이름을 가져온다*/
			}
		}
	}
	//쿠키를 쉽게 만들기 다양한 방법으로 =>static으로 정리된다. 메서드 호출시 클래스명, 메서드명() 형태로 시용한다.
	//가장 기본적인 쿠키 만들기
	public static Cookie createCookie(String name, String value) {
		/*int cookie = 0;
		Cookie cookie= new Cookie(name,value);
		return cookie; -> 이렇게 만들거나 아래처럼 간단하게 만들어도 상관없음*/
		
		//쿠키명과 쿠키값을 받아서 쿠키를 만들어줌
		return new Cookie(name,value);  
	}
	//쿠키의 보유기간까지 설정해서 쿠키를 만들어 준다.
	public static Cookie createCookie(String name, String value, int maxAge) {
		Cookie cookie= new Cookie(name,value);
		cookie.setMaxAge(maxAge);
		return cookie;  
	}
	//도메인과 기간을 설정한 쿠키를 만들어 준다.
	public static Cookie createCookie(String name, String value, String domain, int maxAge) {
		Cookie cookie= new Cookie(name,value);
		cookie.setDomain(domain);
		cookie.setMaxAge(maxAge);
		return cookie;  
	}
	//도메인과 경로을 설정한 쿠키를 만들어 준다.
	public static Cookie createCookie(String name, String value, int maxAge, String path) {
		Cookie cookie= new Cookie(name,value);
		cookie.setDomain(path);
		cookie.setMaxAge(maxAge);
		return cookie;  
	}
	
	//쿠키의 모든 경로를 설정한 쿠키를 만들어준다.
	public static Cookie createCookie(String name, String value, String domain, int maxAge, String path) {
		Cookie cookie= new Cookie(name,value);
		cookie.setDomain(domain);
		cookie.setMaxAge(maxAge);
		cookie.setPath(path);
		return cookie;  
	}
	//아래 메서드들은 모드 인스턴스메서드로 호출하는 곳에서 반드시 객체를 "생성하고 참조변수, 메서드명()" 형식으로 사용한다.
	public Cookie getCookie(String name) { //name 으로 쿠키를 가져옴
		return cookieMap.get(name);
	}
	public String getValue(String name){ //쿠키의 값을 가져옴
		Cookie cookie =  getCookie(name);
		if(cookie == null) { //쿠키의 값이 없다면
			return null; //null 반납 (아무것도 반납하지 않음)
		}
		return cookie.getValue(); //아니라면(값이있다면) 값을 가져온다.
	}
	public boolean exists(String name) { //값이있디면 true, 없다면 false
		Cookie cookie = cookieMap.get(name);
		if(cookie == null) {
			return false;
		}else {
			return true;
		}
		// return cookieMap.get(name) != null; -> 한줄로 줄이면 이렇게 사용할 수 도 있다.
	}
}
