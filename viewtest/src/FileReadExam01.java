import java.io.FileReader;
import java.io.IOException;

public class FileReadExam01 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("sample.txt");
		int readData = fileReader.read(); // read()->한 글자만 읽어온다.

		while ((readData = fileReader.read()) != -1) { // -1은 자료가 없다는 얘기임
			System.out.println((char) readData);
		}
		fileReader.close(); // 파일이 닫히지않고 계속 열려있으면 컴퓨터 다운된다.
	}
}
