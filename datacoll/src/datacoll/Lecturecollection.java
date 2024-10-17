package datacoll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lecturecollection {
	public static void main(String[] args) {
		List aaa;
		aaa = new ArrayList(); //List aaa = new ArrayList();
		aaa.add(100); //[0]
		aaa.add(12.5); //[1]
		aaa.add("yangdoll"); //[2]
		aaa.add(100); //중복 허용 [3]
		System.out.println("aaa 리스트에 보관된 자료의 개수" + aaa.size());
		for(int i=0; i<aaa.size(); i=i+1) {
			System.out.println( aaa.get(i) ); 
		}
		
		System.out.println("==== 또 다른 방법 ====");
		for(Object data : aaa) { //(오브젝트명 : List명)
			System.out.println( data);
		}//이 예제에서는 사용하면 문제 발생 확률이 다분함 <= <>을 사용하지 않았기 때문에
		
		List<Integer> aaaTwo = new ArrayList<Integer>(); //중복데이터 저장가능
		aaaTwo.add(100); // aaaTwo.add(12.5); -> 정수가 아니라 오류남
		aaaTwo.add(5000);
		aaaTwo.add(300000);
		for(int data : aaaTwo) { //제너릭을 사용했을경우 향상된 for문을 사용하는 것은 효과적이다
			System.out.println( data );
		}
		
		Set bbb ; 
		bbb = new HashSet(); //중복허용x
		
		Map ccc;
		ccc = new HashMap();
		
		System.out.println("==== 또 다른 방법 모든 컬렉션(set,list,map)에서 동일하게 적용====");
		Iterator<Integer> iter = aaaTwo.iterator(); //인덱스번호가 매겨지지 않아 불러오기 번거로움(더 많이 사용)
		while(iter.hasNext()) {
			int value = iter.next();
			System.out.println(value);
		}
		
		System.out.println("==== 또 다른 방법 가장 최신버전 ====");
		aaaTwo.forEach(data-> System.out.println(data)); //인덱스번호가 매겨지지 않아 불러오기 번거로움
	}
}
