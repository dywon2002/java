package kr.co.mlec.day13;

class Data{
	int no;
	Data(int no){
		this.no = no;
	}
//	public String toString(){
//		return String.valueOf(no);
//	}
}

public class MyListTest {

	public static void main(String[] args) {
		
		MyList list = new MyList(2);
		
		list.add(new Data(1));
		list.add(new Data(2));
		list.add(new Data(3));
		list.add(1);
		
		/*
		 * list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		*/
		list.remove(1);

//		int len = list.size();
		
		for(int i = 0;i<list.size();i++){
			Object obj=list.get(i);
			System.out.println(obj); // 객체가 생성돼서 바로 찍으면 toString 메소드를 반환한다
//			System.out.println(obj.toString());
//			System.out.println(list.get(i));
		}
		
	}

}
