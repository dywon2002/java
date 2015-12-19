/*
 * 
 */


package kr.co.mlec.day14;

import kr.co.mlec.day13.InvalidIndexException;

// <파라미터> : T, K, V, E 일방적인 용어


public class MyGenericList<E> {
	private Object [] arr;
	private int pos=0;

	public MyGenericList() {
		arr = new Object[2];
	}
	/*
	 * 1. 입력 되기 전에 크기를 체크한다
	 * 2. 새로운 확장된 배열을 생성한다
	 * 3. 기존 배열의 내용을 새롭게 생성한 배열에 복사한다
	 * 4. 기존 배열의 참조를 새롭게 생성한 배열로 변경한다
	 */



	public MyGenericList(int i) {
		// TODO 자동 생성된 생성자 스텁
		arr = new Object[i];
	}





	public void add(E data){
		// 배열의 크기와 입력된 데이터의 크기가 같을 때
		if(arr.length==pos){
			Object [] temp = new Object[arr.length*2];
			System.arraycopy(arr, 0, temp, 0, arr.length); // 기존 배열을 새 배열로 이동
			arr=temp;
		}
		arr[pos++] = data; // 공간을 만든 다음에 실제 데이터를 입력한다
	}

	/*
	 * 삭제 성공시 true
	 * 삭제 실패 시 false
	 * 
	 * 삭제 실패 경우
	 * 1. index 번호가 0보다 작을 경우
	 * 2. index 번호가 pos보다 크거나 같을경우
	 */

	public boolean remove(int index){
		if(index<0||index>=pos) return false;
		
		int numMoved=pos-index-1;
		
			if(numMoved > 0){
				System.arraycopy(arr,index+1,arr,index,numMoved);
			}
			arr[--pos]=null;
		
		return true;
	}

	public int size(){
		return pos;
	}

	public E get(int index) throws InvalidIndexException{
		
		if(pos <= index){ // 런타임은 따로 try catch를 안 해도된다
			throw new InvalidIndexException(index);
		}
		
		return (E)arr[index];
	}
	}




