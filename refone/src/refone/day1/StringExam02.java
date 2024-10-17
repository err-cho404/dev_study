package refone.day1;

public class StringExam02 {
	public static void main(String[] args) {
		//문자열에 관한 다양한 메서드 사용 예제
		String testStr = "나의 살던 고향은";
		System.out.println("==문자열의 총 글자 수 얻어오기 .length()==");
		System.out.println(testStr.length()); //9
		
		System.out.println("==특정 위치의 글자 얻어오기 .charAt(위치)==");
		System.out.println(testStr.charAt(4-1)); //살
		
		System.out.println("==문자열을 문자 배열로 만들기 .toCharArray()==");
		char[] testStrArray = testStr.toCharArray();
		System.out.println(testStrArray[4-1]); //살
		
		//특정 문자 또는 문자열이 있는지, 있다면 시작위치를 얻어오기 .indexOf(문자 or 문자열);
		System.out.println(testStr.indexOf("고")); //6
		System.out.println(testStr.indexOf("살던")); //3->"살던의" 시작위치
		System.out.println(testStr.indexOf("살던곳")); //없는 것을 찾으면 -1을 반환
		
		System.out.println("==특정 단어의 빈도수 확인==");
		String sampleData = 
				"누구나 한번쯤의 사랑에 속고 누구나 한번쯤은 사랑에 울고 그것이 바로 사랑 사랑이야";
		String searchWord = "사랑"; //찾고자 하는 단어
		int startIdx=0; //맨처음 시작 위치
		int wordCount = 0; //갯수를 세는 변수
		while((startIdx = sampleData.indexOf(searchWord,startIdx))!=-1) {
			wordCount = wordCount+1;
			startIdx = startIdx+1;
		System.out.println(searchWord+"[이]라는 단어가 "+wordCount + "개가 사용되었습니다");
			
		System.out.println("==부분 문자열 얻기 substring()==");
		System.out.println(testStr.substring(1)); //의 살던 고향은
		System.out.println(testStr.substring(1,8)); //의 살던 고향
			
		System.out.println("==문자열을 특정한 기호(문자열)로 분리해서 문자열 배열로 변환 split(구분문자열)==");
		String [] words = sampleData.split(" "); //공백으로 문자열 분리하기
		System.out.println("분리된 단어의 개수 : " + words.length);
		
		String parag ="나는 홍길동입니다. 나는 호형호재를 할 수 없습니다. 그래서 참으로 슬픕니다.";
		String [] words2 = parag.split("다.");
		System.out.printf("parag에 저장된 텍스트는 %d 개의 문장으로 이루어 졌습니다.", parag.split("\\.").length); // '.'은 정규표현식에서 의미를 가지므로 '\\.' 으로 써야함.
		
		System.out.println("split 사용시 주의할 사항");
		System.out.println("나의 살던 고향은".split(" ").length); //3
		System.out.println("나의 살던       고향은".split(" ").length); //-> 공백의 수 많큼
		System.out.println("나의 살던       고향은".split("\s+").length); //-> \s 는 정규표현식 중 '화이트 스페이스(공백, tab, enter)'를 뜻함, +는 1개 이상을 의미 [\s]+
		
		System.out.println("임의의 문자열이 시작(startsWith)하는지끝나는지(endWith)알아보기");
		String samData = "yangdoll.txt";
		System.out.println(samData.startsWith("yamg")); //false
		System.out.println(samData.endsWith(".txt")); //true
		
		/*
		 이메일 폴더에 파일 목록(이미지 파일들이 있는 폴더)을 읽어서 공백으로 분리하는 문자열을 만든다.
		 문자열 배열의 파일 이름으로 분리한다. String[] imgFileNames=문자열.split(" ");
		 imgFileNames 배열의 개수만큼 반복한다.
		 반복문 안에는 startsWith나 endsWith 메서드를 사용해서 종류별로 분리를 한다.
		 분리된 배열을 이용해서 HTML문서에 실시가 적용이 되도록 자동화 한다.
		 디자이너 또는 퍼블리셔 규칙에 맞게 파일이름 또는 컨텐츠 내용을 작성해 폴더에 저장하면 된다.
		 */
		
		System.out.println("yangDoll.toUpperCase() => " + "yangDoll".toUpperCase()); // 대문자로 변경
		System.out.println("yangDoll.toLowerCase() => " + "yangDoll".toLowerCase()); // 소문자로 변경
		
		String imsiData = "천둥산 박달재를 울고 넘는 우리님아";
		System.out.println(imsiData.toString());
		System.out.println(imsiData); //=> 참조변수명을 쓰면 컴파일러는 자동으로 .toString()를 붙여준다.
		
		System.out.println("===문자의 앞 뒤 공백문자 제거 .trim()===");
		System.out.println("   천둥산 박달새를       ".trim());
		
		System.out.println("===문자열 치환 .replace()===");
		System.out.println("사랑 그것은 제 2의 생명 그누구도 줄 수 없는 사랑".replace("사랑","Love"));				
		}
	}
}
