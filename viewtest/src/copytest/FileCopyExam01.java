package copytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyExam01 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("원본 파일명 입력");
		String source = scan.next();
		System.out.println("변형본 파일명 입력");
		String target = scan.next();
		FileInputStream fis = new FileInputStream(source); // 만들어질파일
		FileOutputStream fos = new FileOutputStream(target); // 복사되어 저장될 파일

		/*
		 * FileInputStream fis = new FileInputStream(source);
		 * FileOutputStream fos = new
		 * FileOutputStream(target); 는 고정된 형태임!
		 */
		int readByte = 12345;
		while ((readByte = fis.read()) != -1)
			;
		{
			readByte = readByte + 2; // 카피할때는 +2 / 복원할때는 -2
			fos.write(readByte);
		}
		/* while((readData=원본파일.read()) !=-1) {복사본파일 write();} 파일 사이즈가 크면 오래걸림 */
		// 자바는 최대메모리 4Gbype 이상넘어가면 가상메모리를 사용
		fis.close();
		fos.close();
	}
}