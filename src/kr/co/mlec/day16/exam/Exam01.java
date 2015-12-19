package kr.co.mlec.day16.exam;

public class Exam01 {
public static void main(String[] args) {
	
	// data/ioexam01.txt 파일을
	// data/a/b/ioexam01.txt에 복사하는 기능 구현
	try{
	FileUtil.copy("data/ioexam01.txt","data/a/b/ioexam01.txt");
	
	// data/a/b 디렉토리가 존재할 경우 해당 디렉토리에 ioexam02.txt 파일
	// data/ioexam02.txt 파일의 내용을 data/a/b로 복사
	// FileUtil.copy("data/ioexam02.txt", "data/a/b");
	
	}
	catch(Exception e){
		System.out.println("파일 복사 중 오류 발생");
	}
}
	
}
