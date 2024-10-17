package datacoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Lecturecollection2 {
	public static void main(String[] args) {
		Set<String> setData = new HashSet<String>();
		System.out.println( "자료의개수" + setData.size()); 
		setData.add("홍길동");
		System.out.println( "자료의개수" + setData.size()); 
		setData.add("홍길남");
		System.out.println( "자료의개수" + setData.size()); 
		setData.add("홍길동");
		System.out.println( "자료의개수" + setData.size()); 
		
		Iterator<String> iter = setData.iterator(); //iterator는 while을 가져온다.
		int position = 0;
		while(iter.hasNext()) {
			String getdata = iter.next(); // <--꼭 변수명을 정해서 iter 데이터를 저장해주기(에러잡기가 힘듦)
			position = position + 1; // 순서가 필요하면 직접 만들어줘야함.
			System.out.println(position + "번째 자료" + getdata); 
		}
		System.out.println("====나중에 꼭 생각해보기===");
		List<String> setConList = new ArrayList<String>(setData); //set 타입을 list 타입으로 변환해줌 
		System.out.println(setConList.get(0));
		System.out.println(setConList.get(1));
		setConList.add("나일등");  setConList.add("나꼴등");  setConList.add("나일등");
		System.out.println( "list의 자료의개수" + setConList.size()); 
		
		Set<String> listConSet = new HashSet<String>(setConList);//list 타입을 set 타입으로 변환해줌 
		System.out.println( "set의 자료의개수" + listConSet.size());
		
		String[] names = {"홍길동","홍길남","홍길순","나일등","나꼴등","나일등"};
		List<String> arrConList = Arrays.asList(names); //배열안의 데이터를 리스트의 데이터로 만들어줌
		System.out.println( arrConList.get(3));
//		arrConList.add("나삼등");
//		System.out.println( arrConList.get(6));
		
		Set<String> arrConSet = new HashSet<String>(Arrays.asList(names));//배열 타입을 set 타입으로 변환해줌
		System.out.println( arrConSet.size());
		
		arrConSet.forEach((String t)-> 
				System.out.println(t)
		);
	}
}

