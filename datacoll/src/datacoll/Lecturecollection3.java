package datacoll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Lecturecollection3 {
	public static void main(String[] args) {
		// key 값("age"라고 쓴 부분)도 데이터로 사용 할 수 있으면 좋다.
		Map<String, String> md = new HashMap<String, String>();
		md.put("age", "19살");
		System.out.println(md.size() + " " + md.get("age"));
		md.put("age", "20살"); //기존 k값에 다른 값을 집어넣는다.
		System.out.println(md.size() + " " + md.get("age"));
		
		md.remove("age");
		System.out.println("삭제후 : " + md.size() + " " + md.get("age"));
		
		System.out.println("=================================");
		md.put("irum","honggildong");  md.put("address","suwon");  md.put("age","21살"); 
		System.out.println( md.size());
		System.out.println("=========map에 저장된 자료 전체 출력하기=========");
		//1. k값 전체를 가져온다. =>"irum","address","age"
		Set<String/*map의 타입*/> keySet = md.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String keyName = iter.next();
			System.out.println(keyName + "에 저장된 자료 : " + md.get(keyName));
		}
		
		System.out.println("=========map에 저장된 자료 전체 출력하기(또다른 방법)=========");		
		md.forEach((t, u) -> 
				System.out.println(t + "에 저장된 자료 : " + u)		
		); //->람다식
		
		md.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.println("k는 = " + t + " , v 저장된 자료는 : " + u);
			}
		});
		
	}
}
