package viewtest;

import java.io.FileWriter;
import java.io.IOException;

public class FIleSaveExam01 {
	public static void main(String[] args) throws IOException {
		// 파일이 있어야 한다...=>파일을 만들어야 한다. 1
		FileWriter fileWriter = new FileWriter("sample.txt", true); // false->기존내용을 지우고 새로 추가한다. true->기존파일에 추가로 내용을
																	// 추가한다.

		// 저장할 내용이 있어야한다.=>텍스트=>문자열
		String saveText = "diffldfiflfdiffktjd \n";

		// 만들어진 파일에 텍스트를 저장한다.
		fileWriter.write(saveText);

		// 저장 후 반드시 파일을 닫아준다. 2
		fileWriter.close();
	}
}
