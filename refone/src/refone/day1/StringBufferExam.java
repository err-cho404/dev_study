package refone.day1;

public class StringBufferExam {
	public static void main(String[] args) {
		String data1 = new String ("출력내용");
		String data2 = "출력내용";
		System.out.println(data1 + "\n" + data2);
		
		//String 타입으로 정의된 데이터는 불변데이터다. 원본데이터는 변하지 않는다.
		String data = "나는 문자열 데이터입니다.";
		System.out.println( data.substring(3,6)); //문자열 <= 새로운 문자열 자료이다.
		System.out.println(data);//<= 원본 변하지 않음
		
		//StringBuffer타입의 문자열 만드는 방법
		StringBuffer sbData = new StringBuffer(); //비어있는 문자열 추가하는 방법
		sbData.append("김마리");
		System.out.println(sbData);
		
		System.out.println("===2번째===");
		StringBuffer sbData2 = new StringBuffer(125); //미리 자릿수를 확보한 후에 추가하는 방법, 넉넉히 확보되어있어야 성능빠름
		sbData2.append("김마리김마리김마리김마리김마리김마리김마리김마리김마리");
		sbData2.append("덕뒤순"); //=>위의 sbData2.append("김마리김마리김마리김마리김마리김마리김마리김마리김마리");에 추가된다.
		System.out.println(sbData2);
		
		System.out.println("===3번째===");
		StringBuffer sbData3 = new StringBuffer("mari");
		System.out.println(sbData3.toString());
		sbData3.append("kim");
		System.out.println(sbData3.toString());
		
		System.out.println("저장된 문자열을 역순으로 reverse() => " + sbData3.reverse());
		
		System.out.println("저장된 문자열 단어 분리 => 문자열로 변경한 후 에 split()을 사용한다.");
//		String sbStringData = sbData3 + "";
		String sbStringData = sbData3.toString();
		String[] words = sbStringData.split(" ");
		System.out.println(words[0] + "\n" + words[1]);
		
		String samData = "맛있는 분식 조합";
		StringBuilder sbSamData = new StringBuilder(samData);
		System.out.println(sbSamData.reverse());
	}

}
