package baisc.chap02lecture;

import java.util.ArrayList;
import java.util.List;

public class LoopExamReal02 {
	public static void main(String[] args) {
		List listData = new ArrayList(); //배역의 친구 => 가변적인 자료를 담을 수 있는 배열
		listData.add("3701");
		listData.add("김마리");
		listData.add(100);
//		System.out.println(listData.get(2));
		for (int i = 0; i < listData.size() ; i=i+1) {
			System.out.println(listData.get(i));
		}
}
}
