package kr.co.mlec.day15.exam;

import java.io.File;

public class Exam02 {

	private static void showFileInfoByExt(String dir,String ext){
		
		File f = new File(dir);
		
		String [] fArr = ext.split(",");
		
		System.out.println(f.getPath()+" 밑에 "+ext+" 확장자를 가진 파일 목록");
		System.out.println("--------------");
		String [] fList = f.list();
		for(String name : fList){
			if(name.endsWith("."+fArr[0])|name.endsWith("."+fArr[1])){
			System.out.println(name);
			}
		}
		System.out.println("--------------");
		
	}
	
	
	public static void main(String[] args) {
		/*
		 *  data 폴더 밑에 있는 파일 중에서 확장자가 avi 파일만 화면에 출력
		 */
		showFileInfoByExt("data","avi");
		showFileInfoByExt("data","avi,txt");
	}

}
