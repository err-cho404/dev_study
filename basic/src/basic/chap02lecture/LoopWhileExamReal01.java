package baisc.chap02lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWhileExamReal01 {
	public static void main(String[] args) {
		Set setData = new HashSet(); 		//Set 자료구조는 중복을 제거하고, 순서가 없다.(순서를 알 수 없다.배열 index 순서가 없음)
		setData.add("one");
		setData.add("two");
		setData.add("three");
		setData.add("four"); //set은 중복되는 자료를 제거할 수 있다.
		
		Iterator iter = setData.iterator();
		while(iter.hasNext()) {  //주로 isnext나 hasnext가 쓰임
			System.out.println(iter.next());  //->공식에 가까움 변수이름만 내마음대로 변경
		}
		
//		for(;iter.hasNext();) {
//			System.out.println(iter.next());
//		}
	}
}
