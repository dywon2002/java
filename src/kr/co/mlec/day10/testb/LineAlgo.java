package kr.co.mlec.day10.testb;

class Line{
	
	void getNo(int ran){
		
		Students s = new Students();
		
		int [] list = new int[ran];
		for(int i=1;i<=list.length;i++){
			int ran2 = (int) ((Math.random()*i) -1);
			list[i] = ran2;
		}
	}

}

class Students{
	int card = 0;
	
}


public class LineAlgo {

	public static void main(String[] args) {

		int ran = (int) ((Math.random()*10) +1);
		System.out.println("학생의 수 : "+ran);
		
	}

}
