package kr.co.mlec.day12;

public class MyList {
	
	private String [] arr;
	private int pos=0;
	
	public MyList(int size) {
		arr = new String[size];
	}

	public void add(String data){
		arr[pos++] = data;
		
	}
	
	public String get(int index) throws InvalidIndexException{
		
		if(pos <= index){ // 런타임은 따로 try catch를 안 해도된다
			throw new InvalidIndexException(index);
		}
		
		return arr[index];
	}
}
