/*
 * File 클래스
 * - 파일 자체의 내용이 아닌 파일의 정보를 얻을 수 있다
 * - 
 */

package kr.co.mlec.day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam11 {
	public static void main(String[] args) throws Exception {
		// 파일명 또는 디렉토리명을 생성자에 넣어준다
		// 반드시 존재할 필요는 없다 : data/ioexam10.txt
		//File f = new File("data/ioexam10.txt");
//		File f = new File("data/2015/12/04");
		File f = new File("data");
		
		System.out.println(f.getPath());
		System.out.println("--------------");
		String [] fList = f.list();
		for(String name : fList){
			System.out.println(name);
		}
		System.out.println("--------------");
		
//		// 디렉토리를 생성
//		System.out.println((f.mkdirs()?"디렉토리 생성":"생성 실패"));
//		// mkdir 하면 폴더를 하나만 만들수 있고 여러개를 만드려면 mkdirs로 적어야한다
//		
//		System.out.println(f.isFile()?"파일이다":"파일이 아니다");
//		System.out.println(f.isDirectory()?"디렉토리이다":"디렉토리가 아니다");

		
		
		
		/*
		if(f.exists()){ // f가 가리키는 파일이 존재하면 true, 그렇지 않으면 false
			System.out.println("존재함");
			
			// 파일의 바이트 크기 가져오기
			long len = f.length(); // 파일의 사이즈가 워낙 크다보니 long 타입으로 반환한다 int는 21억까지만
			System.out.println("파일의 사이즈 : "+len);
			
			String name = f.getName(); // 파일 경로의 맨 끝을 반환,ioexam10.txt
			String path = f.getPath(); // 전체 경로를 반환
			String parent = f.getParent(); // data
			System.out.println("name : "+name);
			System.out.println("path : "+path);
			System.out.println("parent : "+parent);
			
			long time =f.lastModified(); // 마지막 수정한 시간 정보
			System.out.println("time : "+time);
			
			Date d = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sTime = sdf.format(d);
			System.out.println("마지막 수정 시간 : "+sTime);

			System.out.println(f.canRead()?"읽기 가능":"읽기 불가능");
			System.out.println(f.canWrite()?"쓰기 가능":"쓰기 불가능");
			
		}else{
			System.out.println("존재하지않음");
			if(f.createNewFile()){ // 존재하지 않으면 f에 파일을 생성한다
				System.out.println("파일 생성이 성공");
				
			}else{
				System.out.println("파일 생성이 실패");
			}
		}
		*/
		
	}
}
