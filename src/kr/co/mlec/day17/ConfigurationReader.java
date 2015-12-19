package kr.co.mlec.day17;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ConfigurationReader{
	String fName;
	char comment;
	String delm;
	HashMap<String, String> map;

	public ConfigurationReader(String fName){
		this.fName = fName;
		this.comment = '#';
		this.delm = "=>";
		map = new HashMap<>();
	}

	public String getValue(String name) {
		return map.get(name);
	}

	public void parse() throws IOException {
		Scanner sc = new Scanner(new File(fName));
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			if(str.charAt(0)==comment){
				str = sc.nextLine();
			}
			String [] sArr = str.split(delm);
			map.put(sArr[0], sArr[1]);
			}
		}
		
	

	public static void main(String[] args) {
		ConfigurationReader cr = new ConfigurationReader("data/myserver.txt");
		try {
			cr.parse();
			System.out.println(cr.getValue("port"));
			System.out.println(cr.getValue("server"));
			System.out.println(cr.getValue("admin"));
		} catch (Exception e) {
		}
	}

}
