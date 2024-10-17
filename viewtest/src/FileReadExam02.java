import java.io.FileReader;
import java.io.IOException;

public class FileReadExam02 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("sample.txt");
		int readCount = -9999; // read()->한 글자만 읽어온다.
		// 한꺼번에 잃어와서 저장할 문자 배열을 만들어 준다.
		char[] readDatas = new char[10]; // 한꺼번에 열글자씩 읽어와서 저장할 용도->너무커도 버츄얼 메모리를 사용해 성능 저하됨

		while ((readCount = fileReader.read(readDatas)) != -1) { // -1은 자료가 없다는 얘기임
//			for	(char rd /*배열안에 들어잇는 요소 타입과 변수*/: readDatas/*배열명을 기술한다*/) { //향상된 for 반복문
//			System.out.print( rd );
//			}
			for (int i = 0; i < readCount; i = i + 1) {
				System.out.print(readDatas[i]);
			}
		}
		fileReader.close(); // 파일이 닫히지않고 계속 열려있으면 컴퓨터 다운된다.
	}
}
