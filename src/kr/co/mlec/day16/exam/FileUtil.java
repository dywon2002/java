package kr.co.mlec.day16.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	
	void copy(){}
	
	static void copy(String a,String b){
		
		// b -> data/a/b/ioexam01.txt
		File f = new File(b);

		if(f.isDirectory()){
			File oFile = new File(a);
			b+="/" + oFile.getName();
		}
		else{
			File dir = new File(f.getParent());
			dir.mkdirs();
		}
		
		
//		if(dir.exists()){
//			System.out.println("디렉토리가 존재합니다");	
//		}
//		else{
//		dir.mkdirs();
//		}
		
		
		try(
				// DataInputStream, DataOutputStream은 기본형 값을 출력할때 쓴다,
				// dos.writeUTF나 dos.writeInt 같은 메소드 활용
				FileInputStream fis = new FileInputStream(a);
				BufferedInputStream dis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(b); 
				BufferedOutputStream dos = new BufferedOutputStream(fos);
				){
			
			while(true){
				int c = fis.read();
				if(c==-1)break;
				fos.write(c);
			}
			
		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		
	}
	
	
}


