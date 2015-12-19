package kr.co.mlec.day20;

public class LoginParsing {
	public static LoginVO parsing(String sLine){
		LoginVO login = new LoginVO();
		String param = sLine.split(" ")[1].split("\\?")[1];
		// sLine -> GET / login?id=aaa&pass=1234 HTTP/1.1
		// sLine.split(" ") ->
		// 				0 : GET
		//				1 : /login?id=aaa&pass=1234
		//				2 : HTTP/1.1
		// sLine.split(" ")[1] ->
		//				/login?id=aaa&pass=1234
		// sLine.split(" ")[1].split("?") ->
		//				0 : /login
		//				1 : id=aaa&pass=1234
		// sLine.split(" ")[1].split("?")[1] ->
		//				id=aaa&pass=1234
		
		// 0 : id=aaa
		// 1 : pass=1234
		String [] params = param.split("&");
		for(String p : params){
			// pArr[0] : 파라미터 이름(id,pass)
			// pArr[1] : 파라미터 값(aaa,1234)
			String [] pArr = p.split("=");
			
			switch(pArr[0]){
			case "id" : login.setId(pArr[1]); break;
			case "pass" : login.setPass(pArr[1]); break;
			}
		
		}
		return login;
	}
}
