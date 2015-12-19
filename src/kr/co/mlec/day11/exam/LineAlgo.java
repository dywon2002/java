package kr.co.mlec.day11.exam;
class Line{
	
	void getNo(int ran){
		
		int [] stuList = new int[ran];
		int [] stuList2=new int[ran];
		int temp = 0;
		
		for(int i=1;i<=stuList.length;i++){
			int ran2 = (int) ((Math.random()*i) );
			stuList[i-1] = ran2;
			System.out.print(stuList[i-1]+" ");
		}
		System.out.println();
	
		  for (int i = 0; i < stuList.length; i++)
		    {
		        stuList2[i] = i + 1;
		 
		        for (int j = 0; j < stuList[i]; j++)
		        {
		            temp = stuList2[i - j - 1];
		            stuList2[i - j - 1] = stuList2[i - j];
		            stuList2[i - j] = temp;
		        }
		    }
		 
		    for (int i = 0; i < stuList.length; i++)
		    {
		    	System.out.print(stuList2[i]+" ");
		    }
	}
}
public class LineAlgo {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int ran = (int) ((Math.random()*100) +1);
		System.out.println("학생의 수 : "+ran);
		
		Line l = new Line();
		
		l.getNo(ran);
	}

}
